package controllers

import javax.inject.Inject
import models.{Global, User, UserDao}
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._

class LoginController @Inject()(cc: MessagesControllerComponents,
                                userDao: UserDao
                              ) extends MessagesAbstractController(cc) {

    private val logger = play.api.Logger(this.getClass)

    val form: Form[User] = Form(
        mapping(
            "username" -> nonEmptyText
              .verifying("Too few characters", s => lengthIsGreaterThanNCharacters(s, 2))
              .verifying("Too few characters", s => lengthIsLessThanNCharacters(s, 20)),
            "password" -> nonEmptyText
              .verifying("Too few characters", s => lengthIsGreaterThanNCharacters(s, 2))
              .verifying("Too few characters", s => lengthIsLessThanNCharacters(s, 30)),
            "tag" -> text
        )(User.apply)(User.reverseApply)
    )

    private val formSubmitUrl = routes.LoginController.processLoginAttempt

    def showLoginForm: Action[AnyContent] = Action {
        implicit request: MessagesRequest[AnyContent] =>
            Ok(views.html.userLogin(form, formSubmitUrl))
    }

    def processLoginAttempt: Action[AnyContent] = Action {
        implicit request: MessagesRequest[AnyContent] =>
            val errorFunction = { (formWithErrors: Form[User]) =>
                // form validation/binding failed...
                println("f1")
                BadRequest(views.html.userLogin(formWithErrors, formSubmitUrl))
            }

            val successFunction = { (user: User) =>
                // form validation/binding succeeded ...
                val foundUser: Boolean = userDao.lookupUser(user)
                if foundUser then{
                    Redirect(routes.MainPageController.showSharePicture())
                      .flashing("INFO" -> "You are logged in.")
                      .withSession(Global.SESSION_USERNAME_KEY -> user.username,
                                   Global.SESSION_TAG_KEY      -> user.tag)
                }
                else{
                    Redirect(routes.LoginController.showLoginForm)
                      .flashing("ERROR" -> "Invalid username/password.")
                }
            }
            val formValidationResult: Form[User] = form.bindFromRequest()
            formValidationResult.fold(
                errorFunction,
                successFunction
            )
    }

    private def lengthIsGreaterThanNCharacters(s: String, n: Int): Boolean =
        s.length > n

    private def lengthIsLessThanNCharacters(s: String, n: Int): Boolean =
        s.length < n

}
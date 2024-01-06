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

    /**
     * Form definition for user data.
     */
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

    /**
     * This function renders the login form view, passing the form and form submission URL.
     */
    def showLoginForm: Action[AnyContent] = Action {
        implicit request: MessagesRequest[AnyContent] =>
            Ok(views.html.userLogin(form, formSubmitUrl))
    }

    /**
     * The function handles the login attempt by a user:
     *
     *  - The first part of the function validates form data submitted by the user.
     *  - Then it redirects based on validation success or failure:
     *      - If the user is found in the userDao, it redirects to the main page with a success flash message and stores user session information.
     *      - If the user is not found or the login credentials are invalid, it redirects back to the login form with an error flash message.
     */
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
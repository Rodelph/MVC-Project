package controllers

import javax.inject.Inject
import models.{Global, User, UserDao}
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._

class SignUpController @Inject()(
                                cc: MessagesControllerComponents,
                                userDao: UserDao
                              ) extends MessagesAbstractController(cc) {

  private val logger = play.api.Logger(this.getClass)

  val formSignUp: Form[User] = Form(
    mapping(
      "username" -> nonEmptyText
        .verifying("Too few characters", s => lengthIsGreaterThanNCharacters(s, 2))
        .verifying("Too few characters", s => lengthIsLessThanNCharacters(s, 20)),
      "password" -> nonEmptyText
        .verifying("Too few characters", s => lengthIsGreaterThanNCharacters(s, 2))
        .verifying("Too few characters", s => lengthIsLessThanNCharacters(s, 30)),
      "tag" -> nonEmptyText
        .verifying("Too few characters", s => lengthIsGreaterThanNCharacters(s, 2))
        .verifying("Too few characters", s => lengthIsLessThanNCharacters(s, 30)),
    )(User.apply)(User.reverseApply)
  )

  private val formSubmitUrlSignup = routes.SignUpController.processSignUpAttempt

  def showSignUpForm: Action[AnyContent] = Action {
    implicit request: MessagesRequest[AnyContent] =>
      Ok(views.html.signup(formSignUp, formSubmitUrlSignup))
  }

  def processSignUpAttempt: Action[AnyContent] = Action {
    implicit request: MessagesRequest[AnyContent] =>
      val errorFunctionSignup = { (formWithErrors: Form[User]) =>
        // form validation/binding failed...
        BadRequest(views.html.signup(formWithErrors, formSubmitUrlSignup))
      }
      val successFunctionSignup = { (user: User) =>
        // form validation/binding succeeded ...
        val foundTag: Boolean = userDao.lookUpTag(user)
        if !foundTag then
          val foundUser: Boolean = userDao.lookupUser(user)
          if foundUser then
            Redirect(routes.LoginController.showLoginForm).flashing("ERROR" -> "User Already Exists. Please log in !")
          else
            userDao.addUser(user.username, user.password, user.tag)
            print(userDao.users)
            Redirect(routes.LoginController.showLoginForm)
              .flashing("NOTIFY" -> "User added !")
        else
          Redirect(routes.SignUpController.showSignUpForm).flashing("ERROR" -> "The tag already exists")
    }
      val formValidationResult: Form[User] = formSignUp.bindFromRequest()
      formValidationResult.fold(
        errorFunctionSignup,
        successFunctionSignup
      )
  }

  private def lengthIsGreaterThanNCharacters(s: String, n: Int): Boolean =
  // should compare s to n
    true

  private def lengthIsLessThanNCharacters(s: String, n: Int): Boolean =
  // should compare s to n
    true

}

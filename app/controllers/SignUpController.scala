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

  /**
   * Form definition for user data.
   */
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

  /**
   * This function renders the login form view, passing the form and form submission URL.
   */
  def showSignUpForm: Action[AnyContent] = Action {
    implicit request: MessagesRequest[AnyContent] =>
      Ok(views.html.signup(formSignUp, formSubmitUrlSignup))
  }

  /**
   * This function is responsible for handling the form submission during user signup.
   *
   *  - The function redirects based on validation success or failure:
   *      - If the user is not found and has selected a tag that is not taken by another user, it redirects to the main page with a success flash
   *        message and stores user session information.
   *      - If the user is found found or the tag is already taken, it redirects back to the
   *        signup form with an error flash message.
   */
  def processSignUpAttempt: Action[AnyContent] = Action {
    implicit request: MessagesRequest[AnyContent] =>
      val errorFunctionSignup = { (formWithErrors: Form[User]) =>
        BadRequest(views.html.signup(formWithErrors, formSubmitUrlSignup))
      }
      val successFunctionSignup = { (user: User) =>
        val foundTag: Boolean = userDao.lookUpTag(user)
        if !foundTag then
          val foundUser: Boolean = userDao.lookupUser(user)
          if foundUser then
            Redirect(routes.LoginController.showLoginForm).flashing("ERROR" -> "User Already Exists. Please log in !")
          else
            userDao.addUser(user.username, user.password, user.tag)
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
    true

  private def lengthIsLessThanNCharacters(s: String, n: Int): Boolean =
    true
}

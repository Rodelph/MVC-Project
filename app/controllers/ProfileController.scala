package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class ProfileController @Inject()(cc: ControllerComponents, authenticatedUserAction: AuthenticatedUserAction) extends AbstractController(cc) {

  /**
   * This function renders the user profile.
   */
  def showProfile(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      val img = "assets/res/users/149071.png"
      Ok(views.html.profile(img))
  }
}
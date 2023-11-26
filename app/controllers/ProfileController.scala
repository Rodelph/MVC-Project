package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class ProfileController @Inject()(cc: ControllerComponents, authenticatedUserAction: AuthenticatedUserAction) extends AbstractController(cc) {
  // this is where the user comes immediately after logging in.
  // notice that this uses `authenticatedUserAction`.

  def showProfile(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      val img = "assets/res/users/149071.png"
      Ok(views.html.profile(img))
  }
}
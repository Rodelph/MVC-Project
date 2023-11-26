package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class AuthenticatedUserController @Inject()(
    cc: ControllerComponents,
    authenticatedUserAction: AuthenticatedUserAction
) extends AbstractController(cc) {

    def logout: Action[AnyContent] = authenticatedUserAction {
        implicit request: Request[AnyContent] =>
        // docs: “withNewSession ‘discards the whole (old) session’”
        Redirect(routes.LoginController.showLoginForm)
            .flashing("INFO" -> "You are logged out.")
            .withNewSession
    }
}

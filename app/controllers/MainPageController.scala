package controllers

import models.DataDAO
import javax.inject.*
import play.api.mvc.{Action, *}

@Singleton
class MainPageController @Inject()(cc: MessagesControllerComponents,
                                   dataDao: DataDAO,
                                   authenticatedUserAction: AuthenticatedUserAction
                                      ) extends AbstractController(cc) {

  def showSharePicture(): Action[AnyContent] = authenticatedUserAction { implicit request: Request[AnyContent] =>
    Ok(views.html.mainpage(dataDao.getDataMap))
  }
}
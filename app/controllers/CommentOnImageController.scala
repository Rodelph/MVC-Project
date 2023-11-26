package controllers

import models.{DataDAO, DataMap}

import javax.inject.*
import play.api.mvc.*

@Singleton
class CommentOnImageController @Inject()(cc: ControllerComponents,
                                   dataDao: DataDAO,
                                   authenticatedUserAction: AuthenticatedUserAction
                                  ) extends AbstractController(cc) {

  def showCommentImage(id: Int): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      var cache: DataMap = null
      for (data <- dataDao.getDataMap)
          if (data.pictureID == id)
            cache = data

      Ok(views.html.comment(cache))
  }
}

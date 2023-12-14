package controllers

import models.{DataDAO, DataMap}
import play.api.data.Form
import play.api.data.Forms.{nonEmptyText, text}
import play.api.libs.Files.TemporaryFile

import javax.inject.*
import play.api.mvc.*

import scala.xml.Comment

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

  def submitComment(username: String, pictureID: Int): Action[AnyContent] = authenticatedUserAction {
    implicit request =>
      val commentForm = Form("commentText" -> nonEmptyText)
      commentForm.bindFromRequest().fold(
        // Handle form errors
        errorForm => {
          BadRequest("Invalid form data")
        }, commentText => {

          dataDao.addComment(commentText, username, pictureID)
          Redirect(routes.CommentOnImageController.showCommentImage(pictureID))
            .flashing("success" -> "Comment submitted successfully")
        }
    )
  }

  def submitLikeToImage(username: String, pictureID : Int) : Action[AnyContent] = authenticatedUserAction {
    implicit request : Request[AnyContent] =>
      dataDao.addLikeUser(username, pictureID)
      Redirect(routes.CommentOnImageController.showCommentImage(pictureID))
        .flashing("success" -> "Image liked successfully")
  }
}

package controllers

import models.{DataDAO, DataMap}
import play.api.data.Form
import play.api.data.Forms.nonEmptyText
import javax.inject.*
import play.api.mvc.*

@Singleton
class CommentOnImageController @Inject()(cc: ControllerComponents,
                                   dataDao: DataDAO,
                                   authenticatedUserAction: AuthenticatedUserAction
                                  ) extends AbstractController(cc) {

  /**
   * Retrieves data associated with a specific image ID and renders a view for commenting on that image.
   */
  def showCommentImage(id: Int): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      var cache: DataMap = null
      for (data <- dataDao.getDataMap)
          if (data.pictureID == id)
            cache = data

      Ok(views.html.comment(cache))
  }

  /**
   * This function handles submission of comments for an image. Validates a non-empty text comment, adds it to the data, and redirects back to the image view.
   */
  def submitComment(username: String, pictureID: Int): Action[AnyContent] = authenticatedUserAction {
    implicit request =>
      val commentForm = Form("commentText" -> nonEmptyText)
      commentForm.bindFromRequest().fold(
        errorForm => {
          Redirect(routes.CommentOnImageController.showCommentImage(pictureID))
            .flashing("Failure" -> "Comment not submitted successfully")
        }, commentText => {

          dataDao.addComment(commentText, username, pictureID)
          Redirect(routes.CommentOnImageController.showCommentImage(pictureID))
            .flashing("success" -> "Comment submitted successfully")
        }
    )
  }

  /**
   * This function handles submission of a 'like' for an image by a user. It adds the user's like to the image data and redirects back to the image view.
   */
  def submitLikeToImage(username: String, pictureID : Int) : Action[AnyContent] = authenticatedUserAction {
    implicit request : Request[AnyContent] =>
      dataDao.addLikeUser(username, pictureID)
      Redirect(routes.CommentOnImageController.showCommentImage(pictureID))
        .flashing("success" -> "Image liked successfully")
  }
}

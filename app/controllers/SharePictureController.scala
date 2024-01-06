package controllers

import models.DataDAO
import java.io.File
import javax.inject.*
import play.api.mvc.*
import play.api.libs.Files.TemporaryFile
import play.api.libs.Files.TemporaryFileCreator


@Singleton
class SharePictureController @Inject()( cc: ControllerComponents,
                                        temporaryFileCreator: TemporaryFileCreator,
                                        authenticatedUserAction: AuthenticatedUserAction,
                                        dataDao: DataDAO
                                      ) extends AbstractController(cc) {

  /**
   * This function renders the share picture page where the user can upload page and comments.
   */
  def uploadPicture(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      Ok(views.html.uppicture())
  }

  /**
   * This function handles the uploading of a picture file along with additional information,
   * stores it in a specified directory, and adds its details to a data repository, likely for
   * display and management in the application.
   */
  def upPicture(): Action[MultipartFormData[TemporaryFile]] = Action(parse.multipartFormData) {
    implicit request =>
      request.body.file("picture").map { picture =>
        val filename = picture.filename
        val temporaryFile = picture.ref
        val imageDir = "public/res/feed/"
        val fileDestination = new File(imageDir + filename)
        temporaryFile.moveTo(fileDestination, replace = true)
        val pictureInfo = request.body.dataParts.get("pictureInfo").flatMap(_.headOption).getOrElse("")
        dataDao.addSharedPicture(request.session.get("username").get,
                                   fileDestination.toString,
                                   pictureInfo)
        Redirect(routes.MainPageController.showSharePicture()).flashing("success" -> "File uploaded successfully!")
      }.getOrElse {
        Redirect(routes.SharePictureController.uploadPicture()).flashing("error" -> "No file uploaded!")
      }
  }
}
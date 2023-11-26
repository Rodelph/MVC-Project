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

  def uploadPicture(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      Ok(views.html.uppicture())
  }

  def upPicture(): Action[MultipartFormData[TemporaryFile]] = Action(parse.multipartFormData) {
    implicit request =>
      request.body.file("picture").map { picture =>
        val filename = picture.filename
        val temporaryFile = picture.ref

        // Handle picture upload - move the file to the desired location
        val imageDir = "public/res/feed/"
        val fileDestination = new File(imageDir + filename)
        temporaryFile.moveTo(fileDestination, replace = true)

        // Retrieve text information from the form
        val pictureInfo = request.body.dataParts.get("pictureInfo").flatMap(_.headOption).getOrElse("")

        dataDao.addSharedPicture(request.session.get("username").get,
                                   fileDestination.toString,
                                   pictureInfo)

        // Handle further processing or redirection
        Redirect(routes.MainPageController.showSharePicture()).flashing("success" -> "File uploaded successfully!")
      }.getOrElse {
        Redirect(routes.SharePictureController.uploadPicture()).flashing("error" -> "No file uploaded!")
      }
  }
}
package controllers

import models.DataDAO
import javax.inject.*
import play.api.mvc.{Action, *}

@Singleton
class MainPageController @Inject()(cc: MessagesControllerComponents,
                                   dataDao: DataDAO,
                                   authenticatedUserAction: AuthenticatedUserAction
                                      ) extends AbstractController(cc) {

  def showSharePicture(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      Ok(views.html.mainpage(dataDao.getDataMap))
  }

  def sortByDate(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      // Implement sorting logic by date here
      // Fetch sorted data from your data source
      val sortedByDateData = dataDao.sortImagesByDates()
      // Pass sorted data to the view and render it
      Ok(views.html.mainpage(sortedByDateData))
  }

  def sortByLikes(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      // Implement sorting logic by likes here
      // Fetch sorted data from your data source
      val sortedByLikesData = dataDao.sortImagesByLikes()

      // Pass sorted data to the view and render it
      Ok(views.html.mainpage(sortedByLikesData))
  }

}
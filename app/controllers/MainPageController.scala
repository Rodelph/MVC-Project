package controllers

import models.DataDAO
import javax.inject.*
import play.api.mvc.{Action, *}

@Singleton
class MainPageController @Inject()(cc: MessagesControllerComponents,
                                   dataDao: DataDAO,
                                   authenticatedUserAction: AuthenticatedUserAction
                                      ) extends AbstractController(cc) {

  /**
   * Renders the main page to display pictures by fetching data from dataDao.getDataMap().
   */
  def showSharePicture(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      Ok(views.html.mainpage(dataDao.getDataMap))
  }

  /**
   * The function handles sorting images by date. It does it by:
   *  - Retrieving data sorted by date from the dataDao.
   *  - Passing the sorted data to the view to display images sorted by date.
   */
  def sortByDate(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      val sortedByDateData = dataDao.sortImagesByDates()
      Ok(views.html.mainpage(sortedByDateData))
  }

  /**
   * Handles sorting images by likes. It does that by:
   *  - Retrieving data sorted by likes from the dataDao.
   *  - Passing the sorted data to the view to display images sorted by likes.
   */
  def sortByLikes(): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      val sortedByLikesData = dataDao.sortImagesByLikes()
      Ok(views.html.mainpage(sortedByLikesData))
  }
}
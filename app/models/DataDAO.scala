package models

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@javax.inject.Singleton
class DataDAO @Inject()():

  private var dataMap: Seq[DataMap] = Seq.empty[DataMap]
  private var id: Int = 0

  /**
   * This function creates a picture instance 'DataMap' that stores the path to the picture in our database (Picture folders), and
   * also takes the username, description of the picture, id, and an empty Map that is used to store the users and their comments for
   * this image instance and a Sequence of empty Maps for users and a boolean (if they liked an image or not).
   */
  def addSharedPicture(owner: String, pictureLink: String, description: String):  Unit =
    val linkModified = pictureLink.replace("public/", "/assets/")
    val dataShared = DataMap(owner, linkModified, id, description, Map.empty[String, List[String]], Seq(Map.empty[String, Boolean]))
    dataMap = dataMap :+ dataShared
    id = id + 1

  def getDataMap: Seq[DataMap] = dataMap

  /**
   *  Adds comment to the picture instance and stores it in the Map.
   *  If the picture instance has no comment on it. It stores and that's it.
   *  If the picture instance already has comments then we search if the user has already posted
   *  a previous comment :
   *    - If he did, we append the comment to the list of comment to that specific user
   *    - Otherwise we add a new Map for the user who is commenting for the first time.
   */
  def addComment(newComment: String, username: String, id: Int): Unit = {
    for (data <- dataMap) {
      if (data.pictureID == id) {
        if (data.commentShared.isEmpty) {
          data.commentShared = Map(username -> List(newComment))
        } else {
          if (data.commentShared.contains(username))
            data.commentShared = data.commentShared.updated(username, data.commentShared(username).appended(newComment))
          else
            data.commentShared = data.commentShared + (username -> List(newComment))
        }
      }
    }
  }

  /**
   * This function takes a username and an imageID as parameters and updates the likes for a particular image associated
   * with the given imageID. The function works as follow :
   *
   * - The function iterates through dataMap to find the image with the specified imageID.
   * - Upon finding the image, it checks if the user (username) has already liked the image by checking likesPerUser.
   *    - If the user has already liked the image (userLiked is true), it removes their like from likesPerUser.
   *    - If the user hasn't liked the image, it adds their like to likesPerUser.
   * - Finally, it updates the total likes count for the image by calling countLikesForImage.
   */
  def addLikeUser(username: String, imageID: Int): Unit = {
    for (data <- dataMap) {
      if (data.pictureID == imageID) {
        val userLiked = data.likesPerUser.exists(_.contains(username))

        data.likesPerUser = if (userLiked) {
          data.likesPerUser.map { map =>
            if (map.contains(username)) {
              map - username
            } else {
              map
            }
          }
        } else {
          data.likesPerUser :+ Map(username -> true) // Add the user's like
        }
        data.likes = countLikesForImage(data.pictureID)
      }
    }
  }

  /**
   * Helper function for the addLikeUser.
   */
  private def countLikesForImage(imageID: Int): Int = {
    dataMap.collect {
      case data if data.pictureID == imageID =>
        data.likesPerUser.flatten.count(_._2)
    }.sum
  }

  /**
   * Helper function for the sortImagesByDates.
   */
  private def convertToComparable(dateTime: String): LocalDateTime = {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime.parse(dateTime, formatter)
  }

  /**
   * This function sorts the DataMap by date in order to be displayed later when we select sort by date in the mainpage.
   */
  def sortImagesByDates() : Seq[DataMap] = {
    val sortedByDate: Seq[DataMap] = dataMap.sortBy(dataMap => convertToComparable(dataMap.date.toString)).reverse

    sortedByDate
  }

  /**
   * This function sorts the DataMap by like in order to be displayed later when we select sort by like in the mainpage.
   */
  def sortImagesByLikes() : Seq[DataMap] = {
    val sortedByLikes: Seq[DataMap] = dataMap.sortBy(_.likes).reverse

    sortedByLikes
  }
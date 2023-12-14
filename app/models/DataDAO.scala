package models

import akka.http.javadsl.model.DateTime
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import controllers.routes

import javax.inject.Inject

@javax.inject.Singleton
class DataDAO @Inject()():

  private var dataMap: Seq[DataMap] = Seq.empty[DataMap]
  private var id: Int = 0

  def addSharedPicture(owner: String, pictureLink: String, description: String):  Unit =
    val linkModified = pictureLink.replace("public/", "/assets/")
    val dataShared = DataMap(owner, linkModified, id, description, Map.empty[String, List[String]], Seq(Map.empty[String, Boolean]))
    dataMap = dataMap :+ dataShared
    id = id + 1

  def getDataMap: Seq[DataMap] = dataMap

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

  def addLikeUser(username: String, imageID: Int): Unit = {
    for (data <- dataMap) {
      if (data.pictureID == imageID) {
        val userLiked = data.likesPerUser.exists(_.contains(username))

        data.likesPerUser = if (userLiked) {
          data.likesPerUser.map { map =>
            if (map.contains(username)) {
              map - username // Remove the user's like if it exists
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

  private def countLikesForImage(imageID: Int): Int = {
    dataMap.collect {
      case data if data.pictureID == imageID =>
        data.likesPerUser.flatten.count(_._2)
    }.sum
  }

  // Convert DateTime to LocalDateTime for sorting
  private def convertToComparable(dateTime: String): LocalDateTime = {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime.parse(dateTime, formatter)
  }
  def sortImagesByDates() : Seq[DataMap] = {
    val sortedByDate: Seq[DataMap] = dataMap.sortBy(dataMap => convertToComparable(dataMap.date.toString)).reverse

    sortedByDate
  }

  def sortImagesByLikes() : Seq[DataMap] = {
    val sortedByLikes: Seq[DataMap] = dataMap.sortBy(_.likes).reverse

    sortedByLikes
  }
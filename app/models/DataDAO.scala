package models

import akka.http.javadsl.model.DateTime
import controllers.routes

import javax.inject.Inject

@javax.inject.Singleton
class DataDAO @Inject()():

  private var dataMap: Seq[DataMap] = Seq.empty[DataMap]
  private var id: Int = 0

  def addSharedPicture(owner: String, pictureLink: String, description: String):  Unit =
    val linkModified = pictureLink.replace("public/", "assets/")
    val dataShared = DataMap(owner, linkModified, id, description, Map.empty[String, List[String]])
    dataMap = dataMap :+ dataShared
    id = id + 1

  def getDataMap: Seq[DataMap] = dataMap
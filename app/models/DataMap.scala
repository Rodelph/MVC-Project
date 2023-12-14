package models

import akka.http.javadsl.model.DateTime

case class DataMap (owner: String,
                    pictureLink: String,
                    pictureID: Int,
                    description: String,
                    var commentShared: Map[String, List[String]],
                    var likesPerUser: Seq[Map[String, Boolean]],
                    var likes: Int = 0,
                    date: DateTime = DateTime.now())

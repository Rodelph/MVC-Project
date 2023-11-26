package models

import akka.http.javadsl.model.DateTime

case class DataMap (owner: String,
                    pictureLink: String,
                    pictureID: Int,
                    description: String,
                    commentShared: Map[String, List[String]], //Map[commenter, List[of all comments]]
                    likesCounter: Int = 0,
                    date: DateTime = DateTime.now())
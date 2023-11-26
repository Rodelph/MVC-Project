package models

case class User (username: String, password: String, tag: String)

object User:
  def reverseApply(user: User): Option[(String, String, String)] =
    Some(user.username, user.password, user.tag)
package models

import javax.inject.Inject
//import at.favre.lib.crypto.bcrypt

@javax.inject.Singleton
class UserDao @Inject()():

    var users: Seq[User] = Seq(
        User("user" ,"user" , "u1"),
    )
/*
    private def hashPassword(password: String) : String =
        val hashPass = bcrypt.BCrypt.withDefaults().hashToString(12, password.toCharArray)
        return hashPass
*/
    def lookupUser(user: User): Boolean =
        users.exists(u => u.username == user.username && u.password == user.password)

    def lookUpTag(user: User): Boolean =
        users.exists(u => u.tag == user.tag)

    def addUser(username: String, password: String, tag: String): Unit =
        val newUser = User(username, password, tag)
        users = users :+ newUser

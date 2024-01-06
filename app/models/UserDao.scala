package models

import javax.inject.Inject

@javax.inject.Singleton
class UserDao @Inject()():
    var users: Seq[User] = Seq(
        User("user" ,"user" , "u1"),
    )

    /**
     * Searches user if it exists in the sequence or not. (Not necessarely sice we are also storing the users in memory but i just kept it
     * for admin. Not that it achieves anything).
     */
    def lookupUser(user: User): Boolean =
        users.exists(u => u.username == user.username && u.password == user.password)

    /**
     * Searches the tag of the user in the sequence.
     */
    def lookUpTag(user: User): Boolean =
        users.exists(u => u.tag == user.tag)

    /**
     * Adds user to the sequence of users.
     */
    def addUser(username: String, password: String, tag: String): Unit =
        val newUser = User(username, password, tag)
        users = users :+ newUser

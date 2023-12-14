// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAuthenticatedUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticatedUserController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseCommentOnImageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def showCommentImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentOnImageController.showCommentImage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + (""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:34
    def submitComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentOnImageController.submitComment",
      """
        function(username0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upcomment/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0) + (""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
    // @LINE:36
    def submitLikeToImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentOnImageController.submitLikeToImage",
      """
        function(username0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0) + (""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def showProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.showProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseMainPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def showSharePicture: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainPageController.showSharePicture",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainpage"})
        }
      """
    )
  
    // @LINE:23
    def sortByDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainPageController.sortByDate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainpage+s+d"})
        }
      """
    )
  
    // @LINE:24
    def sortByLikes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainPageController.sortByLikes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainpage+s+l"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def showLoginForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.showLoginForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:17
    def processLoginAttempt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.processLoginAttempt",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doLogin"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseSharePictureController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def uploadPicture: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SharePictureController.uploadPicture",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadPage"})
        }
      """
    )
  
    // @LINE:28
    def upPicture: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SharePictureController.upPicture",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadPictures"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def showSignUpForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.showSignUpForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:13
    def processSignUpAttempt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.processSignUpAttempt",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doSignup"})
        }
      """
    )
  
  }


}

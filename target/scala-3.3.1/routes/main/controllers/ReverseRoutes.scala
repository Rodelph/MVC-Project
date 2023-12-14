// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:20
  class ReverseAuthenticatedUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def logout: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
  }

  // @LINE:32
  class ReverseCommentOnImageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def showCommentImage(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id))
    }
  
    // @LINE:34
    def submitComment(username:String, id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "upcomment/" + implicitly[play.api.mvc.PathBindable[String]].unbind("username", username) + implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id))
    }
  
    // @LINE:36
    def submitLikeToImage(username:String, id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "comment/" + implicitly[play.api.mvc.PathBindable[String]].unbind("username", username) + implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id))
    }
  
  }

  // @LINE:30
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def showProfile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
  }

  // @LINE:22
  class ReverseMainPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def showSharePicture(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mainpage")
    }
  
    // @LINE:23
    def sortByDate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mainpage+s+d")
    }
  
    // @LINE:24
    def sortByLikes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mainpage+s+l")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def showLoginForm: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:17
    def processLoginAttempt: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doLogin")
    }
  
  }

  // @LINE:26
  class ReverseSharePictureController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def uploadPicture(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "uploadPage")
    }
  
    // @LINE:28
    def upPicture(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "uploadPictures")
    }
  
  }

  // @LINE:12
  class ReverseSignUpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def showSignUpForm: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:13
    def processSignUpAttempt: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doSignup")
    }
  
  }


}

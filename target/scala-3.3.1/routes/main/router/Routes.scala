// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_8: controllers.HomeController,
  // @LINE:9
  Assets_7: controllers.Assets,
  // @LINE:12
  SignUpController_6: controllers.SignUpController,
  // @LINE:16
  LoginController_4: controllers.LoginController,
  // @LINE:20
  AuthenticatedUserController_1: controllers.AuthenticatedUserController,
  // @LINE:22
  MainPageController_3: controllers.MainPageController,
  // @LINE:26
  SharePictureController_5: controllers.SharePictureController,
  // @LINE:30
  ProfileController_0: controllers.ProfileController,
  // @LINE:32
  CommentOnImageController_2: controllers.CommentOnImageController,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_8: controllers.HomeController,
    // @LINE:9
    Assets_7: controllers.Assets,
    // @LINE:12
    SignUpController_6: controllers.SignUpController,
    // @LINE:16
    LoginController_4: controllers.LoginController,
    // @LINE:20
    AuthenticatedUserController_1: controllers.AuthenticatedUserController,
    // @LINE:22
    MainPageController_3: controllers.MainPageController,
    // @LINE:26
    SharePictureController_5: controllers.SharePictureController,
    // @LINE:30
    ProfileController_0: controllers.ProfileController,
    // @LINE:32
    CommentOnImageController_2: controllers.CommentOnImageController
  ) = this(errorHandler, HomeController_8, Assets_7, SignUpController_6, LoginController_4, AuthenticatedUserController_1, MainPageController_3, SharePictureController_5, ProfileController_0, CommentOnImageController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_8, Assets_7, SignUpController_6, LoginController_4, AuthenticatedUserController_1, MainPageController_3, SharePictureController_5, ProfileController_0, CommentOnImageController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignUpController.showSignUpForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doSignup""", """controllers.SignUpController.processSignUpAttempt"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.showLoginForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doLogin""", """controllers.LoginController.processLoginAttempt"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthenticatedUserController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mainpage""", """controllers.MainPageController.showSharePicture()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mainpage+s+d""", """controllers.MainPageController.sortByDate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mainpage+s+l""", """controllers.MainPageController.sortByLikes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadPage""", """controllers.SharePictureController.uploadPicture()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadPictures""", """controllers.SharePictureController.upPicture()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.showProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """id<.+>""", """controllers.CommentOnImageController.showCommentImage(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upcomment/""" + "$" + """username<.+>""" + "$" + """id<.+>""", """controllers.CommentOnImageController.submitComment(username:String, id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """username<.+>""" + "$" + """id<.+>""", """controllers.CommentOnImageController.submitLikeToImage(username:String, id:Int)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_8.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_SignUpController_showSignUpForm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignUpController_showSignUpForm2_invoker = createInvoker(
    SignUpController_6.showSignUpForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "showSignUpForm",
      Nil,
      "GET",
      this.prefix + """signup""",
      """ user signup""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SignUpController_processSignUpAttempt3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doSignup")))
  )
  private[this] lazy val controllers_SignUpController_processSignUpAttempt3_invoker = createInvoker(
    SignUpController_6.processSignUpAttempt,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "processSignUpAttempt",
      Nil,
      "POST",
      this.prefix + """doSignup""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_LoginController_showLoginForm4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_showLoginForm4_invoker = createInvoker(
    LoginController_4.showLoginForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "showLoginForm",
      Nil,
      "GET",
      this.prefix + """login""",
      """ user/admin login""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_LoginController_processLoginAttempt5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doLogin")))
  )
  private[this] lazy val controllers_LoginController_processLoginAttempt5_invoker = createInvoker(
    LoginController_4.processLoginAttempt,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "processLoginAttempt",
      Nil,
      "POST",
      this.prefix + """doLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_AuthenticatedUserController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthenticatedUserController_logout6_invoker = createInvoker(
    AuthenticatedUserController_1.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticatedUserController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """ pages for authenticated users""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_MainPageController_showSharePicture7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mainpage")))
  )
  private[this] lazy val controllers_MainPageController_showSharePicture7_invoker = createInvoker(
    MainPageController_3.showSharePicture(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainPageController",
      "showSharePicture",
      Nil,
      "GET",
      this.prefix + """mainpage""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_MainPageController_sortByDate8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mainpage+s+d")))
  )
  private[this] lazy val controllers_MainPageController_sortByDate8_invoker = createInvoker(
    MainPageController_3.sortByDate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainPageController",
      "sortByDate",
      Nil,
      "GET",
      this.prefix + """mainpage+s+d""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_MainPageController_sortByLikes9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mainpage+s+l")))
  )
  private[this] lazy val controllers_MainPageController_sortByLikes9_invoker = createInvoker(
    MainPageController_3.sortByLikes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainPageController",
      "sortByLikes",
      Nil,
      "GET",
      this.prefix + """mainpage+s+l""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SharePictureController_uploadPicture10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadPage")))
  )
  private[this] lazy val controllers_SharePictureController_uploadPicture10_invoker = createInvoker(
    SharePictureController_5.uploadPicture(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SharePictureController",
      "uploadPicture",
      Nil,
      "GET",
      this.prefix + """uploadPage""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_SharePictureController_upPicture11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadPictures")))
  )
  private[this] lazy val controllers_SharePictureController_upPicture11_invoker = createInvoker(
    SharePictureController_5.upPicture(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SharePictureController",
      "upPicture",
      Nil,
      "POST",
      this.prefix + """uploadPictures""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ProfileController_showProfile12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_showProfile12_invoker = createInvoker(
    ProfileController_0.showProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "showProfile",
      Nil,
      "GET",
      this.prefix + """profile""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CommentOnImageController_showCommentImage13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("id", """.+""",false)))
  )
  private[this] lazy val controllers_CommentOnImageController_showCommentImage13_invoker = createInvoker(
    CommentOnImageController_2.showCommentImage(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentOnImageController",
      "showCommentImage",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """comment/""" + "$" + """id<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_CommentOnImageController_submitComment14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upcomment/"), DynamicPart("username", """.+""",false), DynamicPart("id", """.+""",false)))
  )
  private[this] lazy val controllers_CommentOnImageController_submitComment14_invoker = createInvoker(
    CommentOnImageController_2.submitComment(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentOnImageController",
      "submitComment",
      Seq(classOf[String], classOf[Int]),
      "POST",
      this.prefix + """upcomment/""" + "$" + """username<.+>""" + "$" + """id<.+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:36
  private[this] lazy val controllers_CommentOnImageController_submitLikeToImage15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("username", """.+""",false), DynamicPart("id", """.+""",false)))
  )
  private[this] lazy val controllers_CommentOnImageController_submitLikeToImage15_invoker = createInvoker(
    CommentOnImageController_2.submitLikeToImage(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentOnImageController",
      "submitLikeToImage",
      Seq(classOf[String], classOf[Int]),
      "POST",
      this.prefix + """comment/""" + "$" + """username<.+>""" + "$" + """id<.+>""",
      """""",
      Seq("""nocsrf""")
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_8.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_SignUpController_showSignUpForm2_route(params@_) =>
      call { 
        controllers_SignUpController_showSignUpForm2_invoker.call(SignUpController_6.showSignUpForm)
      }
  
    // @LINE:13
    case controllers_SignUpController_processSignUpAttempt3_route(params@_) =>
      call { 
        controllers_SignUpController_processSignUpAttempt3_invoker.call(SignUpController_6.processSignUpAttempt)
      }
  
    // @LINE:16
    case controllers_LoginController_showLoginForm4_route(params@_) =>
      call { 
        controllers_LoginController_showLoginForm4_invoker.call(LoginController_4.showLoginForm)
      }
  
    // @LINE:17
    case controllers_LoginController_processLoginAttempt5_route(params@_) =>
      call { 
        controllers_LoginController_processLoginAttempt5_invoker.call(LoginController_4.processLoginAttempt)
      }
  
    // @LINE:20
    case controllers_AuthenticatedUserController_logout6_route(params@_) =>
      call { 
        controllers_AuthenticatedUserController_logout6_invoker.call(AuthenticatedUserController_1.logout)
      }
  
    // @LINE:22
    case controllers_MainPageController_showSharePicture7_route(params@_) =>
      call { 
        controllers_MainPageController_showSharePicture7_invoker.call(MainPageController_3.showSharePicture())
      }
  
    // @LINE:23
    case controllers_MainPageController_sortByDate8_route(params@_) =>
      call { 
        controllers_MainPageController_sortByDate8_invoker.call(MainPageController_3.sortByDate())
      }
  
    // @LINE:24
    case controllers_MainPageController_sortByLikes9_route(params@_) =>
      call { 
        controllers_MainPageController_sortByLikes9_invoker.call(MainPageController_3.sortByLikes())
      }
  
    // @LINE:26
    case controllers_SharePictureController_uploadPicture10_route(params@_) =>
      call { 
        controllers_SharePictureController_uploadPicture10_invoker.call(SharePictureController_5.uploadPicture())
      }
  
    // @LINE:28
    case controllers_SharePictureController_upPicture11_route(params@_) =>
      call { 
        controllers_SharePictureController_upPicture11_invoker.call(SharePictureController_5.upPicture())
      }
  
    // @LINE:30
    case controllers_ProfileController_showProfile12_route(params@_) =>
      call { 
        controllers_ProfileController_showProfile12_invoker.call(ProfileController_0.showProfile())
      }
  
    // @LINE:32
    case controllers_CommentOnImageController_showCommentImage13_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentOnImageController_showCommentImage13_invoker.call(CommentOnImageController_2.showCommentImage(id))
      }
  
    // @LINE:34
    case controllers_CommentOnImageController_submitComment14_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromPath[Int]("id", None)) { (username, id) =>
        controllers_CommentOnImageController_submitComment14_invoker.call(CommentOnImageController_2.submitComment(username, id))
      }
  
    // @LINE:36
    case controllers_CommentOnImageController_submitLikeToImage15_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromPath[Int]("id", None)) { (username, id) =>
        controllers_CommentOnImageController_submitLikeToImage15_invoker.call(CommentOnImageController_2.submitLikeToImage(username, id))
      }
  }
}


package views.html

import _root_.play.twirl.api.TwirlFeatureImports.*
import _root_.play.twirl.api.TwirlHelperImports.*
import scala.language.adhocExtensions
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(img: String)(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),_display_(/*3.2*/main("Profile Page", session)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

    """),format.raw/*5.5*/("""<div class="main-share-title">
        <h1>Profile Page</h1>
    </div>

    <div class="profile-container">
        <div class="profile-image">
            <img src=""""),_display_(/*11.24*/img),format.raw/*11.27*/("""" alt="Profile Image">
        </div>
        <div class="profile-info">
            <div>Username</div>
            <div><span class="tab"></span>"""),_display_(/*15.44*/session/*15.51*/.get(models.Global.SESSION_USERNAME_KEY).get),format.raw/*15.95*/("""</div>
                <!-- Add other user information here : Number of likes and comments-->
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(img:String,session:Session): play.twirl.api.HtmlFormat.Appendable = apply(img)(session)

  def f:((String) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (img) => (session) => apply(img)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/profile.scala.html
                  HASH: 9b174c510e3bc69dabe7548b4ce7bd399876b032
                  MATRIX: 777->1|912->69|940->72|977->101|1016->103|1048->109|1243->277|1267->280|1442->428|1458->435|1523->479
                  LINES: 22->1|27->1|29->3|29->3|29->3|31->5|37->11|37->11|41->15|41->15|41->15
                  -- GENERATED --
              */
          
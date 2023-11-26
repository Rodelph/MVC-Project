
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

object uppicture extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Upload Picture", session)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<div class="main-share-title">
        <h1>Upload Picture</h1>
    </div>

    """),_display_(/*8.6*/helper/*8.12*/.form(routes.SharePictureController.upPicture(), Symbol("enctype") -> "multipart/form-data")/*8.104*/ {_display_(Seq[Any](format.raw/*8.106*/("""

        """),format.raw/*10.9*/("""<div class="centered-textarea">
            <label for="picture-info">Information on the picture:</label>
            <textarea id="picture-info" name="pictureInfo"></textarea>
        </div>

        <div class="form-container">
            <input type="file" name="picture" class="upload-btn">
            <form action=""""),_display_(/*17.28*/routes/*17.34*/.SharePictureController.uploadPicture()),format.raw/*17.73*/("""" method="post" enctype="multipart/form-data">
                <input type="submit" value="Upload" class="upload-submit">
            </form>
        </div>
    """)))}),format.raw/*21.6*/("""
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(session:Session): play.twirl.api.HtmlFormat.Appendable = apply()(session)

  def f:(() => (Session) => play.twirl.api.HtmlFormat.Appendable) = () => (session) => apply()(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/uppicture.scala.html
                  HASH: e5f8dc432fa7386e21a4eda8fbb109afce4228ab
                  MATRIX: 772->1|895->31|922->33|961->64|1000->66|1031->71|1136->151|1150->157|1251->249|1291->251|1328->261|1678->584|1693->590|1753->629|1945->791|1977->793
                  LINES: 22->1|27->2|28->3|28->3|28->3|29->4|33->8|33->8|33->8|33->8|35->10|42->17|42->17|42->17|46->21|47->22
                  -- GENERATED --
              */
          
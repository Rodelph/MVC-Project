
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
        """),format.raw/*9.9*/("""<div class="centered-textarea">
            <label for="picture-info">Information on the picture:</label>
            <textarea id="picture-info" name="pictureInfo"></textarea>
        </div>

        <div class="form-container">
            <form action=""""),_display_(/*15.28*/routes/*15.34*/.SharePictureController.uploadPicture()),format.raw/*15.73*/("""" method="post" enctype="multipart/form-data">
                <input type="file" name="picture" class="upload-btn">
                <input type="submit" value="Upload" class="upload-submit">
            </form>
        </div>
    """)))}),format.raw/*20.6*/("""
""")))}),format.raw/*21.2*/("""
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
                  HASH: d6705ac6f1764f870137dee76cb8624866a593fd
                  MATRIX: 772->1|895->31|922->33|961->64|1000->66|1031->71|1136->151|1150->157|1251->249|1291->251|1326->260|1610->517|1625->523|1685->562|1947->794|1979->796
                  LINES: 22->1|27->2|28->3|28->3|28->3|29->4|33->8|33->8|33->8|33->8|34->9|40->15|40->15|40->15|45->20|46->21
                  -- GENERATED --
              */
          
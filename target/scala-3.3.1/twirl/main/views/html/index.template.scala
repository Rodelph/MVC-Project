
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(welcome: String)(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

  """),_display_(/*3.4*/main(welcome, session)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),_display_(/*4.6*/defining(play.core.PlayVersion.current)/*4.45*/ { version =>_display_(Seq[Any](format.raw/*4.58*/("""

      """),format.raw/*6.7*/("""<div id="content" class="wrapper doc">
        <article>
          <p class="main-page-title">
            Project Assignment 2 : Fake Facebook made by a better Zuckerburg (No ads included. For now...).
          </p>
          <p class="under-title">
            Project Made by : AMINE NAQI<br>
            Student ID : 0562497
          </p>
        </article>
      </div>
    """)))}),format.raw/*17.6*/("""
  """)))}))
      }
    }
  }

  def render(welcome:String,session:Session): play.twirl.api.HtmlFormat.Appendable = apply(welcome)(session)

  def f:((String) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (welcome) => (session) => apply(welcome)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 3745b0978b680c3d5646ac2c403b2fb9199e024a
                  MATRIX: 775->1|914->45|946->52|976->74|1015->76|1047->83|1094->122|1144->135|1180->145|1603->538
                  LINES: 22->1|27->1|29->3|29->3|29->3|30->4|30->4|30->4|32->6|43->17
                  -- GENERATED --
              */
          
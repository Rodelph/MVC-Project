
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

object comment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[DataMap,Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data: DataMap)(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/main("Comm Picture", session)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<div class="main-share-title">
        <h1>-- Fakebook --</h1>
    </div>

        <!-- Your HTML structure -->
    <div class="image-container">

        <div>
            <label>This picture was added at : """),_display_(/*12.49*/data/*12.53*/.date),format.raw/*12.58*/("""</label>
        </div>

        <div style="flex: 1; margin-right: 20px;">
            <label>Description : """),_display_(/*16.35*/data/*16.39*/.description),format.raw/*16.51*/("""</label>
        </div>

        <div class="image-block">
            """"),_display_(/*20.15*/data/*20.19*/.pictureLink),format.raw/*20.31*/(""""
            <img class="display-img" src=""""),_display_(/*21.44*/data/*21.48*/.pictureLink),format.raw/*21.60*/("""" alt="Image">
        </div>
            <!-- Comment Section -->
        <div class="comment-section">
                <!-- Display existing comments -->
            <div class="existing-comments">
                <h3>Comments:</h3>
                <p>User 1 : Cheap ass dog</p>
                <p>User 2 : Is he alive ?</p>
                <p>User 3 : Is he alive ?</p>
            </div>
        </div>

    </div>
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(data:DataMap,session:Session): play.twirl.api.HtmlFormat.Appendable = apply(data)(session)

  def f:((DataMap) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (data) => (session) => apply(data)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/comment.scala.html
                  HASH: 8511ab757cc9eab1aede0b9cfa0d71999398ca03
                  MATRIX: 778->1|915->71|943->74|980->103|1019->105|1050->110|1286->319|1299->323|1325->328|1462->438|1475->442|1508->454|1608->527|1621->531|1654->543|1726->588|1739->592|1772->604|2222->1024
                  LINES: 22->1|27->1|29->3|29->3|29->3|30->4|38->12|38->12|38->12|42->16|42->16|42->16|46->20|46->20|46->20|47->21|47->21|47->21|61->35
                  -- GENERATED --
              */
          
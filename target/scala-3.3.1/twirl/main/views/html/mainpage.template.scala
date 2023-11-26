
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

object mainpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[DataMap],Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dataDao: Seq[DataMap])(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""

"""),_display_(/*3.2*/main("Sharing Picture", session)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
    """),format.raw/*4.5*/("""<div class="main-share-title">
        <h1>-- Fakebook --</h1>
    </div>

        <!-- Your HTML structure -->
    <div class="image-container">
        """),_display_(/*10.10*/for(data <- dataDao) yield /*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
            """),format.raw/*11.13*/("""<div>
                <label>This picture was added at : """),_display_(/*12.53*/data/*12.57*/.date),format.raw/*12.62*/("""</label>
            </div>

            <div style="flex: 1; margin-right: 20px;">
                <label>Description : """),_display_(/*16.39*/data/*16.43*/.description),format.raw/*16.55*/("""</label>
            </div>

            <div class="image-block">
                """"),_display_(/*20.19*/data/*20.23*/.pictureLink),format.raw/*20.35*/(""""
                <img class="display-img" src=""""),_display_(/*21.48*/data/*21.52*/.pictureLink),format.raw/*21.64*/("""" alt="Image">
            </div>
                <!-- Comment Section -->
            <div class="comment-section">
                    <!-- Display existing comments -->
                <div class="existing-comments">
                    <h3>Comments:</h3>
                    <p>User 1 : Cheap ass dog</p>
                    <p>User 2 : Is he alive ?</p>

                    <p><a href=""""),_display_(/*31.34*/routes/*31.40*/.CommentOnImageController.showCommentImage(data.pictureID)),format.raw/*31.98*/("""">See More</a></p>
                </div>
            </div>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</div>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(dataDao:Seq[DataMap],session:Session): play.twirl.api.HtmlFormat.Appendable = apply(dataDao)(session)

  def f:((Seq[DataMap]) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (dataDao) => (session) => apply(dataDao)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mainpage.scala.html
                  HASH: 0d425921d4db16bbf595266d07f84e45a830a08c
                  MATRIX: 784->1|929->79|957->82|997->114|1036->116|1067->121|1249->276|1285->296|1325->298|1366->311|1451->369|1464->373|1490->378|1639->500|1652->504|1685->516|1797->601|1810->605|1843->617|1919->666|1932->670|1965->682|2385->1075|2400->1081|2479->1139|2580->1209|2612->1214|2650->1222
                  LINES: 22->1|27->1|29->3|29->3|29->3|30->4|36->10|36->10|36->10|37->11|38->12|38->12|38->12|42->16|42->16|42->16|46->20|46->20|46->20|47->21|47->21|47->21|57->31|57->31|57->31|60->34|61->35|62->36
                  -- GENERATED --
              */
          

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
    """),format.raw/*4.5*/("""<link rel="stylesheet" href="path/to/font-awesome/css/all.min.css">
    <div class="main-share-title">
        <h1>-- Fakebook --</h1>
        <label>This picture was added at : """),_display_(/*7.45*/data/*7.49*/.date),format.raw/*7.54*/(""" """),format.raw/*7.55*/("""and has """),_display_(/*7.64*/data/*7.68*/.likes),format.raw/*7.74*/(""" """),format.raw/*7.75*/("""likes.</label>
    </div>

    <div class="image-container">
        <div class="image-block">
            <div class="description">
                <label>Description : </label>
                <div class="description-text">"""),_display_(/*14.48*/data/*14.52*/.description),format.raw/*14.64*/("""</div>
            </div>

            """),_display_(/*17.14*/helper/*17.20*/.form(routes.CommentOnImageController.submitLikeToImage(session.get(models.Global.SESSION_USERNAME_KEY).get, data.pictureID), Symbol("enctype") -> "multipart/form-data")/*17.189*/ {_display_(Seq[Any](format.raw/*17.191*/("""
                """),format.raw/*18.17*/("""<form action=""""),_display_(/*18.32*/routes/*18.38*/.CommentOnImageController.submitLikeToImage(session.get(models.Global.SESSION_USERNAME_KEY).get, data.pictureID)),format.raw/*18.150*/("""" method="post" enctype="multipart/form-data">
                    <img class="display-img-2" src=""""),_display_(/*19.54*/data/*19.58*/.pictureLink),format.raw/*19.70*/("""" alt="Image">
                    <button class="like-button" type="submit" value="Submit"><i class="far fa-thumbs-up"></i>Like</button>
                </form>
            """)))}),format.raw/*22.14*/("""
                """),format.raw/*23.17*/("""<!-- Comment Section -->
            <div class="comment-section">
                    <!-- Display existing comments -->
                    <h3>Comments:</h3>
                    """),_display_(/*27.22*/for((key, values) <- data.commentShared) yield /*27.62*/ {_display_(Seq[Any](format.raw/*27.64*/("""
                        """),_display_(/*28.26*/for(value <- values) yield /*28.46*/ {_display_(Seq[Any](format.raw/*28.48*/("""
                            """),format.raw/*29.29*/("""<p class="description-text">"""),_display_(/*29.58*/key),format.raw/*29.61*/(""" """),format.raw/*29.62*/(""": """),_display_(/*29.65*/value),format.raw/*29.70*/("""</p>
                        """)))}),format.raw/*30.26*/("""
                    """)))}),format.raw/*31.22*/("""
            """),format.raw/*32.13*/("""</div>
        </div>
    </div>
    <!-- Add a form for submitting a comment -->
    """),_display_(/*36.6*/helper/*36.12*/.form(routes.CommentOnImageController.submitComment(session.get(models.Global.SESSION_USERNAME_KEY).get, data.pictureID), Symbol("enctype") -> "multipart/form-data")/*36.177*/ {_display_(Seq[Any](format.raw/*36.179*/("""
        """),format.raw/*37.9*/("""<br>
        <br>

        <div class="comment-section-2">
            <form action=""""),_display_(/*41.28*/routes/*41.34*/.CommentOnImageController.submitComment(session.get(models.Global.SESSION_USERNAME_KEY).get, data.pictureID)),format.raw/*41.142*/("""" method="post" enctype="multipart/form-data">
                <label>
                    <div><label for="picture-info">Comment on the picture:</label></div>
                    <textarea name="commentText" rows="2" cols="10" placeholder="Add your comment here..."></textarea>
                </label>
                <br>
                <input type="submit" value="Submit">
            </form>
        </div>
    """)))}),format.raw/*50.6*/("""

""")))}),format.raw/*52.2*/("""
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
                  HASH: c2c1fff7db483fb76184e33fbfe43b4a3c3e1a5d
                  MATRIX: 778->1|915->71|943->74|980->103|1019->105|1050->110|1255->289|1267->293|1292->298|1320->299|1355->308|1367->312|1393->318|1421->319|1674->545|1687->549|1720->561|1787->601|1802->607|1981->776|2022->778|2067->795|2109->810|2124->816|2258->928|2385->1028|2398->1032|2431->1044|2637->1219|2682->1236|2891->1418|2947->1458|2987->1460|3040->1486|3076->1506|3116->1508|3173->1537|3229->1566|3253->1569|3282->1570|3312->1573|3338->1578|3399->1608|3452->1630|3493->1643|3606->1730|3621->1736|3796->1901|3837->1903|3873->1912|3986->1998|4001->2004|4131->2112|4579->2530|4612->2533
                  LINES: 22->1|27->1|29->3|29->3|29->3|30->4|33->7|33->7|33->7|33->7|33->7|33->7|33->7|33->7|40->14|40->14|40->14|43->17|43->17|43->17|43->17|44->18|44->18|44->18|44->18|45->19|45->19|45->19|48->22|49->23|53->27|53->27|53->27|54->28|54->28|54->28|55->29|55->29|55->29|55->29|55->29|55->29|56->30|57->31|58->32|62->36|62->36|62->36|62->36|63->37|67->41|67->41|67->41|76->50|78->52
                  -- GENERATED --
              */
          
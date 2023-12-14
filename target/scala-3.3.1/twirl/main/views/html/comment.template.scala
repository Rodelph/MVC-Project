
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
    </div>

        <!-- Your HTML structure -->
    <div class="image-container">

        <div>
            <label>This picture was added at : """),_display_(/*13.49*/data/*13.53*/.date),format.raw/*13.58*/("""</label>
        </div>

        <div style="flex: 1; margin-right: 20px;">
            <label>Description : """),_display_(/*17.35*/data/*17.39*/.description),format.raw/*17.51*/("""</label>
            <br>
            <label>This images has """),_display_(/*19.37*/data/*19.41*/.likes),format.raw/*19.47*/(""" """),format.raw/*19.48*/("""likes </label>
        </div>

        """),_display_(/*22.10*/helper/*22.16*/.form(routes.CommentOnImageController.submitLikeToImage(session.get(models.Global.SESSION_USERNAME_KEY).get, data.pictureID), Symbol("enctype") -> "multipart/form-data")/*22.185*/ {_display_(Seq[Any](format.raw/*22.187*/("""
        """),format.raw/*23.9*/("""<div class="image-block">
            <form action=""""),_display_(/*24.28*/routes/*24.34*/.CommentOnImageController.submitLikeToImage(session.get(models.Global.SESSION_USERNAME_KEY).get, data.pictureID)),format.raw/*24.146*/("""" method="post" enctype="multipart/form-data">
                <img class="display-img" src=""""),_display_(/*25.48*/data/*25.52*/.pictureLink),format.raw/*25.64*/("""" alt="Image">
                <button class="like-button" type="submit" value="Submit"><i class="far fa-thumbs-up"></i>Like</button>
            </form>
        </div>
        """)))}),format.raw/*29.10*/("""
            """),format.raw/*30.13*/("""<!-- Comment Section -->
        <div class="comment-section">
                <!-- Display existing comments -->
            <div class="existing-comments">
                <h3>Comments:</h3>
                """),_display_(/*35.18*/for((key, values) <- data.commentShared) yield /*35.58*/ {_display_(Seq[Any](format.raw/*35.60*/("""
                    """),_display_(/*36.22*/for(value <- values) yield /*36.42*/ {_display_(Seq[Any](format.raw/*36.44*/("""
                        """),format.raw/*37.25*/("""<p>"""),_display_(/*37.29*/key),format.raw/*37.32*/(""" """),format.raw/*37.33*/(""": """),_display_(/*37.36*/value),format.raw/*37.41*/("""</p>
                    """)))}),format.raw/*38.22*/("""
                """)))}),format.raw/*39.18*/("""
            """),format.raw/*40.13*/("""</div>

            <!-- Add a form for submitting a comment -->
            """),_display_(/*43.14*/helper/*43.20*/.form(routes.CommentOnImageController.submitComment(session.get(models.Global.SESSION_USERNAME_KEY).get, data.pictureID), Symbol("enctype") -> "multipart/form-data")/*43.185*/ {_display_(Seq[Any](format.raw/*43.187*/("""
                """),format.raw/*44.17*/("""<div class="centered-textarea">
                    <label for="picture-info">Information on the picture:</label>
                    <form action=""""),_display_(/*46.36*/routes/*46.42*/.CommentOnImageController.submitComment(session.get(models.Global.SESSION_USERNAME_KEY).get, data.pictureID)),format.raw/*46.150*/("""" method="post" enctype="multipart/form-data">
                        <label>
                            <textarea class="comment-section" name="commentText" rows="2" cols="10" placeholder="Add your comment here..."></textarea>
                        </label>
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </div>
            """)))}),format.raw/*54.14*/("""
        """),format.raw/*55.9*/("""</div>
    </div>
""")))}),format.raw/*57.2*/("""
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
                  HASH: 8df90de4d0a45b544b739d3fc77e5894dc32a7ab
                  MATRIX: 778->1|915->71|943->74|980->103|1019->105|1050->110|1358->391|1371->395|1397->400|1534->510|1547->514|1580->526|1669->588|1682->592|1709->598|1738->599|1805->639|1820->645|1999->814|2040->816|2076->825|2156->878|2171->884|2305->996|2426->1090|2439->1094|2472->1106|2681->1284|2722->1297|2959->1507|3015->1547|3055->1549|3104->1571|3140->1591|3180->1593|3233->1618|3264->1622|3288->1625|3317->1626|3347->1629|3373->1634|3430->1660|3479->1678|3520->1691|3625->1769|3640->1775|3815->1940|3856->1942|3901->1959|4077->2108|4092->2114|4222->2222|4670->2639|4706->2648|4755->2667
                  LINES: 22->1|27->1|29->3|29->3|29->3|30->4|39->13|39->13|39->13|43->17|43->17|43->17|45->19|45->19|45->19|45->19|48->22|48->22|48->22|48->22|49->23|50->24|50->24|50->24|51->25|51->25|51->25|55->29|56->30|61->35|61->35|61->35|62->36|62->36|62->36|63->37|63->37|63->37|63->37|63->37|63->37|64->38|65->39|66->40|69->43|69->43|69->43|69->43|70->44|72->46|72->46|72->46|80->54|81->55|83->57
                  -- GENERATED --
              */
          
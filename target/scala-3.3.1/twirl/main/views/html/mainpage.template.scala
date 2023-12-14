
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

        <div>
            <a href=""""),_display_(/*8.23*/routes/*8.29*/.MainPageController.sortByDate()),format.raw/*8.61*/("""" class="sort-link">Sort by Date</a>
            <a href=""""),_display_(/*9.23*/routes/*9.29*/.MainPageController.sortByLikes()),format.raw/*9.62*/("""" class="sort-link">Sort by Likes</a>
        </div>
    </div>
        <!-- Your HTML structure -->
    <div class="image-container">
        """),_display_(/*14.10*/for(data <- dataDao) yield /*14.30*/ {_display_(Seq[Any](format.raw/*14.32*/("""
            """),format.raw/*15.13*/("""<div>
                <label>This picture was added at : """),_display_(/*16.53*/data/*16.57*/.date),format.raw/*16.62*/("""</label>
                <br>
                <label>This images has """),_display_(/*18.41*/data/*18.45*/.likes),format.raw/*18.51*/(""" """),format.raw/*18.52*/("""likes </label>
            </div>

            <div style="flex: 1; margin-right: 20px;">
                <label>Description : """),_display_(/*22.39*/data/*22.43*/.description),format.raw/*22.55*/("""</label>
            </div>

            <div class="image-block">
                <img class="display-img" src=""""),_display_(/*26.48*/data/*26.52*/.pictureLink),format.raw/*26.64*/("""" alt="Image">
            </div>
                <!-- Comment Section -->
            <div class="comment-section">
                    <!-- Display existing comments -->
                <div class="existing-comments">
                    <h3>Comments:</h3>
                    """),_display_(/*33.22*/for((key, values) <- data.commentShared) yield /*33.62*/ {_display_(Seq[Any](format.raw/*33.64*/("""
                        """),_display_(/*34.26*/for(value <- values) yield /*34.46*/ {_display_(Seq[Any](format.raw/*34.48*/("""
                            """),format.raw/*35.29*/("""<p>"""),_display_(/*35.33*/key),format.raw/*35.36*/(""" """),format.raw/*35.37*/(""": """),_display_(/*35.40*/value),format.raw/*35.45*/("""</p>
                        """)))}),format.raw/*36.26*/("""
                    """)))}),format.raw/*37.22*/("""
                    """),format.raw/*38.21*/("""<p><a href=""""),_display_(/*38.34*/routes/*38.40*/.CommentOnImageController.showCommentImage(data.pictureID)),format.raw/*38.98*/("""">See More</a></p>
                </div>
            </div>
        """)))}),format.raw/*41.10*/("""
    """),format.raw/*42.5*/("""</div>
""")))}),format.raw/*43.2*/("""
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
                  HASH: c6527d2b43d54e0a0467f6ef16b0a299f2289e34
                  MATRIX: 784->1|929->79|957->82|997->114|1036->116|1067->121|1193->221|1207->227|1259->259|1344->318|1358->324|1411->357|1582->501|1618->521|1658->523|1699->536|1784->594|1797->598|1823->603|1920->673|1933->677|1960->683|1989->684|2144->812|2157->816|2190->828|2331->942|2344->946|2377->958|2684->1238|2740->1278|2780->1280|2833->1306|2869->1326|2909->1328|2966->1357|2997->1361|3021->1364|3050->1365|3080->1368|3106->1373|3167->1403|3220->1425|3269->1446|3309->1459|3324->1465|3403->1523|3504->1593|3536->1598|3574->1606
                  LINES: 22->1|27->1|29->3|29->3|29->3|30->4|34->8|34->8|34->8|35->9|35->9|35->9|40->14|40->14|40->14|41->15|42->16|42->16|42->16|44->18|44->18|44->18|44->18|48->22|48->22|48->22|52->26|52->26|52->26|59->33|59->33|59->33|60->34|60->34|60->34|61->35|61->35|61->35|61->35|61->35|61->35|62->36|63->37|64->38|64->38|64->38|64->38|67->41|68->42|69->43
                  -- GENERATED --
              */
          
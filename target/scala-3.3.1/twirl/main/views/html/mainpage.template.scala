
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
"""),_display_(/*2.2*/main("Sharing Picture", session)/*2.34*/ {_display_(Seq[Any](format.raw/*2.36*/("""
    """),format.raw/*3.5*/("""<div class="main-share-title">
        <h1>-- Fakebook --</h1>
        <div>
            <a href=""""),_display_(/*6.23*/routes/*6.29*/.MainPageController.sortByDate()),format.raw/*6.61*/("""" class="sort-link">Sort by Date</a>
            <a href=""""),_display_(/*7.23*/routes/*7.29*/.MainPageController.sortByLikes()),format.raw/*7.62*/("""" class="sort-link">Sort by Likes</a>
        </div>
    </div>

    <div class="image-container">
    """),_display_(/*12.6*/for(data <- dataDao) yield /*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
        """),format.raw/*13.9*/("""<div class="image-block">
            <div class="description">
                <div><label>This picture was added at : """),_display_(/*15.58*/data/*15.62*/.date),format.raw/*15.67*/(""" """),format.raw/*15.68*/("""and has """),_display_(/*15.77*/data/*15.81*/.likes),format.raw/*15.87*/(""" """),format.raw/*15.88*/("""likes.</label></div>
                <label>Description: </label>
                <div class="description-text">"""),_display_(/*17.48*/data/*17.52*/.description),format.raw/*17.64*/("""</div>
            </div>

            <img class="display-img" src=""""),_display_(/*20.44*/data/*20.48*/.pictureLink),format.raw/*20.60*/("""" alt="Image">

            <div class="comment-section">
                <div class="existing-comments">
                    <h3>Comments:</h3>
                    """),_display_(/*25.22*/for((key, values) <- data.commentShared) yield /*25.62*/ {_display_(Seq[Any](format.raw/*25.64*/("""
                        """),_display_(/*26.26*/for(value <- values) yield /*26.46*/ {_display_(Seq[Any](format.raw/*26.48*/("""
                            """),format.raw/*27.29*/("""<p class="description-text">"""),_display_(/*27.58*/key),format.raw/*27.61*/(""" """),format.raw/*27.62*/(""": """),_display_(/*27.65*/value),format.raw/*27.70*/("""</p>
                        """)))}),format.raw/*28.26*/("""
                    """)))}),format.raw/*29.22*/("""
                    """),format.raw/*30.21*/("""<p><a href=""""),_display_(/*30.34*/routes/*30.40*/.CommentOnImageController.showCommentImage(data.pictureID)),format.raw/*30.98*/("""">See More</a></p>
                </div>
            </div>
        </div>
    """)))}),format.raw/*34.6*/("""
    """),format.raw/*35.5*/("""</div>
""")))}))
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
                  HASH: 4df4fbce9faf83133c40eda21280d781c944df24
                  MATRIX: 784->1|929->79|956->81|996->113|1035->115|1066->120|1191->219|1205->225|1257->257|1342->316|1356->322|1409->355|1539->459|1575->479|1615->481|1651->490|1799->611|1812->615|1838->620|1867->621|1903->630|1916->634|1943->640|1972->641|2112->754|2125->758|2158->770|2255->840|2268->844|2301->856|2494->1022|2550->1062|2590->1064|2643->1090|2679->1110|2719->1112|2776->1141|2832->1170|2856->1173|2885->1174|2915->1177|2941->1182|3002->1212|3055->1234|3104->1255|3144->1268|3159->1274|3238->1332|3349->1413|3381->1418
                  LINES: 22->1|27->1|28->2|28->2|28->2|29->3|32->6|32->6|32->6|33->7|33->7|33->7|38->12|38->12|38->12|39->13|41->15|41->15|41->15|41->15|41->15|41->15|41->15|41->15|43->17|43->17|43->17|46->20|46->20|46->20|51->25|51->25|51->25|52->26|52->26|52->26|53->27|53->27|53->27|53->27|53->27|53->27|54->28|55->29|56->30|56->30|56->30|56->30|60->34|61->35
                  -- GENERATED --
              */
          

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Session,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*8.2*/(title: String, session: Session)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.50*/("""

"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*14.13*/title),format.raw/*14.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.97*/("""'>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>

<body>
        <!------ Include the above in your HEAD tag ---------->
    <div class="container-fluid">
            <!-- Second navbar for categories -->
        <nav class="navbar navbar-default">
            <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    """),_display_(if(session.get(models.Global.SESSION_USERNAME_KEY).isEmpty)/*35.81*/{_display_(Seq[Any](format.raw/*35.82*/("""
                        """),format.raw/*36.25*/("""<a class="navbar-brand" href=""""),_display_(/*36.56*/routes/*36.62*/.HomeController.index()),format.raw/*36.85*/("""">Home</a>
                    """)))}else/*37.27*/{_display_(Seq[Any](format.raw/*37.28*/("""
                        """),format.raw/*38.25*/("""<a class="navbar-brand" href=""""),_display_(/*38.56*/routes/*38.62*/.MainPageController.showSharePicture()),format.raw/*38.100*/("""">Home</a>
                    """)))}),format.raw/*39.22*/("""
                """),format.raw/*40.17*/("""</div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        """),_display_(if(session.get(models.Global.SESSION_USERNAME_KEY).isEmpty)/*45.85*/{_display_(Seq[Any](format.raw/*45.86*/("""
                            """),format.raw/*46.29*/("""<li><a href=""""),_display_(/*46.43*/routes/*46.49*/.LoginController.showLoginForm),format.raw/*46.79*/("""">Login</a></li>
                            <li><a href=""""),_display_(/*47.43*/routes/*47.49*/.SignUpController.showSignUpForm),format.raw/*47.81*/("""">Sign Up</a></li>
                        """)))}else/*48.31*/{_display_(Seq[Any](format.raw/*48.32*/("""
                            """),format.raw/*49.29*/("""<li><a href=""""),_display_(/*49.43*/routes/*49.49*/.SharePictureController.uploadPicture()),format.raw/*49.88*/("""">Share Picture</a></li>
                            <li><a href=""""),_display_(/*50.43*/routes/*50.49*/.ProfileController.showProfile()),format.raw/*50.81*/("""">Profile</a></li>
                            <li><a href=""""),_display_(/*51.43*/routes/*51.49*/.AuthenticatedUserController.logout),format.raw/*51.84*/("""">Logout</a></li>
                        """)))}),format.raw/*52.26*/("""
                    """),format.raw/*53.21*/("""</ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container -->
        </nav><!-- /.navbar -->

    </div><!-- /.container-fluid -->
    """),_display_(/*59.6*/content),format.raw/*59.13*/("""
"""),format.raw/*60.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,session:Session,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,session)(content)

  def f:((String,Session) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,session) => (content) => apply(title,session)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 40141cca4d1791a51bae356b6bd7bf33e9421efc
                  MATRIX: 1038->268|1181->316|1212->320|1296->377|1322->382|1484->517|1499->523|1561->564|2667->1643|2706->1644|2760->1670|2818->1701|2833->1707|2877->1730|2933->1768|2972->1769|3026->1795|3084->1826|3099->1832|3159->1870|3223->1903|3269->1921|3622->2247|3661->2248|3719->2278|3760->2292|3775->2298|3826->2328|3913->2388|3928->2394|3981->2426|4049->2476|4088->2477|4146->2507|4187->2521|4202->2527|4262->2566|4357->2634|4372->2640|4425->2672|4514->2734|4529->2740|4585->2775|4660->2819|4710->2841|4911->3016|4939->3023|4968->3025
                  LINES: 27->8|32->8|34->10|38->14|38->14|40->16|40->16|40->16|59->35|59->35|60->36|60->36|60->36|60->36|61->37|61->37|62->38|62->38|62->38|62->38|63->39|64->40|69->45|69->45|70->46|70->46|70->46|70->46|71->47|71->47|71->47|72->48|72->48|73->49|73->49|73->49|73->49|74->50|74->50|74->50|75->51|75->51|75->51|76->52|77->53|83->59|83->59|84->60
                  -- GENERATED --
              */
          
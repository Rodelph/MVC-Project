
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

object userLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.User],Call,Session,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.User], postUrl: Call)(implicit session: Session, request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("User Login", session)/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
    """),_display_(/*3.6*/defining(play.core.PlayVersion.current)/*3.45*/ { version =>_display_(Seq[Any](format.raw/*3.58*/("""
        """),format.raw/*4.9*/("""<div class="wrapper fadeInDown">
            <div class="main-share-title">
                <h1>Login</h1>
            </div>
            <div id="user-login-form">
                """),_display_(/*9.18*/request/*9.25*/.flash.data.map/*9.40*/{ case (name, value) =>_display_(Seq[Any](format.raw/*9.63*/("""
                """),format.raw/*10.17*/("""<div>"""),_display_(/*10.23*/name),format.raw/*10.27*/(""": """),_display_(/*10.30*/value),format.raw/*10.35*/("""</div>
                """)))}),format.raw/*11.18*/("""

                    """),format.raw/*13.82*/("""
                """),_display_(if(form.hasGlobalErrors)/*14.42*/ {_display_(Seq[Any](format.raw/*14.44*/("""
                    """),_display_(/*15.22*/form/*15.26*/.globalErrors.map/*15.43*/ { (error: FormError) =>_display_(Seq[Any](format.raw/*15.67*/("""
                        """),format.raw/*16.25*/("""<div>
                            Error: """),_display_(/*17.37*/error/*17.42*/.key),format.raw/*17.46*/(""": """),_display_(/*17.49*/error/*17.54*/.message),format.raw/*17.62*/("""
                        """),format.raw/*18.25*/("""</div>
                    """)))}),format.raw/*19.22*/("""
                """)))} else {null} ),format.raw/*20.18*/("""

                """),_display_(/*22.18*/helper/*22.24*/.form(postUrl, Symbol("id") -> "user-login-form")/*22.73*/ {_display_(Seq[Any](format.raw/*22.75*/("""
                    """),_display_(/*23.22*/helper/*23.28*/.CSRF.formField),format.raw/*23.43*/("""
                    """),_display_(/*24.22*/helper/*24.28*/.inputText(
                        form("username"),
                        Symbol("placeholder") -> "username",
                        Symbol("id") -> "username",
                        Symbol("size") -> 60
                    )),format.raw/*29.22*/("""

                    """),format.raw/*31.21*/("""<input type="text" id="tag" name="tag" placeholder="" size="60" style="display:none;">

                    """),_display_(/*33.22*/helper/*33.28*/.inputPassword(
                        form("password"),
                        Symbol("placeholder") -> "password",
                        Symbol("id") -> "password",
                        Symbol("size") -> 60
                    )),format.raw/*38.22*/("""

                    """),format.raw/*40.21*/("""<div class="submit-button-container">
                        <input type="submit" value="Login">
                    </div>
                    """)))}),format.raw/*43.22*/("""
            """),format.raw/*44.13*/("""</div>
        </div>
    """)))}),format.raw/*46.6*/("""
""")))}))
      }
    }
  }

  def render(form:Form[models.User],postUrl:Call,session:Session,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form,postUrl)(session,request)

  def f:((Form[models.User],Call) => (Session,MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form,postUrl) => (session,request) => apply(form,postUrl)(session,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/userLogin.scala.html
                  HASH: be5199c5a0bed8f778cc71643b5cb924911dc2d2
                  MATRIX: 817->1|1010->102|1045->129|1084->131|1115->137|1162->176|1212->189|1247->198|1455->380|1470->387|1493->402|1553->425|1598->442|1631->448|1656->452|1686->455|1712->460|1767->484|1817->567|1886->609|1926->611|1975->633|1988->637|2014->654|2076->678|2129->703|2198->745|2212->750|2237->754|2267->757|2281->762|2310->770|2363->795|2422->823|2484->841|2530->860|2545->866|2603->915|2643->917|2692->939|2707->945|2743->960|2792->982|2807->988|3061->1221|3111->1243|3247->1352|3262->1358|3520->1595|3570->1617|3747->1763|3788->1776|3845->1803
                  LINES: 22->1|27->2|27->2|27->2|28->3|28->3|28->3|29->4|34->9|34->9|34->9|34->9|35->10|35->10|35->10|35->10|35->10|36->11|38->13|39->14|39->14|40->15|40->15|40->15|40->15|41->16|42->17|42->17|42->17|42->17|42->17|42->17|43->18|44->19|45->20|47->22|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|54->29|56->31|58->33|58->33|63->38|65->40|68->43|69->44|71->46
                  -- GENERATED --
              */
          
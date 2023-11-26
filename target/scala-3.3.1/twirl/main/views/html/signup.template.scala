
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.User],Call,Session,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.User], postUrl: Call)(implicit session: Session, request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("User Sign Up", session)/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/defining(play.core.PlayVersion.current)/*3.45*/ { version =>_display_(Seq[Any](format.raw/*3.58*/("""
        """),format.raw/*4.9*/("""<div class="wrapper fadeInDown">
            <div class="main-share-title">
                <h1>Sign Up</h1>
            </div>

            <div id="user-signup-form">
                """),_display_(/*10.18*/request/*10.25*/.flash.data.map/*10.40*/{ case (name, value) =>_display_(Seq[Any](format.raw/*10.63*/("""
                """),format.raw/*11.17*/("""<div>"""),_display_(/*11.23*/name),format.raw/*11.27*/(""": """),_display_(/*11.30*/value),format.raw/*11.35*/("""</div>
                """)))}),format.raw/*12.18*/("""

                """),format.raw/*14.78*/("""
                """),_display_(if(form.hasGlobalErrors)/*15.42*/ {_display_(Seq[Any](format.raw/*15.44*/("""
                    """),_display_(/*16.22*/form/*16.26*/.globalErrors.map/*16.43*/ { (error: FormError) =>_display_(Seq[Any](format.raw/*16.67*/("""
                        """),format.raw/*17.25*/("""<div>
                            Error: """),_display_(/*18.37*/error/*18.42*/.key),format.raw/*18.46*/(""": """),_display_(/*18.49*/error/*18.54*/.message),format.raw/*18.62*/("""
                        """),format.raw/*19.25*/("""</div>
                    """)))}),format.raw/*20.22*/("""
                """)))} else {null} ),format.raw/*21.18*/("""

                """),_display_(/*23.18*/helper/*23.24*/.form(postUrl, Symbol("id") -> "user-signup-form")/*23.74*/ {_display_(Seq[Any](format.raw/*23.76*/("""
                    """),_display_(/*24.22*/helper/*24.28*/.CSRF.formField),format.raw/*24.43*/("""
                    """),_display_(/*25.22*/helper/*25.28*/.inputText(
                        form("username"),
                        Symbol("placeholder") -> "username",
                        Symbol("id") -> "username",
                        Symbol("size") -> 60
                    )),format.raw/*30.22*/("""

                    """),_display_(/*32.22*/helper/*32.28*/.inputText(
                        form("tag"),
                        Symbol("placeholder") -> "tag",
                        Symbol("id") -> "tag",
                        Symbol("size") -> 60
                    )),format.raw/*37.22*/("""

                    """),_display_(/*39.22*/helper/*39.28*/.inputPassword(
                        form("password"),
                        Symbol("placeholder") -> "password",
                        Symbol("id") -> "password",
                        Symbol("size") -> 60
                    )),format.raw/*44.22*/("""
                    """),format.raw/*45.21*/("""<div class="submit-button-container">
                        <input type="submit" value="Sign Up">
                    </div>
                    """)))}),format.raw/*48.22*/("""
            """),format.raw/*49.13*/("""</div>
        </div>
    """)))}),format.raw/*51.6*/("""
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
                  SOURCE: app/views/signup.scala.html
                  HASH: c661b54212ace50241578b492ae92f80bc72b61c
                  MATRIX: 814->1|1007->102|1044->131|1083->133|1114->139|1161->178|1211->191|1246->200|1459->386|1475->393|1499->408|1560->431|1605->448|1638->454|1663->458|1693->461|1719->466|1774->490|1820->569|1889->611|1929->613|1978->635|1991->639|2017->656|2079->680|2132->705|2201->747|2215->752|2240->756|2270->759|2284->764|2313->772|2366->797|2425->825|2487->843|2533->862|2548->868|2607->918|2647->920|2696->942|2711->948|2747->963|2796->985|2811->991|3065->1224|3115->1247|3130->1253|3369->1471|3419->1494|3434->1500|3692->1737|3741->1758|3920->1906|3961->1919|4018->1946
                  LINES: 22->1|27->2|27->2|27->2|28->3|28->3|28->3|29->4|35->10|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|37->12|39->14|40->15|40->15|41->16|41->16|41->16|41->16|42->17|43->18|43->18|43->18|43->18|43->18|43->18|44->19|45->20|46->21|48->23|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|55->30|57->32|57->32|62->37|64->39|64->39|69->44|70->45|73->48|74->49|76->51
                  -- GENERATED --
              */
          
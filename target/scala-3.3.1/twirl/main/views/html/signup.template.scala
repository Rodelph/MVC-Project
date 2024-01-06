
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

                """),_display_(if(form.hasGlobalErrors)/*14.42*/ {_display_(Seq[Any](format.raw/*14.44*/("""
                    """),_display_(/*15.22*/form/*15.26*/.globalErrors.map/*15.43*/ { (error: FormError) =>_display_(Seq[Any](format.raw/*15.67*/("""
                        """),format.raw/*16.25*/("""<div>
                            Error: """),_display_(/*17.37*/error/*17.42*/.key),format.raw/*17.46*/(""": """),_display_(/*17.49*/error/*17.54*/.message),format.raw/*17.62*/("""
                        """),format.raw/*18.25*/("""</div>
                    """)))}),format.raw/*19.22*/("""
                """)))} else {null} ),format.raw/*20.18*/("""

                """),_display_(/*22.18*/helper/*22.24*/.form(postUrl, Symbol("id") -> "user-signup-form")/*22.74*/ {_display_(Seq[Any](format.raw/*22.76*/("""
                    """),_display_(/*23.22*/helper/*23.28*/.CSRF.formField),format.raw/*23.43*/("""
                    """),_display_(/*24.22*/helper/*24.28*/.inputText(
                        form("username"),
                        Symbol("placeholder") -> "username",
                        Symbol("id") -> "username",
                        Symbol("size") -> 60
                    )),format.raw/*29.22*/("""

                    """),_display_(/*31.22*/helper/*31.28*/.inputText(
                        form("tag"),
                        Symbol("placeholder") -> "tag",
                        Symbol("id") -> "tag",
                        Symbol("size") -> 60
                    )),format.raw/*36.22*/("""

                    """),_display_(/*38.22*/helper/*38.28*/.inputPassword(
                        form("password"),
                        Symbol("placeholder") -> "password",
                        Symbol("id") -> "password",
                        Symbol("size") -> 60
                    )),format.raw/*43.22*/("""
                    """),format.raw/*44.21*/("""<div class="submit-button-container">
                        <input type="submit" value="Sign Up">
                    </div>
                    """)))}),format.raw/*47.22*/("""
            """),format.raw/*48.13*/("""</div>
        </div>
    """)))}),format.raw/*50.6*/("""
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
                  HASH: 6478c2706571ab76870d4b34a7b0d35009057ad8
                  MATRIX: 814->1|1007->102|1044->131|1083->133|1114->139|1161->178|1211->191|1246->200|1459->386|1475->393|1499->408|1560->431|1605->448|1638->454|1663->458|1693->461|1719->466|1774->490|1844->533|1884->535|1933->557|1946->561|1972->578|2034->602|2087->627|2156->669|2170->674|2195->678|2225->681|2239->686|2268->694|2321->719|2380->747|2442->765|2488->784|2503->790|2562->840|2602->842|2651->864|2666->870|2702->885|2751->907|2766->913|3020->1146|3070->1169|3085->1175|3324->1393|3374->1416|3389->1422|3647->1659|3696->1680|3875->1828|3916->1841|3973->1868
                  LINES: 22->1|27->2|27->2|27->2|28->3|28->3|28->3|29->4|35->10|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|37->12|39->14|39->14|40->15|40->15|40->15|40->15|41->16|42->17|42->17|42->17|42->17|42->17|42->17|43->18|44->19|45->20|47->22|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|54->29|56->31|56->31|61->36|63->38|63->38|68->43|69->44|72->47|73->48|75->50
                  -- GENERATED --
              */
          
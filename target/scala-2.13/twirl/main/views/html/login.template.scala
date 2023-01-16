
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.mvc.Http.Request,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: play.mvc.Http.Request)(error: String = "Invalid login request"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/(""")
"""),_display_(/*2.2*/template(Array("stylesheets/landing.css"))/*2.44*/ {_display_(Seq[Any](format.raw/*2.46*/("""

   """),format.raw/*4.88*/("""
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField(r.asScala)),format.raw/*5.42*/("""
        """),format.raw/*6.9*/("""<div class="row principal-container">
            <div class="col-7 d-none d-md-block text-center">
                <img src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.at("images/login2.png")),format.raw/*8.65*/("""" class="img-fluid" alt="login" width="500px">
            </div>
            <div class="col-sm-12 col-md-4 justify-content-center">
                <div class="card-container text-white justify-content-start">
                    """),format.raw/*12.72*/("""
                    """),format.raw/*13.21*/("""<h2 class="pb-3">Login</h2>
                    """),format.raw/*24.25*/("""
                    """),format.raw/*25.21*/("""<div class="form-control-sm textfield pb-3">
                        <input type="text" id="username" name="username" placeholder="Username">
                    </div>
                    <div class="form-control-sm textfield pb-5">
                        <input type="password" id="password" name="password" placeholder="Password">
                    </div>
                    <div class="form-control-sm textfield pb-3">
                        <button class="btn-form" href="/home" type="submit">Sign In</button>
                    </div>

                    <a style="font-size: 12px" class="text-center text-muted pb-5" href="/recoverpassword">
                        Forgot your password?</a>

                    <p style="font-size: 15px" class="text-center text-muted mt-0 mb-0">Don't have an account?
                        <a href="/signup" class="fw-bold text-white">Sign up</a>
                    </p>
                    <p>"""),_display_(/*41.25*/error),format.raw/*41.30*/("""</p>
                </div>
            </div>
        </div>
""")))}))
      }
    }
  }

  def render(r:play.mvc.Http.Request,error:String): play.twirl.api.HtmlFormat.Appendable = apply(r)(error)

  def f:((play.mvc.Http.Request) => (String) => play.twirl.api.HtmlFormat.Appendable) = (r) => (error) => apply(r)(error)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: 4bf7bc944a418de7452a023ab3e6e6360c98e600
                  MATRIX: 929->1|1091->68|1120->72|1170->114|1209->116|1243->207|1280->218|1294->224|1340->250|1376->260|1531->389|1545->395|1596->426|1860->713|1910->735|1987->1141|2037->1163|3028->2127|3054->2132
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|43->12|44->13|45->24|46->25|62->41|62->41
                  -- GENERATED --
              */
          
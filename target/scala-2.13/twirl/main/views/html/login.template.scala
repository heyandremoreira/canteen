
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/template(Array("stylesheets/landing.css"))/*2.44*/ {_display_(Seq[Any](format.raw/*2.46*/("""

    """),format.raw/*4.89*/("""
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
                </div>
            </div>
        </div>
""")))}))
      }
    }
  }

  def render(r:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(r)

  def f:((play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: c5961757ccf30e9f4ed325745ae55ba235148918
                  MATRIX: 922->1|1043->27|1071->30|1121->72|1160->74|1195->166|1232->177|1246->183|1292->209|1328->219|1483->348|1497->354|1548->385|1812->672|1862->694|1939->1100|1989->1122
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|43->12|44->13|45->24|46->25
                  -- GENERATED --
              */
          
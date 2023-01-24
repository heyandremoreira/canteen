
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
    """),_display_(/*2.6*/template(Array("stylesheets/landing.css"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""

        """),format.raw/*4.9*/("""<form action=""""),_display_(/*4.24*/controllers/*4.35*/.routes.AuthController.loginProcess()),format.raw/*4.72*/("""" method="post">
            """),_display_(/*5.14*/helper/*5.20*/.CSRF.formField(r.asScala)),format.raw/*5.46*/("""
            """),format.raw/*6.13*/("""<div class="row principal-container">
                <div class="col-7 d-none d-md-block text-center">
                    <img src=""""),_display_(/*8.32*/routes/*8.38*/.Assets.at("images/login2.png")),format.raw/*8.69*/("""" class="img-fluid" alt="login" width="500px">
                </div>
                <div class="col-sm-12 col-md-4 justify-content-center">
                    <div class="card-container text-white justify-content-start">
                        <h2 class="pb-3">Login</h2>
                        <div class="form-control-sm textfield pb-3">
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
        </form>
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
                  HASH: 241793ed4f38048961e04e82081ffea54ede1a90
                  MATRIX: 922->1|1043->27|1075->34|1125->76|1164->78|1202->90|1243->105|1262->116|1319->153|1376->184|1390->190|1436->216|1477->230|1640->367|1654->373|1705->404
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8
                  -- GENERATED --
              */
          
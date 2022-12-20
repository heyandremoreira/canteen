
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css"))/*1.44*/{_display_(Seq[Any](format.raw/*1.45*/("""

        """),format.raw/*3.9*/("""<form method="post" action="signinProcess">
            <div class="row principal-container">
                <div class="col-7 d-none d-md-block text-center">
                    <img src=""""),_display_(/*6.32*/routes/*6.38*/.Assets.at("images/login2.png")),format.raw/*6.69*/("""" class="img-fluid" alt="login" width="500px">
                </div>
                <div class="col-sm-12 col-md-4 justify-content-center">
                    <div class="card-container text-white justify-content-start">
                        """),format.raw/*10.76*/("""
                        """),format.raw/*11.25*/("""<h2 class="pb-3">Login</h2>
                       """),format.raw/*22.29*/("""

                        """),format.raw/*24.25*/("""<div class="form-control-sm textfield pb-3">
                            <input type="text" name="username" placeholder="Username">
                        </div>
                        <div class="form-control-sm textfield pb-5">
                            <input type="password" name="password" placeholder="Password">
                        </div>
                        <div class="form-control-sm textfield pb-3">
                            <button class="btn-form" href="#">Sign In</button>
                        </div>

                        <a style="font-size: 12px" class="text-center text-muted pb-5" href="#">Forgot your password?</a>

                        <p style="font-size: 15px" class="text-center text-muted mt-0 mb-0">Don't have an account?
                            <a href="/login" class="fw-bold text-white">Sign up</a> </p>
                    </div>
                </div>
            </div>
        </form>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: cc5882dbe5ba967b132f93e41aa3768ab05bad98
                  MATRIX: 989->1|1039->43|1077->44|1115->56|1335->250|1349->256|1400->287|1680->590|1734->616|1814->1085|1870->1113
                  LINES: 32->1|32->1|32->1|34->3|37->6|37->6|37->6|41->10|42->11|43->22|45->24
                  -- GENERATED --
              */
          
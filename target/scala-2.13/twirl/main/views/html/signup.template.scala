
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css"))/*1.44*/{_display_(Seq[Any](format.raw/*1.45*/("""

        """),format.raw/*3.9*/("""<form method="post" action="signupProcess">
            <div class="row principal-container">
                <div class="col-7 d-none d-md-block text-center">
                    <img src=""""),_display_(/*6.32*/routes/*6.38*/.Assets.at("images/signup.png")),format.raw/*6.69*/("""" class="img-fluid" alt="login" width="500px">
                </div>
                <div class="col-sm-12 col-md-4 justify-content-center">
                    <div class="card-container text-white justify-content-start">
                        <h2 class="pb-3">Sign up</h2>
                        <div class="form-control-sm textfield pb-3">
                            <input type="text" name="username" placeholder="Username">
                        </div>
                        <div class="form-control-sm textfield pb-3">
                            <input type="email" name="email" placeholder="E-mail">
                        </div>
                        <div class="form-control-sm textfield pb-5">
                            <input type="password" name="password" placeholder="Password">
                        </div>
                        <div class="form-control-sm textfield pb-4">
                            <button class="btn-form">Register</button>
                        </div>

                        <p style="font-size: 12px" class="text-center text-muted pb-4">By signing up, you agree to our
                            <a class="text-white" style="text-decoration: none;
                                font-size: 12px" href="#termsofuse">Terms Of Use</a>
                            <br> and
                            <a class="text-white" style="text-decoration: none;
                                font-size: 12px" href="#privacypolicy">Privacy Policy</a>
                        </p>

                        <p style="font-size: 15px" class="text-center text-muted mt-0 mb-0">Already have an account?
                            <a href="/login" class="fw-bold text-white">Login</a> </p>
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
                  SOURCE: app/views/signup.scala.html
                  HASH: de9e81b25457c9272e94457d58da7a749c848965
                  MATRIX: 990->1|1040->43|1078->44|1116->56|1336->250|1350->256|1401->287
                  LINES: 32->1|32->1|32->1|34->3|37->6|37->6|37->6
                  -- GENERATED --
              */
          
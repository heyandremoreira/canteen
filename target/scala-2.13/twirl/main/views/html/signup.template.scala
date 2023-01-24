
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/template(Array("stylesheets/landing.css"))/*2.44*/ {_display_(Seq[Any](format.raw/*2.46*/("""

    """),format.raw/*4.5*/("""<form action=""""),_display_(/*4.20*/controllers/*4.31*/.routes.AuthController.signupProcess()),format.raw/*4.69*/("""" method="post">
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField(r.asScala)),format.raw/*5.42*/("""
        """),format.raw/*6.9*/("""<div class="row principal-container">
            <div class="col-7 d-none d-md-block text-center">
                <img src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.at("images/signup.png")),format.raw/*8.65*/("""" class="img-fluid" alt="login" width="500px">
            </div>
            <div class="col-sm-12 col-md-4 justify-content-center">
                <div class="card-container text-white justify-content-start">
                    <h2 class="pb-3">Sign up</h2>
                    <div class="row pb-3">
                        <div class="col">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                                <label class="form-check-label" for="inlineCheckbox1">Administrator</label>
                            </div>
                        </div>
                        <div class="col">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                                <label class="form-check-label" for="inlineCheckbox2">Manager</label>
                            </div>
                        </div>
                        <div class="col">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="option3">
                                <label class="form-check-label" for="inlineCheckbox3">Student</label>
                            </div>
                        </div>
                    </div>
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
                        <button class="btn-form" href="/" type="submit">Register</button>
                    </div>
                    <p style="font-size: 12px" class="text-center text-muted pb-4">
                        By signing up, you agree to our
                        <a class="text-white" style="text-decoration: none;
                            font-size: 12px" href="/termsofuse">Terms Of Use</a>
                        <br> and
                        <a class="text-white" style="text-decoration: none;
                            font-size: 12px" href="/privacypolicy">Privacy Policy</a>
                    </p>
                    <p style="font-size: 15px" class="text-center text-muted mt-0 mb-0">
                        Already have an account?
                        <a href="/login" class="fw-bold text-white">Sign In</a>
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
                  SOURCE: app/views/signup.scala.html
                  HASH: 8a36cffc33e939f619506eaa5d0eb9fd42209131
                  MATRIX: 923->1|1044->27|1072->30|1122->72|1161->74|1195->82|1236->97|1255->108|1313->146|1366->173|1380->179|1426->205|1462->215|1617->344|1631->350|1682->381
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8
                  -- GENERATED --
              */
          
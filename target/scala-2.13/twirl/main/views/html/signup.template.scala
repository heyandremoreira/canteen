
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

    """),format.raw/*4.89*/("""
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField(r.asScala)),format.raw/*5.42*/("""
        """),format.raw/*6.9*/("""<div class="row principal-container">
            <div class="col-7 d-none d-md-block text-center">
                <img src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.at("images/signup.png")),format.raw/*8.65*/("""" class="img-fluid" alt="login" width="500px">
            </div>
            <div class="col-sm-12 col-md-4 justify-content-center">
                <div class="card-container text-white justify-content-start">
                    <h2 class="pb-3">Sign up</h2>
                    <select>
                        <option value="" disabled selected>Choose the category</option>
                        <option value="">Administrator</option>
                        <option value="">Manager</option>
                        <option value="">Student</option>
                    </select>
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
                        <button class="btn-form" href="/home">Register</button>
                    </div>
                    <p style="font-size: 12px" class="text-center text-muted pb-4">By signing up, you agree to our
                        <a class="text-white" style="text-decoration: none;
                            font-size: 12px" href="#termsofuse">Terms Of Use</a>
                        <br> and
                        <a class="text-white" style="text-decoration: none;
                            font-size: 12px" href="#privacypolicy">Privacy Policy</a>
                    </p>
                    <p style="font-size: 15px" class="text-center text-muted mt-0 mb-0">Already have an account?
                        <a href="/login" class="fw-bold text-white">Sign In</a>
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
                  SOURCE: app/views/signup.scala.html
                  HASH: 44daa8f0bfd20a97ad5bce10d8c94f905a593c0f
                  MATRIX: 923->1|1044->27|1072->30|1122->72|1161->74|1196->166|1233->177|1247->183|1293->209|1329->219|1484->348|1498->354|1549->385
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8
                  -- GENERATED --
              */
          
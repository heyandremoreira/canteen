
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

object landing extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css"))/*1.44*/{_display_(Seq[Any](format.raw/*1.45*/("""

        """),format.raw/*3.9*/("""<main>
            """),format.raw/*4.50*/("""
            """),format.raw/*5.56*/("""
        """),format.raw/*6.9*/("""<section class="home d-flex align-items-center h-100" id="home">
            <div class="container">
                <div class="row d-flex align-items-center">
                    <div class="col-xl-4">
                        <h1 class="text-white">THE BEST FOOD <br> FOR YOU!</h1>
                        <p class="text-white pb-3">We have several canteens that are <br>
                            <strong> accessible to everyone. </strong>
                            <br> Explore our canteens and check out their menus.
                        </p>
                        <div style="padding-left: 40px">
                            <a class="btn btn-small ms-lg-4 px-4" href="/login">Login</a>
                            <a class="btn btn-small ms-lg-4 px-4" href="/signup">Sign Up</a>
                        </div>
                    </div>
                    <div class="landing-img col-xl-8 d-flex justify-content-end">
                        <img src=""""),_display_(/*21.36*/routes/*21.42*/.Assets.at("images/landing.png")),format.raw/*21.74*/("""" class="img-fluid" alt="landing">
                    </div>
                </div>
            </div>
        </section>
        </main>

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
                  SOURCE: app/views/landing.scala.html
                  HASH: 6ab5bf2a381b16763f172f8d1c449cd679a5de08
                  MATRIX: 991->1|1041->43|1079->44|1117->56|1164->113|1205->170|1241->180|2253->1165|2268->1171|2321->1203
                  LINES: 32->1|32->1|32->1|34->3|35->4|36->5|37->6|52->21|52->21|52->21
                  -- GENERATED --
              */
          
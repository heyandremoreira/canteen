
package views.html.template

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

object footer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<footer class="footer" id="footer">
    <div class="container">
        <div class="row">
            <div class="text-white col-xl-4 d-flex mx-auto justify-content-center">
                <a style="text-decoration: none;
                    font-size: 12px" class="text-white px-4" href="#termsofuse">Terms Of Use</a>
                <a style="text-decoration: none;
                    font-size: 12px" class="text-white px-4" href="#privacypolicy">Privacy Policy</a>
            </div>
        </div>
        <div class="row">
            <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                """),format.raw/*13.42*/("""
            """),format.raw/*14.13*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
            </div>
        </div>
    </div>
</footer>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/template/footer.scala.html
                  HASH: 04ac88c17351bbce2e62e5218b3272bd1c499b7b
                  MATRIX: 999->0|1677->675|1719->689
                  LINES: 32->1|44->13|45->14
                  -- GENERATED --
              */
          
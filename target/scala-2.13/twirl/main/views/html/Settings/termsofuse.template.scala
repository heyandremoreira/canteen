
package views.html.Settings

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

object termsofuse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css", "stylesheets/home.css"))/*1.68*/ {_display_(Seq[Any](format.raw/*1.70*/("""

    """),format.raw/*3.5*/("""<div class="row d-flex justify-content-center mt-5">
        <div class="col-md-10">
            <div class="card text-white shadow-0 border darkdarkbg mb-5">
                <div class="d-flex justify-content-center mt-4 mb-2">
                    <h1 style="color: #B87651">Terms of Use</h1>
                </div>
                <div class="ms-5 mb-3">
                <p>Welcome to our website! By using our site, you agree to the following terms of use:</p>
                <ul>
                    <li>You must be at least 16 years old to use our site.</li>
                    <li>You may not use our site for any illegal or inappropriate activities.</li>
                    <li>We reserve the right to modify or terminate our site at any time without notice.</li>
                </ul>
            </div>
        </div>
    </div>


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
                  SOURCE: app/views/Settings/termsofuse.scala.html
                  HASH: 4748b9dc9bf7b9524864e59297c154244f7685c4
                  MATRIX: 1003->1|1077->67|1116->69|1150->77
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          
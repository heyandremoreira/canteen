
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

object help extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css", "stylesheets/home.css"))/*1.68*/ {_display_(Seq[Any](format.raw/*1.70*/("""

    """),format.raw/*3.5*/("""<div class="row d-flex justify-content-center mt-5">
        <div class="col-md-10">
            <div class="card text-white shadow-0 border darkdarkbg mb-5">
                <div class="d-flex justify-content-center mt-4 mb-2">
                    <h1 style="color: #B87651">Help</h1>
                </div>
                <div class="ms-5 mb-3 me-5">
                    <p>Welcome to the help section of our website. If you are experiencing a problem or have a question, you may find the answer here:</p>

                    <h4 style="color: #B87651">Frequently Asked Questions</h4>

                    <ul>
                        <li><strong>How do I create an account?</strong><br>To create an account, click on the "Sign Up" button and follow the prompts.</li>
                        <li><strong>How do I place an order?</strong><br>To place an order, add items to your cart and then click on the "Checkout" button to complete the process.</li>
                        <li><strong>How do I contact customer service?</strong><br>You can contact customer service by emailing [email address] or by calling [phone number].</li>
                    </ul>

                    <h4 style="color: #B87651">Additional Resources</h4>

                    <p>For more information, you can consult our [terms of use] and [privacy policy]. If you cannot find the answer to your question, you can also contact us directly for assistance.</p>
                </div>
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
                  SOURCE: app/views/Settings/help.scala.html
                  HASH: b1e9bdb7708de6d6ca0fd3e06415bbca2994302c
                  MATRIX: 997->1|1071->67|1110->69|1144->77
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          
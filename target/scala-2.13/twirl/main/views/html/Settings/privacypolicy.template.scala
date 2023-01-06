
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

object privacypolicy extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css", "stylesheets/home.css"))/*1.68*/ {_display_(Seq[Any](format.raw/*1.70*/("""

    """),format.raw/*3.5*/("""<div class="row d-flex justify-content-center mt-5">
        <div class="col-md-10">
            <div class="card text-white shadow-0 border darkdarkbg mb-5">
                <div class="d-flex justify-content-center mt-4 mb-2">
                    <h1 style="color: #B87651">Privacy Policy</h1>
                </div>
                <div class="ms-5 mb-3 me-5">
                <p>At [Company Name], we are committed to protecting your privacy. This privacy policy outlines how we collect, use, and share your personal information:</p>

                <ul>
                    <li>We collect personal information when you create an account, make a purchase, or contact us. This information may include your name, email address, and billing information.</li>
                    <li>We use your personal information to process your orders, respond to your inquiries, and improve our services. We do not sell or share your personal information with third parties, except as necessary to provide our services (e.g., payment processing).</li>
                    <li>We may use cookies and other tracking technologies to collect information about your activity on our site. This information is used to personalize your experience and to improve our site.</li>
                </ul>

                <p>If you have any questions or concerns about our privacy policy, please contact us at [contact email or phone number].</p>
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
                  SOURCE: app/views/Settings/privacypolicy.scala.html
                  HASH: 3a0adc79d1d0ac94a71d274760628ba79f88e5ad
                  MATRIX: 1006->1|1080->67|1119->69|1153->77
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          
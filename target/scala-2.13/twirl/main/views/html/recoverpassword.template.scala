
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

object recoverpassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css"))/*1.44*/{_display_(Seq[Any](format.raw/*1.45*/("""

        """),format.raw/*3.9*/("""<form method="post" action="recoverpasswordProcess">
            <div class="row principal-container">
                <div class="col-7 d-none d-md-block text-center">
                    <img src=""""),_display_(/*6.32*/routes/*6.38*/.Assets.at("images/passwordreset.png")),format.raw/*6.76*/("""" class="img-fluid" alt="login" width="500px">
                </div>
                <div class="col-sm-12 col-md-4 justify-content-center">
                    <div class="text-white card-container">
                        <h2>Password Reset</h2>
                        <p style="font-size: 14px" class="text-center text-muted pt-3 pb-3">Enter the email address you used
                            to sign up to Cantini. <br> We will send you a link to reset your password.
                        </p>
                        <div class="form-control-sm textfield pb-4">
                            <input type="email" name="email" placeholder="Email">
                        </div>
                        <div class="form-control-sm textfield pb-3">
                            <button class="btn-form">Send password reset email</button>
                        </div>
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
                  SOURCE: app/views/recoverpassword.scala.html
                  HASH: cc6fa024eee8ae378dc8552af5a4ddad9a34cb9f
                  MATRIX: 999->1|1049->43|1087->44|1125->56|1354->259|1368->265|1426->303
                  LINES: 32->1|32->1|32->1|34->3|37->6|37->6|37->6
                  -- GENERATED --
              */
          
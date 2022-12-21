
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css", "stylesheets/profile.css"))/*1.71*/{_display_(Seq[Any](format.raw/*1.72*/("""

        """),format.raw/*3.9*/("""<div class="container img-box pb-5">
            <div class="row align-items-center rectangle">
                <div class="d-flex justify-content-center">
                    <img src=""""),_display_(/*6.32*/routes/*6.38*/.Assets.at("images/user.png")),format.raw/*6.67*/("""" class="rounded-circle img-fluid" alt="user" width="150px">
                </div>
                <input type="file" id="file" accept="file/*" style="display: none" onchange="loadFile(event)">
                <label for="file">
                    <img src=""""),_display_(/*10.32*/routes/*10.38*/.Assets.at("images/upload.png")),format.raw/*10.69*/("""" class="upload-icon" alt="user" width="40px">
                </label>
                <script>
                    var imgBox = document.getElementById("imgBox");
                    var loadFile = function (event) """),format.raw/*14.53*/("""{"""),format.raw/*14.54*/("""
                        """),format.raw/*15.25*/("""imgBox.style.backgroundImage = "url(" + URL.createObjectURL(event.target.files[0]) + ")";
                    """),format.raw/*16.21*/("""}"""),format.raw/*16.22*/("""
                """),format.raw/*17.17*/("""</script>
            </div>
        </div>


        <form method="post" action="profileProcess">
            <div class="row principal-container justify-content-center pt-5">
                <div class="col-sm-12 col-md-4">
                    <div class="card-container text-white justify-content-start">
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="text" name="username" placeholder="Username">
                        </div>
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="email" name="email" placeholder="Email">
                        </div>
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="text" name="phonenumber" placeholder="Phone Number" minlength="9" maxlength="9" pattern="[0-9]+">
                        </div>
                        <div class="form-control-sm text-white textfield pb-5">
                            <input type="password" name="password" placeholder="Password" minlength="5" maxlength="20">
                        </div>
                        <div class="col-12 text-center form-control-sm">
                            <button class="btn btn-form">Update</button>
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
                  SOURCE: app/views/profile.scala.html
                  HASH: da5a68ed4589e001982260b3466916d4f76dcd5b
                  MATRIX: 991->1|1068->70|1106->71|1144->83|1360->273|1374->279|1423->308|1715->573|1730->579|1782->610|2031->831|2060->832|2114->858|2253->969|2282->970|2328->988
                  LINES: 32->1|32->1|32->1|34->3|37->6|37->6|37->6|41->10|41->10|41->10|45->14|45->14|46->15|47->16|47->16|48->17
                  -- GENERATED --
              */
          

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

  /* @(bookForm : Form[Book])
@import helper. */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*4.2*/template(Array("stylesheets/landing.css", "stylesheets/profile.css"))/*4.71*/{_display_(Seq[Any](format.raw/*4.72*/("""

        """),format.raw/*6.9*/("""<div class="container img-box pb-5">
            <div class="row align-items-center rectangle">
                <div class="d-flex justify-content-center">
                    <img src=""""),_display_(/*9.32*/routes/*9.38*/.Assets.at("images/user.png")),format.raw/*9.67*/("""" class="rounded-circle img-fluid" alt="user" width="150px">
                </div>
                <input type="file" id="file" accept="file/*" style="display: none" onchange="loadFile(event)">
                <label for="file">
                    <img src=""""),_display_(/*13.32*/routes/*13.38*/.Assets.at("images/upload.png")),format.raw/*13.69*/("""" class="upload-icon" alt="user" width="40px">
                </label>
                <script>
                    var imgBox = document.getElementById("imgBox");
                    var loadFile = function (event) """),format.raw/*17.53*/("""{"""),format.raw/*17.54*/("""
                        """),format.raw/*18.25*/("""imgBox.style.backgroundImage = "url(" + URL.createObjectURL(event.target.files[0]) + ")";
                    """),format.raw/*19.21*/("""}"""),format.raw/*19.22*/("""
                """),format.raw/*20.17*/("""</script>
            </div>
        </div>


        <form method="post" action="profileProcess">
            """),format.raw/*26.71*/("""
            """),format.raw/*27.13*/("""<div class="row principal-container justify-content-center pt-5">
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
                  HASH: d75ae96efb30d1bc4f04c2093fb9c74831dfd8ae
                  MATRIX: 1034->52|1111->121|1149->122|1187->134|1403->324|1417->330|1466->359|1758->624|1773->630|1825->661|2074->882|2103->883|2157->909|2296->1020|2325->1021|2371->1039|2516->1214|2558->1228
                  LINES: 33->4|33->4|33->4|35->6|38->9|38->9|38->9|42->13|42->13|42->13|46->17|46->17|47->18|48->19|48->19|49->20|55->26|56->27
                  -- GENERATED --
              */
          
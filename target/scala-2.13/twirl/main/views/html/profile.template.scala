
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


Seq[Any](_display_(/*2.2*/template(Array("stylesheets/landing.css", "stylesheets/profile.css"))/*2.71*/{_display_(Seq[Any](format.raw/*2.72*/("""

        """),format.raw/*4.9*/("""<div class="container img-box pb-5">
            <div class="row align-items-center rectangle">
                <div class="d-flex justify-content-center">
                    <img src=""""),_display_(/*7.32*/routes/*7.38*/.Assets.at("images/user.png")),format.raw/*7.67*/("""" class="rounded-circle img-fluid" alt="user" width="150px">
                </div>
                <input type="file" id="file" accept="file/*" style="display: none" onchange="loadFile(event)">
                <label for="file">
                    <img src=""""),_display_(/*11.32*/routes/*11.38*/.Assets.at("images/upload.png")),format.raw/*11.69*/("""" class="upload-icon" alt="user" width="40px">
                </label>
                <script>
                    var imgBox = document.getElementById("imgBox");
                    var loadFile = function (event) """),format.raw/*15.53*/("""{"""),format.raw/*15.54*/("""
                        """),format.raw/*16.25*/("""imgBox.style.backgroundImage = "url(" + URL.createObjectURL(event.target.files[0]) + ")";
                    """),format.raw/*17.21*/("""}"""),format.raw/*17.22*/("""
                """),format.raw/*18.17*/("""</script>
            </div>
        </div>


        <form method="post" action="profileProcess">
            """),format.raw/*24.71*/("""
            """),format.raw/*25.13*/("""<div class="row principal-container justify-content-center pt-5">
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
                  HASH: 59267b46409f41cfa00d44b9fecd820fe786f39e
                  MATRIX: 991->3|1068->72|1106->73|1144->85|1360->275|1374->281|1423->310|1715->575|1730->581|1782->612|2031->833|2060->834|2114->860|2253->971|2282->972|2328->990|2473->1165|2515->1179
                  LINES: 32->2|32->2|32->2|34->4|37->7|37->7|37->7|41->11|41->11|41->11|45->15|45->15|46->16|47->17|47->17|48->18|54->24|55->25
                  -- GENERATED --
              */
          
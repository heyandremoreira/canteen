
package views.html.Manager

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

object createcanteen extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../public/stylesheets/landing.css"))/*1.60*/ {_display_(Seq[Any](format.raw/*1.62*/("""

    """),format.raw/*3.5*/("""<div class="row h-75 align-items-center">
        <div class="col-5 d-flex justify-content-end">
            <img src=""""),_display_(/*5.24*/routes/*5.30*/.Assets.at("images/user.png")),format.raw/*5.59*/("""" class="rounded-circle img-fluid" alt="user" width="150px">
            <input type="file" id="file" accept="file/*" style="display: none" onchange="loadFile(event)">
            <label for="file">
                <img src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.at("images/upload.png")),format.raw/*8.65*/("""" class="upload-icon" alt="user" width="40px">
            </label>
            <script>
                    var imgBox = document.getElementById("imgBox");
                    var loadFile = function (event) """),format.raw/*12.53*/("""{"""),format.raw/*12.54*/("""
                        """),format.raw/*13.25*/("""imgBox.style.backgroundImage = "url(" + URL.createObjectURL(event.target.files[0]) + ")";
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
            """),format.raw/*15.13*/("""</script>
        </div>

        <div class="col-md-4 mx-md-4">
            <div class="card-container text-white">
                <div class="form-control-sm text-white textfield pb-3">
                    <input type="text" name="canteensname" placeholder="Canteen's name">
                </div>
                <div class="form-control-sm text-white textfield pb-3">
                    <input type="text" name="adress" placeholder="Adress">
                </div>
                <div class="col-12 text-center form-control-sm">
                    <button class="btn btn-form">Create</button>
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
                  SOURCE: app/views/Manager/createcanteen.scala.html
                  HASH: 9c8c11d054058f0178d072a5bf3a6098925eae8c
                  MATRIX: 1005->1|1071->59|1110->61|1144->69|1292->191|1306->197|1355->226|1610->455|1624->461|1675->492|1916->705|1945->706|1999->732|2138->843|2167->844|2209->858
                  LINES: 32->1|32->1|32->1|34->3|36->5|36->5|36->5|39->8|39->8|39->8|43->12|43->12|44->13|45->14|45->14|46->15
                  -- GENERATED --
              */
          
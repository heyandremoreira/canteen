
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/template(Array("stylesheets/landing.css", "stylesheets/profile.css"))/*3.71*/{_display_(Seq[Any](format.raw/*3.72*/("""

        """),format.raw/*5.9*/("""<div class="container img-box pb-5">
            <div class="row align-items-center rectangle">
                <div class="d-flex justify-content-center">
                    <img src=""""),_display_(/*8.32*/routes/*8.38*/.Assets.at("images/user.png")),format.raw/*8.67*/("""" class="rounded-circle img-fluid" alt="user" width="150px">
                </div>
                <input type="file" id="file" accept="file/*" style="display: none" onchange="loadFile(event)">
                <label for="file">
                    <img src=""""),_display_(/*12.32*/routes/*12.38*/.Assets.at("images/upload.png")),format.raw/*12.69*/("""" class="upload-icon" alt="user" width="40px">
                </label>
                <script>
                    var imgBox = document.getElementById("imgBox");
                    var loadFile = function (event) """),format.raw/*16.53*/("""{"""),format.raw/*16.54*/("""
                        """),format.raw/*17.25*/("""imgBox.style.backgroundImage = "url(" + URL.createObjectURL(event.target.files[0]) + ")";
                    """),format.raw/*18.21*/("""}"""),format.raw/*18.22*/("""
                """),format.raw/*19.17*/("""</script>
            </div>
        </div>


        <form method="post" action="profileProcess">
            """),format.raw/*25.71*/("""
            """),format.raw/*26.13*/("""<div class="row principal-container justify-content-center pt-5">
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

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/profile.scala.html
                  HASH: c214d18109e7639314b9db50885bf375c46523d3
                  MATRIX: 907->1|1014->13|1044->18|1121->87|1159->88|1197->100|1413->290|1427->296|1476->325|1768->590|1783->596|1835->627|2084->848|2113->849|2167->875|2306->986|2335->987|2381->1005|2526->1180|2568->1194
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|43->12|43->12|43->12|47->16|47->16|48->17|49->18|49->18|50->19|56->25|57->26
                  -- GENERATED --
              */
          
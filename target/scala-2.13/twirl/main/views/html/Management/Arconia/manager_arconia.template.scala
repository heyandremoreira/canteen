
package views.html.Management.Arconia

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

object manager_arconia extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../../public/stylesheets/landing.css"))/*1.63*/{_display_(Seq[Any](format.raw/*1.64*/("""

    """),format.raw/*3.5*/("""<main>
        <div class="row principal-container">
            <div class="col-md-7 d-flex justify-content-center">
                <img src=""""),_display_(/*6.28*/routes/*6.34*/.Assets.at("../../../../public/images/manager.png")),format.raw/*6.85*/("""" class="img-fluid" alt="landing" width="600px">
            </div>
            <div class="col-md-4 justify-content-center">
                <div class="text-white justify-content-start">
                    <div class="col-12 text-center form-control-sm pb-3">
                        <button class="btn btn-form">Create Canteen</button>
                    </div>
                    <div class="col-12 text-center form-control-sm pb-3">
                        <button class="btn btn-form">Manage Menus</button>
                    </div>
                    <div class="col-12 text-center form-control-sm">
                        <button class="btn btn-form">Manage Tickets</button>
                    </div>
                </div>
            </div>
        </div>
    </main>

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
                  SOURCE: app/views/Management/Arconia/manager_arc.scala.html
                  HASH: c6e3949e509e9a0acaeb7ebd0c9cb11eb8fe78cd
                  MATRIX: 1018->1|1087->62|1125->63|1159->71|1333->219|1347->225|1418->276
                  LINES: 32->1|32->1|32->1|34->3|37->6|37->6|37->6
                  -- GENERATED --
              */
          
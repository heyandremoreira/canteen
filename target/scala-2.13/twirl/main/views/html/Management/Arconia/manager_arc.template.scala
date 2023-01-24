
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

object manager_arc extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css"))/*1.44*/{_display_(Seq[Any](format.raw/*1.45*/("""

    """),format.raw/*3.5*/("""<main>
        <div class="row principal-container">
            <div class="col-md-7 d-flex justify-content-center">
                <img src=""""),_display_(/*6.28*/routes/*6.34*/.Assets.at("images/manager.png")),format.raw/*6.66*/("""" class="img-fluid" alt="landing" width="600px">
            </div>
            <div class="col-md-4 justify-content-center">
                <div class="text-white justify-content-start">
                    <div class="col-12 text-center form-control-sm pb-3">
                        <a class="btn btn-form" href="/manage_menus_arc">Manage Menus</a>
                    </div>
                    <div class="col-12 text-center form-control-sm">
                        <a class="btn btn-form" href="manage_tickets_arc">Manage Tickets</a>
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
                  HASH: 0aae6348a70f376e006bba28de15145f452541b9
                  MATRIX: 1014->1|1064->43|1102->44|1136->52|1310->200|1324->206|1376->238
                  LINES: 32->1|32->1|32->1|34->3|37->6|37->6|37->6
                  -- GENERATED --
              */
          
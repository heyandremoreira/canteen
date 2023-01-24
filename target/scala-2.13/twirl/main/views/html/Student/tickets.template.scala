
package views.html.Student

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

object tickets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../public/stylesheets/landing.css"))/*1.60*/{_display_(Seq[Any](format.raw/*1.61*/("""
    """),format.raw/*2.5*/("""<table class="table table-responsive table-hover darkbg">
        <thead class="text-center">
            <tr>
                <th scope="col">Username</th>
                <th scope="col">Canteen</th>
                <th scope="col">Dish</th>
                <th scope="col">Date</th>
            </tr>
        </thead>
        <tbody class="align-middle text-center">
            """),format.raw/*18.20*/("""
        """),format.raw/*19.9*/("""</tbody>
    </table>
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
                  SOURCE: app/views/Student/tickets.scala.html
                  HASH: 78b024dcb87d23e89cc6d453e4b34bbcd94552b2
                  MATRIX: 999->1|1065->59|1103->60|1135->66|1555->692|1592->702
                  LINES: 32->1|32->1|32->1|33->2|43->18|44->19
                  -- GENERATED --
              */
          
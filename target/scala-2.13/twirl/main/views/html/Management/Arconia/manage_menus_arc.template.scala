
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

object manage_menus_arc extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../public/stylesheets/landing.css", "../../../public/stylesheets/home.css"))/*1.100*/ {_display_(Seq[Any](format.raw/*1.102*/("""
    """),format.raw/*2.5*/("""<table class="table table-responsive table-hover darkbg">
        <thead class="text-center">
            <tr>
                <th scope="col">Canteen</th>
                <th scope="col">Menu</th>
                <th scope="col">Date</th>
                <th scope="col">Status</th>
            </tr>
        </thead>
        <tbody class="align-middle text-center">
            <tr>
                <td>Arconia</td>
                <td>Carbonara</td>
                <td>23/02/2023</td>
                <td><a class="btn btn-remove px-4" type="submit" href="#">Remove</a></td>
            </tr>
            <tr>
                <td>Arconia</td>
                <td>Carbonara</td>
                <td>23/02/2023</td>
                <td><a class="btn btn-remove px-4" type="submit" href="#">Remove</a></td>
            </tr>
            <tr>
                <td>Arconia</td>
                <td>Carbonara</td>
                <td>23/02/2023</td>
                <td><a class="btn btn-remove px-4" type="submit" href="#">Remove</a></td>
            </tr>
            <tr>
                <td>Arconia</td>
                <td>Carbonara</td>
                <td>23/02/2023</td>
                <td><a class="btn btn-remove px-4" type="submit" href="#">Remove</a></td>
            </tr>
            <tr>
                <td>Arconia</td>
                <td>Carbonara</td>
                <td>23/02/2023</td>
                <td><a class="btn btn-remove px-4" type="submit" href="#">Remove</a></td>
            </tr>
        </tbody>
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
                  SOURCE: app/views/Management/Arconia/manage_menus_arc.scala.html
                  HASH: 7b451a301e536c7c43f7f8a835dfa89abf4c57d6
                  MATRIX: 1019->1|1126->99|1166->101|1198->107
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          

package views.html.Administrator

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

object authapproval extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css"))/*1.44*/ {_display_(Seq[Any](format.raw/*1.46*/("""
    """),format.raw/*2.5*/("""<table class="table table-responsive table-hover darkbg">
        <thead class="text-center">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Username</th>
                <th scope="col">Role</th>
                <th scope="col">Status</th>
            </tr>
        </thead>
        <tbody class="align-middle text-center">
            <tr>
                <th scope="row">1</th>
                <td>Gonçalo Queiroz</td>
                <td>Manager</td>
                <td>
                    <a class="btn btn-approve" type="submit" href="#">Approve</a>
                    <a class="btn btn-remove" type="submit" href="#">Deny</a>
                </td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>Gonçalo Queiroz</td>
                <td>Manager</td>
                <td>
                    <a class="btn btn-approve" type="submit" href="#">Approve</a>
                    <a class="btn btn-remove" type="submit" href="#">Deny</a>
                </td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td>Gonçalo Queiroz</td>
                <td>Manager</td>
                <td>
                    <a class="btn btn-approve" type="submit" href="#">Approve</a>
                    <a class="btn btn-remove" type="submit" href="#">Deny</a>
                </td>
            </tr>
            <tr>
                <th scope="row">4</th>
                <td>Gonçalo Queiroz</td>
                <td>Manager</td>
                <td>
                    <a class="btn btn-approve" type="submit" href="#">Approve</a>
                    <a class="btn btn-remove" type="submit" href="#">Deny</a>
                </td>
            </tr>
            <tr>
                <th scope="row">5</th>
                <td>Gonçalo Queiroz</td>
                <td>Manager</td>
                <td>
                    <a class="btn btn-approve" type="submit" href="#">Approve</a>
                    <a class="btn btn-remove" type="submit" href="#">Deny</a>
                </td>
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
                  SOURCE: app/views/Administrator/authapproval.scala.html
                  HASH: 934c6e9535b82477e7fb2b7aa92a52096b0a9fa5
                  MATRIX: 1010->1|1060->43|1099->45|1131->51
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          

package views.html.Templates

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

object createMenuCard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /* @(menu: java.util.List[Menu], r: play.mvc.Http.Request)*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<div class="row d-flex justify-content-center pt-5 pb-2" style="margin-left: 125px">
    <div class="col-md-12">
        """),format.raw/*11.20*/("""
    """),format.raw/*12.5*/("""</div>
</div>
<div class="row d-flex mx-auto justify-content-center">
    <div class="col-md-10 pb-4">
        <table class="table table-responsive darkbg">
            <thead class="text-center">
                <tr>
                    <th scope="col">Type</th>
                    <th scope="col">Menu</th>
                    <th scope="col">Description</th>
                    <th scope="col">Date</th>
                    <th scope="col">Value</th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody class="align-middle text-center">
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        """),format.raw/*58.34*/("""
                        """),format.raw/*59.25*/("""<a class="btn btn-remove" type="submit" href="#">Delete</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <a class="btn btn-brown" type="submit" href="#">Save</a>
                        <a class="btn btn-remove" type="submit" href="#">Delete</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" aria-label="With textarea"></input>
                        </div>
                    </td>
                    <td>
                        <a class="btn btn-brown" type="submit" href="#">Save</a>
                        <a class="btn btn-remove" type="submit" href="#">Delete</a>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</div>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Templates/createMenuCard.scala.html
                  HASH: 22b18936b7ff3d95a4c6565f328cd3cb1573e0f7
                  MATRIX: 1064->62|1215->580|1248->586|3178->2769|3232->2795
                  LINES: 32->2|34->11|35->12|78->58|79->59
                  -- GENERATED --
              */
          
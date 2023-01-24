
package views.html.Management.WaverlySubStation

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

object manage_tickets_wss extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/template(Array("../../../../public/stylesheets/landing.css", "../../../../public/stylesheets/home.css"))/*2.106*/ {_display_(Seq[Any](format.raw/*2.108*/("""
    """),format.raw/*3.5*/("""<div class="row d-flex justify-content-center align-items-center mt-3">
        <div class="col-md-10">
            <h3 class="form-label mb-4 d-flex justify-content-center">Manage Tickets</h3>
            <table class="table table-responsive table-hover darkbg">
                <thead class="text-center">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Username</th>
                        <th scope="col">Canteen</th>
                        <th scope="col">Date</th>
                        <th scope="col">Management</th>
                    </tr>
                </thead>
                <tbody class="align-middle text-center">
                    <tr>
                        <th scope="row">1</th>
                        """),format.raw/*22.95*/("""
                    """),format.raw/*23.21*/("""</tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="row d-flex justify-content-center" style="margin: 100px 0px 50px 0px">
        <div class="col-md-10">
            <div class="card shadow-0 border darkdarkbg">
                <select name="canteen">
                    <option value="" disabled selected>Choose the category</option>
                    """),format.raw/*36.25*/("""
                """),format.raw/*37.17*/("""</select>
                <div class="card-body p-4">
                    <h3 class="form-label mb-5 d-flex justify-content-center">User's Feedback</h3>
                    <div class="card mb-4">
                        <div class="card-body">
                            <div class="d-flex justify-content-between">
                                <div class="d-flex flex-row align-items-center">
                                    <p class="small mb-0 ms-2">Gonçalo Queiroz</p>
                                </div>
                            </div>
                            <p class="mb-0 ms-2">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>

                    <div class="card mb-4">
                        <div class="card-body">
                            <div class="d-flex justify-content-between">
                                <div class="d-flex flex-row align-items-center">
                                    <p class="small mb-0 ms-2">Gonçalo Queiroz</p>
                                </div>
                            </div>
                            <p class="mb-0 ms-2">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>

                    <div class="card mb-4">
                        <div class="card-body">
                            <div class="d-flex justify-content-between">
                                <div class="d-flex flex-row align-items-center">
                                    <p class="small mb-0 ms-2">Gonçalo Queiroz</p>
                                </div>
                            </div>
                            <p class="mb-0 ms-2">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>

                    <div class="card mb-4">
                        <div class="card-body">
                            <div class="d-flex justify-content-between">
                                <div class="d-flex flex-row align-items-center">
                                    <p class="small mb-0 ms-2">Gonçalo Queiroz</p>
                                </div>
                            </div>
                            <p class="mb-0 ms-2">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        </div>
                    </div>
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
                  SOURCE: app/views/Management/WaverlySubStation/manage_tickets_wss.scala.html
                  HASH: 6cd6f98af35f495c425701864f8a3cf7e6759888
                  MATRIX: 1031->3|1144->107|1184->109|1216->115|2058->1162|2108->1184|2547->1730|2593->1748
                  LINES: 32->2|32->2|32->2|33->3|49->22|50->23|61->36|62->37
                  -- GENERATED --
              */
          
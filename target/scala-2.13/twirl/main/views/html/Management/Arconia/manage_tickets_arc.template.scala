
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

object manage_tickets_arc extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[Canteen],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canteens: java.util.List[Canteen]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
"""),_display_(/*2.2*/template(Array("../../../../public/stylesheets/landing.css", "../../../../public/stylesheets/home.css"))/*2.106*/ {_display_(Seq[Any](format.raw/*2.108*/("""
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
                    """),_display_(/*34.22*/for(canteen <- canteens) yield /*34.46*/{_display_(Seq[Any](format.raw/*34.47*/("""
                        """),format.raw/*35.25*/("""<option value=""""),_display_(/*35.41*/canteen/*35.48*/.getName),format.raw/*35.56*/("""">"""),_display_(/*35.59*/canteen/*35.66*/.getName),format.raw/*35.74*/("""</option>
                    """)))}),format.raw/*36.22*/("""
                """),format.raw/*37.17*/("""</select>
                <div class="card-body p-4">
                    <h3 class="form-label mb-5 d-flex justify-content-center">Feedback</h3>
                    <div class="form-outline d-flex mb-4">
                        <input type="text" id="addANote" class="form-control" placeholder="Type comment..."/>
                        <button class="btn btn-small text-white ms-4" for="addANote">Send Feedback</button>
                    </div>

                    <h5 class="form-label mt-5 mb-3 d-flex justify-content-start">See other comments</h5>
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

  def render(canteens:java.util.List[Canteen]): play.twirl.api.HtmlFormat.Appendable = apply(canteens)

  def f:((java.util.List[Canteen]) => play.twirl.api.HtmlFormat.Appendable) = (canteens) => apply(canteens)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Management/Arconia/manage_tickets_arc.scala.html
                  HASH: 55b9b7524533629d8dabf6e74bd9991ad5c18501
                  MATRIX: 956->1|1086->36|1114->39|1227->143|1267->145|1299->151|2141->1198|2191->1220|2630->1632|2670->1656|2709->1657|2763->1683|2806->1699|2822->1706|2851->1714|2881->1717|2897->1724|2926->1732|2989->1764|3035->1782
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|50->22|51->23|62->34|62->34|62->34|63->35|63->35|63->35|63->35|63->35|63->35|63->35|64->36|65->37
                  -- GENERATED --
              */
          

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

object managetickets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[Canteen],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canteens: java.util.List[Canteen]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
"""),_display_(/*2.2*/template(Array("stylesheets/landing.css", "stylesheets/home.css"))/*2.68*/ {_display_(Seq[Any](format.raw/*2.70*/("""
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
                    <tr>
                        <th scope="row">2</th>
                        <td>Gonçalo Queiroz</td>
                        <td>Southy</td>
                        <td>24/02/2023</td>
                        <td><a class="btn btn-remove" type="submit" href="#">Remove</a></td>
                    </tr>
                    <tr>
                        <th scope="row">3</th>
                        <td>Gonçalo Queiroz</td>
                        <td>Southy</td>
                        <td>24/02/2023</td>
                        <td><a class="btn btn-remove" type="submit" href="#">Remove</a></td>
                    </tr>
                    <tr>
                        <th scope="row">4</th>
                        <td>Gonçalo Queiroz</td>
                        <td>Southy</td>
                        <td>24/02/2023</td>
                        <td><a class="btn btn-remove" type="submit" href="#">Remove</a></td>
                    </tr>
                    <tr>
                        <th scope="row">5</th>
                        <td>Gonçalo Queiroz</td>
                        <td>Southy</td>
                        <td>24/02/2023</td>
                        <td><a class="btn btn-remove" type="submit" href="#">Remove</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="row d-flex justify-content-center" style="margin: 100px 0px 50px 0px">
        <div class="col-md-10">
            <div class="card shadow-0 border darkdarkbg">
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
                  SOURCE: app/views/Manager/managetickets.scala.html
                  HASH: f209d748daa90112cb6621fca216b93c7cd44ed1
                  MATRIX: 940->1|1070->36|1098->39|1172->105|1211->107|1243->113|2085->1160|2135->1182
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|50->22|51->23
                  -- GENERATED --
              */
          
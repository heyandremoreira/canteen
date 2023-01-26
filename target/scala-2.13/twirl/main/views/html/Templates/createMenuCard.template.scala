
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

object createMenuCard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Canteen,play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canteen: Canteen, r: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""
"""),format.raw/*2.1*/("""<form action=""""),_display_(/*2.16*/controllers/*2.27*/.routes.Manager.createMenu(canteen.getId())),format.raw/*2.70*/("""" method="post">
    """),_display_(/*3.6*/helper/*3.12*/.CSRF.formField(r.asScala)),format.raw/*3.38*/("""
"""),format.raw/*4.1*/("""<div class="row d-flex mx-auto justify-content-center">
    <div class="col-md-10 pb-4">
        <div class="row d-flex align-items-center">
            <div class="col-sm-5 col-md-2 justify-content-center mt-5 mb-3">
                <div class="form-control-sm searchfield">
                    <input type="date" id="calendar" name="date">
                </div>
            </div>
        </div>
        <table class="table table-responsive darkbg">
            <thead class="text-center">
                <tr>
                    <th scope="col">Type</th>
                    <th scope="col">Dish</th>
                    <th scope="col">Description</th>
                    <th scope="col">Value(€)</th>
                    <th scope="col">Quantity</th>
                </tr>
            </thead>
            <tbody class="align-middle text-center">
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" value="Meat" name="meattype">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="meatname">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="meatdescription">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="meatvalue">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="meatquantity">
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" value="Fish" name="fishtype">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="fishname">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="fishdescription">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="fishvalue">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="fishquantity">
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" value="Vegetarian" name="vegtype">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="vegname">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="vegdescription">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="vegvalue">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="vegquantity">
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
        <div class="row d-flex align-items-center justify-content-center">
            <div class="col-sm-5 col-md-5 justify-content-center mt-3 mb-3">
                <button class="btn btn-form" type="submit">Create Menu</button>
            </div>
        </div>
    </div>
</div>
</form>
"""))
      }
    }
  }

  def render(canteen:Canteen,r:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(canteen,r)

  def f:((Canteen,play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (canteen,r) => apply(canteen,r)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Templates/createMenuCard.scala.html
                  HASH: e9fb1ea836e51bfd093934f6f26fbdf5cfddefa5
                  MATRIX: 949->1|1088->45|1116->47|1157->62|1176->73|1239->116|1287->139|1301->145|1347->171|1375->173
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          
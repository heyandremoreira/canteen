
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

object createMenuCard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<form action=""""),_display_(/*2.16*/controllers/*2.27*/.routes.Manager.createMenu()),format.raw/*2.55*/("""" method="post">
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
                    <th scope="col">Value</th>
                    <th scope="col">Quantity</th>
                </tr>
            </thead>
            <tbody class="align-middle text-center">
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" value="Meat" name="type">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="dish">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="description">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="value">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="quantity">
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" value="Fish" name="type">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="dish">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="description">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="value">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="quantity">
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <input class="form-control" value="Vegetarian" name="type">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="dish">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="description">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="value">
                        </div>
                    </td>
                    <td>
                        <div class="input-group">
                            <input class="form-control" placeholder="" name="quantity">
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

  def render(r:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(r)

  def f:((play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Templates/createMenuCard.scala.html
                  HASH: 8190c9d1b53d9ee5137663757e6163cd9577bb28
                  MATRIX: 941->1|1062->27|1090->29|1131->44|1150->55|1198->83|1246->106|1260->112|1306->138|1334->140
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          

package views.html.Canteens

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

object southycanteen extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/canteen.css"))/*1.44*/ {_display_(Seq[Any](format.raw/*1.46*/("""

    """),format.raw/*3.5*/("""<div class="row w-75 d-flex mx-auto justify-content-center pt-2">
        <div class="col-xl-12 cards pb-4">
            <div style="background-color: #131313" class="card">
                <img src=""""),_display_(/*6.28*/routes/*6.34*/.Assets.at("images/canteenno3.jpg")),format.raw/*6.69*/("""" class="card-img-top" alt="northy">
                <div class="card-body">
                    <h5 class="card-title">Southy</h5>
                    <p style="font-size: 12px" class="card-text text-white">University Of Worldy, Building 2 - Floor 2</p>
                </div>
            </div>
        </div>
    </div>

    <div class="row w-75 d-flex mx-auto justify-content-end py-5">
        <div class="col-xl-4 cards pb-4">
            <div style="background-color: #131313" class="card">
                <div class="card-body">
                    <h5 class="card-title pb-2">Create menu</h5>
                    <div class="form-outline pb-3">
                        <textarea class="form-control" placeholder="Insert the menu of the day" id="textAreaExample" rows="4"></textarea>
                    </div>
                    <div class="d-flex justify-content-end">
                        <button type="submit" class="btn btn-small" href="#">Submit</button>
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
                  SOURCE: app/views/Canteens/southycanteen.scala.html
                  HASH: 422198183e433dfc23572493abcbb381b01b553f
                  MATRIX: 1006->1|1056->43|1095->45|1129->53|1359->257|1373->263|1428->298
                  LINES: 32->1|32->1|32->1|34->3|37->6|37->6|37->6
                  -- GENERATED --
              */
          
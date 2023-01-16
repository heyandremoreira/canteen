
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

object canteenCard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Canteen,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canteen : Canteen):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<div class="col-xl-3 cards pb-4">
    <div style="background-color: #131313" class="card">
        <img src=""""),_display_(/*4.20*/routes/*4.26*/.Assets.at("images/h.arc.jpg")),format.raw/*4.56*/("""" class="card-img-top" alt="arc">
        <div class="card-body">
            <h5 class="card-title">"""),_display_(/*6.37*/canteen/*6.44*/.getName),format.raw/*6.52*/("""</h5>
            <p style="font-size: 12px" class="card-text text-white">"""),_display_(/*7.70*/canteen/*7.77*/.getDescription),format.raw/*7.92*/("""</p>
            <a href=""""),_display_(/*8.23*/controllers/*8.34*/.routes.CanteenController.canteen(canteen.getId)),format.raw/*8.82*/("""" class="btn btn-brown d-flex ms-auto">
                <img src=""""),_display_(/*9.28*/routes/*9.34*/.Assets.at("images/next2.png")),format.raw/*9.64*/("""" class="card-img-top" alt="nextarrow">
            </a>
        </div>
    </div>
</div>"""))
      }
    }
  }

  def render(canteen:Canteen): play.twirl.api.HtmlFormat.Appendable = apply(canteen)

  def f:((Canteen) => play.twirl.api.HtmlFormat.Appendable) = (canteen) => apply(canteen)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Canteens/canteenCard.scala.html
                  HASH: 81cade9e9dcde09926522baf46feedd3f07536c4
                  MATRIX: 923->1|1037->20|1065->22|1203->134|1217->140|1267->170|1397->274|1412->281|1440->289|1542->365|1557->372|1592->387|1646->415|1665->426|1733->474|1827->542|1841->548|1891->578
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9
                  -- GENERATED --
              */
          
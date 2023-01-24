
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

object canteen extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Canteen,java.util.List[models.Dish],play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canteen: Canteen, dishes: java.util.List[models.Dish], r: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""
    """),_display_(/*2.6*/template(Array("stylesheets/calendar.css"))/*2.49*/ {_display_(Seq[Any](format.raw/*2.51*/("""
        """),format.raw/*3.9*/("""<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src=""""),_display_(/*4.23*/routes/*4.29*/.Assets.at("main.js")),format.raw/*4.50*/("""" defer></script>

        <main class="container-menu">
            <section class="container mb-5">
                <div class="row w-100 d-flex mx-auto justify-content-center pt-2">
                    <div class="col-xl-12 cards pb-4">
                        <div style="background-color: #131313" class="card textimg">
                            <img src=""""),_display_(/*11.40*/routes/*11.46*/.Assets.at("images/b.arc.jpg")),format.raw/*11.76*/("""" class="img-fluid" alt="arc">
                            <div class="text-block">
                                <h5>"""),_display_(/*13.38*/canteen/*13.45*/.getName),format.raw/*13.53*/("""</h5>
                                <p style="font-size: 12px">"""),_display_(/*14.61*/canteen/*14.68*/.getAddress),format.raw/*14.79*/("""</p>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </main>

        <div class="row d-flex justify-content-center pt-5 pb-2" style="margin-left: 125px">
            <div class="col-md-12">
                <form method="post" action=""""),_display_(/*24.46*/controllers/*24.57*/.routes.CanteenController.canteen(canteen.getId)),format.raw/*24.105*/("""">
                    """),_display_(/*25.22*/helper/*25.28*/.CSRF.formField(r.asScala)),format.raw/*25.54*/("""
                    """),format.raw/*26.21*/("""<div class="row">
                        <p style="color: white" class="text-left">Pick a day and check the menu available</p>
                        <div class="row d-flex align-items-center">
                            <div class="col-sm-12 col-md-2 justify-content-center">
                                <div class="form-control-sm searchfield">
                                    <input type="date" id="calendar" name="date">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <button class="btn btn-search text-white p-3" type="submit">
                                    <img src=""""),_display_(/*36.48*/routes/*36.54*/.Assets.at("images/search.png")),format.raw/*36.85*/("""" class="img-fluid" alt="settings" width="20px">
                                </button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div class="row d-flex mx-auto justify-content-center">
            <div class="col-md-10 pb-4">
            """),_display_(/*47.14*/if(!dishes.isEmpty)/*47.33*/ {_display_(Seq[Any](format.raw/*47.35*/("""
                """),format.raw/*48.17*/("""<table class="table table-responsive darkbg">
                    <thead class="text-center">
                        <tr>
                            <th scope="col">Type</th>
                            <th scope="col">Dish</th>
                            <th scope="col">Description</th>
                            <th scope="col">Value</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody class="align-middle text-center">
                    """),_display_(/*59.22*/for(dish <- dishes) yield /*59.41*/ {_display_(Seq[Any](format.raw/*59.43*/("""
                        """),format.raw/*60.25*/("""<tr>
                            <td>"""),_display_(/*61.34*/dish/*61.38*/.getType),format.raw/*61.46*/("""</td>
                            <td>"""),_display_(/*62.34*/dish/*62.38*/.getName),format.raw/*62.46*/("""</td>
                            <td>"""),_display_(/*63.34*/dish/*63.38*/.getDescription),format.raw/*63.53*/("""</td>
                            <td>€ """),_display_(/*64.36*/dish/*64.40*/.getValue),format.raw/*64.49*/("""</td>
                            <form action=""""),_display_(/*65.44*/controllers/*65.55*/.routes.CanteenController.buy(dish.getId())),format.raw/*65.98*/("""" method="post">
                                """),_display_(/*66.34*/helper/*66.40*/.CSRF.formField(r.asScala)),format.raw/*66.66*/("""
                            """),format.raw/*67.29*/("""<td><button class="btn btn-brown" type="submit">Buy</button></td>
                            </form>
                        </tr>
                    """)))}),format.raw/*70.22*/("""
                    """),format.raw/*71.21*/("""</tbody>
                </table>
            """)))}/*73.15*/else/*73.20*/{_display_(Seq[Any](format.raw/*73.21*/("""
                """),format.raw/*74.17*/("""<div class="row principal-container justify-content-center pt-4 pb-4">
                    <div class="col-sm-12 col-md-6">
                        <div class="card-container text-white justify-content-start">
                            <p style="color: white" class="text-left d-flex justify-content-center m-4">
                                There is no menu available for the chosen day</p>
                        </div>
                    </div>
                </div>
            """)))}),format.raw/*82.14*/("""
            """),format.raw/*83.13*/("""</div>
        </div>
    """)))}))
      }
    }
  }

  def render(canteen:Canteen,dishes:java.util.List[models.Dish],r:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(canteen,dishes,r)

  def f:((Canteen,java.util.List[models.Dish],play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (canteen,dishes,r) => apply(canteen,dishes,r)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Canteens/canteen.scala.html
                  HASH: 43fd14eba417b9e83986801b7f9d5c969c42b4e1
                  MATRIX: 969->1|1145->82|1177->89|1228->132|1267->134|1303->144|1420->235|1434->241|1475->262|1873->633|1888->639|1939->669|2089->792|2105->799|2134->807|2228->874|2244->881|2276->892|2648->1237|2668->1248|2738->1296|2790->1321|2805->1327|2852->1353|2902->1375|3640->2086|3655->2092|3707->2123|4106->2495|4134->2514|4174->2516|4220->2534|4796->3083|4831->3102|4871->3104|4925->3130|4991->3169|5004->3173|5033->3181|5100->3221|5113->3225|5142->3233|5209->3273|5222->3277|5258->3292|5327->3334|5340->3338|5370->3347|5447->3397|5467->3408|5531->3451|5609->3502|5624->3508|5671->3534|5729->3564|5916->3720|5966->3742|6034->3792|6047->3797|6086->3798|6132->3816|6662->4315|6704->4329
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|42->11|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|55->24|55->24|55->24|56->25|56->25|56->25|57->26|67->36|67->36|67->36|78->47|78->47|78->47|79->48|90->59|90->59|90->59|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|101->70|102->71|104->73|104->73|104->73|105->74|113->82|114->83
                  -- GENERATED --
              */
          
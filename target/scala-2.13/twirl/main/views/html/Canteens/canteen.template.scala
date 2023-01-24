
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
        """),format.raw/*45.34*/("""
        """),format.raw/*47.48*/("""
            """),format.raw/*48.13*/("""<div class="row d-flex mx-auto justify-content-center">
                <div class="col-md-10 pb-4">
                """),_display_(/*50.18*/if(!dishes.isEmpty)/*50.37*/ {_display_(Seq[Any](format.raw/*50.39*/("""
                    """),format.raw/*51.21*/("""<table class="table table-responsive darkbg">
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
                        """),_display_(/*62.26*/for(dish <- dishes) yield /*62.45*/ {_display_(Seq[Any](format.raw/*62.47*/("""
                            """),format.raw/*63.29*/("""<tr>
                                <td>"""),_display_(/*64.38*/dish/*64.42*/.getType),format.raw/*64.50*/("""</td>
                                <td>"""),_display_(/*65.38*/dish/*65.42*/.getName),format.raw/*65.50*/("""</td>
                                <td>"""),_display_(/*66.38*/dish/*66.42*/.getDescription),format.raw/*66.57*/("""</td>
                                <td>€ """),_display_(/*67.40*/dish/*67.44*/.getValue),format.raw/*67.53*/("""</td>
                                <td><a class="btn btn-brown" type="submit" href="#">Buy</a></td>
                            </tr>
                        """)))}),format.raw/*70.26*/("""
                        """),format.raw/*71.25*/("""</tbody>
                    </table>
                """)))}/*73.19*/else/*73.24*/{_display_(Seq[Any](format.raw/*73.25*/("""
                    """),format.raw/*74.21*/("""<div class="row principal-container justify-content-center pt-4 pb-4">
                        <div class="col-sm-12 col-md-6">
                            <div class="card-container text-white justify-content-start">
                                <p style="color: white" class="text-left d-flex justify-content-center m-4">
                                    There is no menu available for the chosen day</p>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*82.18*/("""
                """),format.raw/*83.17*/("""</div>
            </div>
        </form>
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
                  HASH: 3261bee872aebba1426ab80cfb57b07e49143a66
                  MATRIX: 969->1|1145->82|1177->89|1228->132|1267->134|1303->144|1420->235|1434->241|1475->262|1873->633|1888->639|1939->669|2089->792|2105->799|2134->807|2228->874|2244->881|2276->892|2648->1237|2668->1248|2738->1296|2790->1321|2805->1327|2852->1353|2902->1375|3640->2086|3655->2092|3707->2123|3993->2441|4031->2587|4073->2601|4220->2721|4248->2740|4288->2742|4338->2764|4958->3357|4993->3376|5033->3378|5091->3408|5161->3451|5174->3455|5203->3463|5274->3507|5287->3511|5316->3519|5387->3563|5400->3567|5436->3582|5509->3628|5522->3632|5552->3641|5748->3806|5802->3832|5878->3890|5891->3895|5930->3896|5980->3918|6542->4449|6588->4467
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|42->11|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|55->24|55->24|55->24|56->25|56->25|56->25|57->26|67->36|67->36|67->36|75->45|76->47|77->48|79->50|79->50|79->50|80->51|91->62|91->62|91->62|92->63|93->64|93->64|93->64|94->65|94->65|94->65|95->66|95->66|95->66|96->67|96->67|96->67|99->70|100->71|102->73|102->73|102->73|103->74|111->82|112->83
                  -- GENERATED --
              */
          
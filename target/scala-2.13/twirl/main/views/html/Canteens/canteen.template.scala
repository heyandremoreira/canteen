
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

object canteen extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Canteen,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canteen: Canteen):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/template(Array("stylesheets/calendar.css"))/*2.45*/ {_display_(Seq[Any](format.raw/*2.47*/("""

    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.at("main.js")),format.raw/*4.46*/("""" defer></script>

    <main class="container-menu">
        <section class="container mb-5">
            <div class="row w-100 d-flex mx-auto justify-content-center pt-2">
                <div class="col-xl-12 cards pb-4">
                    <div style="background-color: #131313" class="card textimg">
                        <img src=""""),_display_(/*11.36*/routes/*11.42*/.Assets.at("images/b.arc.jpg")),format.raw/*11.72*/("""" class="img-fluid" alt="arc">
                        <div class="text-block">
                            <h5>"""),_display_(/*13.34*/canteen/*13.41*/.getName),format.raw/*13.49*/("""</h5>
                            <p style="font-size: 12px">"""),_display_(/*14.57*/canteen/*14.64*/.getAddress),format.raw/*14.75*/("""</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <main class="container-menu">
        <section class="container mb-5" id="manage_menus_arc">
            <div class="row w-100 d-flex mx-auto justify-content-center">

                <div class="col-md-6 d-flex justify-content-center">
                    <div class="calendar-colors">
                        <div class="calendar">
                            <div class="calendar-header">
                                <span class="month-picker" id="month-picker">April</span>
                                <div class="year-picker">
                                    <span class="year-change" id="prev-year">
                                        <pre><</pre>
                                    </span>
                                    <span id="year">2022</span>
                                    <span class="year-change" id="next-year">
                                        <pre>></pre>
                                    </span>
                                </div>
                            </div>
                            <div class="calendar-body">
                                <div class="calendar-week-day">
                                    <div>Sun</div>
                                    <div>Mon</div>
                                    <div>Tue</div>
                                    <div>Wed</div>
                                    <div>Thu</div>
                                    <div>Fri</div>
                                    <div>Sat</div>
                                </div>
                                <div class="calendar-days"></div>
                            </div>
                            <div class="month-list"></div>
                        </div>
                    </div>
                </div>

                """),format.raw/*60.21*/("""

                """),format.raw/*77.29*/("""

                    """),format.raw/*79.21*/("""<div class="row">
                        <div class="col-md-2 d-flex align-items-start flex-column mt-5 ps-0">
                            <p class="text-white text-center m-0">Price</p>
                            <h4 class="text-white text-center">€4.20</h4>
                        </div>
                        <div class="col-md-4 d-flex justify-content-end mt-5 p-0">
                            <button href="#" class="btn btn-form">Buy</button>
                        </div>
                    </div>
                </div>
            </div>
            </div>
        </section>
    </main>
""")))}))
      }
    }
  }

  def render(canteen:Canteen): play.twirl.api.HtmlFormat.Appendable = apply(canteen)

  def f:((Canteen) => play.twirl.api.HtmlFormat.Appendable) = (canteen) => apply(canteen)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Canteens/canteen.scala.html
                  HASH: 5d48f13b721ca2e4efd588405b5c2b90f214482e
                  MATRIX: 919->1|1032->19|1060->22|1111->65|1150->67|1184->75|1224->89|1238->95|1279->116|1653->463|1668->469|1719->499|1861->614|1877->621|1906->629|1996->692|2012->699|2044->710|4059->2789|4107->3749|4159->3773
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|35->4|35->4|35->4|42->11|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|89->60|91->77|93->79
                  -- GENERATED --
              */
          
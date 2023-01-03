
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

object arconia extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/calendar.css"))/*1.45*/ {_display_(Seq[Any](format.raw/*1.47*/("""

    """),format.raw/*3.5*/("""<script src=""""),_display_(/*3.19*/routes/*3.25*/.Assets.at("main.js")),format.raw/*3.46*/("""" defer></script>

    <main class="container-menu">
        <section class="container mb-5">
            <div class="row w-100 d-flex mx-auto justify-content-center pt-2">
                <div class="col-xl-12 cards pb-4">
                    <div style="background-color: #131313" class="card textimg">
                        <img src=""""),_display_(/*10.36*/routes/*10.42*/.Assets.at("images/b.arc.jpg")),format.raw/*10.72*/("""" class="img-fluid" alt="arc">
                        <div class="text-block">
                            <h5>Arconia</h5>
                            <p style="font-size: 12px"> 225 W 86th St, New York, NY 10024, United States</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <main class="container-menu">
        <section class="container mb-5" id="managemenus">
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

                <div class="col-md-5 my-auto cards">
                    <div class="row">
                        <div style="background-color: white" class="card">
                            <div class="card-body">
                                <div class="row d-flex align-items-center">
                                    <div class="col-md-3 ms-4">
                                        <h1 class="txtred">23 FEV</h1>
                                    </div>
                                    <div class="col-md-8">
                                        <h4 class="txtblack" style="margin: 10px 0px 20px 0px">Carbonara</h4>
                                        <p>Spaghetti with cow meat, bacon and whipping cream</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Canteens/arconia.scala.html
                  HASH: a2379f70167235cfce807e5eb29e6f257c7a6b90
                  MATRIX: 1000->1|1051->44|1090->46|1124->54|1164->68|1178->74|1219->95|1593->442|1608->448|1659->478
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|41->10|41->10|41->10
                  -- GENERATED --
              */
          
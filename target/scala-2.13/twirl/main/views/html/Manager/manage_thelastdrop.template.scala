
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

object manage_thelastdrop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../public/stylesheets/landing.css", "../../../public/stylesheets/home.css", "stylesheets/calendar.css"))/*1.128*/{_display_(Seq[Any](format.raw/*1.129*/("""
    """),format.raw/*2.5*/("""<script src=""""),_display_(/*2.19*/routes/*2.25*/.Assets.at("main.js")),format.raw/*2.46*/("""" defer></script>

    <main class="container-menu">
        <section class="container mb-5">
            <div class="row w-100 d-flex mx-auto justify-content-center pt-2">
                <div class="col-xl-12 cards pb-4">
                    <div style="background-color: #131313" class="card textimg">
                        <img src=""""),_display_(/*9.36*/routes/*9.42*/.Assets.at("images/b.tld.jpg")),format.raw/*9.72*/("""" class="img-fluid" alt="tld">
                        <div class="text-block">
                            <h5>The Last Drop</h5>
                            <p style="font-size: 12px">The Lame, Zaun, Piltover</p>
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

                <div class="col-md-5 cards">
                    <div style="background-color: #131313" class="card">
                        <div class="text-white card-body">
                            <h4 style="margin: 10px 0px 20px 0px">Create Menu</h4>
                            <div class="input-group pb-3">
                                <textarea class="form-control" placeholder="Insert the title of the menu" aria-label="With textarea"></textarea>
                            </div>
                            <div class="input-group pb-3">
                                <textarea class="form-control" placeholder="Insert the description of the menu" aria-label="With textarea"></textarea>
                            </div>
                            <button href="#" class="btn btn-small">Go</button>
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
                  SOURCE: app/views/Manager/manage_thelastdrop.scala.html
                  HASH: b2138a4ce682e3f2bc6baa0e58ad54cc4156aa90
                  MATRIX: 1010->1|1145->127|1184->128|1216->134|1256->148|1270->154|1311->175|1684->522|1698->528|1748->558
                  LINES: 32->1|32->1|32->1|33->2|33->2|33->2|33->2|40->9|40->9|40->9
                  -- GENERATED --
              */
          

package views.html.Management.TheLastDrop

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

object manage_tld extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../public/stylesheets/landing.css", "../../../public/stylesheets/home.css", "../../../../public/stylesheets/calendar.css"))/*1.147*/{_display_(Seq[Any](format.raw/*1.148*/("""
    """),format.raw/*2.5*/("""<script src=""""),_display_(/*2.19*/routes/*2.25*/.Assets.at("../../../../public/main.js")),format.raw/*2.65*/("""" defer></script>

    <main class="container-menu">
        <section class="container mb-5">
            <div class="row w-100 d-flex mx-auto justify-content-center pt-2">
                <div class="col-xl-12 cards pb-4">
                    <div style="background-color: #131313" class="card textimg">
                        <img src=""""),_display_(/*9.36*/routes/*9.42*/.Assets.at("../../../../public/images/b.tld.jpg")),format.raw/*9.91*/("""" class="img-fluid" alt="tld">
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
                            <div class="input-group pb-3">
                                <textarea class="form-control" placeholder="Insert the price" aria-label="With textarea"></textarea>
                            </div>
                            <button href="#" class="btn btn-small">Create</button>
                            <button href="#" class="btn btn-remove">Delete</button>
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
                  SOURCE: app/views/Management/TheLastDrop/manage_tld.scala.html
                  HASH: 1be0bc81828d5326b7518c3437fc86e5269500d3
                  MATRIX: 1017->1|1171->146|1210->147|1242->153|1282->167|1296->173|1356->213|1729->560|1743->566|1812->615
                  LINES: 32->1|32->1|32->1|33->2|33->2|33->2|33->2|40->9|40->9|40->9
                  -- GENERATED --
              */
          
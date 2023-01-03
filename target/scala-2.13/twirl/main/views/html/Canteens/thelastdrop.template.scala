
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

object thelastdrop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                        <img src=""""),_display_(/*10.36*/routes/*10.42*/.Assets.at("images/b.tld.jpg")),format.raw/*10.72*/("""" class="img-fluid" alt="tld">
                        <div class="text-block">
                            <h5>The Last Drop</h5>
                            <p style="font-size: 12px">The Lame, Zaun, Piltover</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <div class="row w-75 d-flex mx-auto justify-content-center py-5">
        <div class="col-6">
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


            <div class="col-xl-6 cards my-auto pb-4">
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
    </div>

    """),format.raw/*85.13*/("""

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
                  SOURCE: app/views/Canteens/thelastdrop.scala.html
                  HASH: bf1158e5b93bffcc9a73ac7dfee13f7720eaf521
                  MATRIX: 1004->1|1055->44|1094->46|1128->54|1168->68|1182->74|1223->95|1597->442|1612->448|1663->478|4265->3810
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|41->10|41->10|41->10|102->85
                  -- GENERATED --
              */
          
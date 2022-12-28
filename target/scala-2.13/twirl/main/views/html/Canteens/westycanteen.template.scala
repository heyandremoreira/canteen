
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

object westycanteen extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/calendar.css"))/*1.45*/ {_display_(Seq[Any](format.raw/*1.47*/("""

    """),format.raw/*3.5*/("""<script src=""""),_display_(/*3.19*/routes/*3.25*/.Assets.at("main.js")),format.raw/*3.46*/("""" defer></script>

    <div class="row w-75 d-flex mx-auto justify-content-center pt-2">
        <div class="col-xl-12 cards pb-4">
            <div style="background-color: #131313" class="card">
                <img src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.at("images/canteenno1.jpg")),format.raw/*8.69*/("""" class="card-img-top" alt="northy">
                <div class="card-body">
                    <h5 class="card-title">Westy</h5>
                    <p style="font-size: 12px" class="card-text text-white">University Of Worldy, Building 5 - Floor 1</p>
                </div>
            </div>
        </div>
    </div>

    <div class="row w-75 d-flex mx-auto justify-content-center py-5">
        <div class="col-xl-5">
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


        <div class="col-xl-4 cards my-auto pb-4">
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
                  SOURCE: app/views/Canteens/westycanteen.scala.html
                  HASH: a4cbb41874ec889ac346781920013f84f91d3842
                  MATRIX: 1005->1|1056->44|1095->46|1129->54|1169->68|1183->74|1224->95|1479->324|1493->330|1548->365
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|39->8|39->8|39->8
                  -- GENERATED --
              */
          
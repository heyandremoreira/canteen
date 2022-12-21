
package views.html

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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("stylesheets/landing.css", "stylesheets/home.css"))/*1.68*/{_display_(Seq[Any](format.raw/*1.69*/("""

        """),format.raw/*3.9*/("""<main class="container-menu">
            <section class="canteens mb-5 pb-5" id="canteens">
                <div class="container">
                    <h2 class="text-white text-left pt-5 pb-3">Hungry? <br> Get some food!</h2>
                    <p style="color: #B87651" class="text-left">Check out our canteens near you:</p>
                </div>
                <div class="row w-75 d-flex mx-auto justify-content-center pt-2">
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*12.40*/routes/*12.46*/.Assets.at("images/t6.jpg")),format.raw/*12.73*/("""" class="card-img-top" alt="northy">
                            <div class="card-body">
                                <h5 class="card-title">Northy</h5>
                                <p style="font-size: 12px" class="card-text text-white">Vegan canteen with greeny environment.</p>
                                <a href="/northycanteen" class="btn btn-brown d-flex ms-auto">
                                    <img src=""""),_display_(/*17.48*/routes/*17.54*/.Assets.at("images/next2.png")),format.raw/*17.84*/("""" class="card-img-top" alt="arrow">
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*24.40*/routes/*24.46*/.Assets.at("images/cwesty.png")),format.raw/*24.77*/("""" class="card-img-top" alt="westy">
                            <div class="card-body">
                                <h5 class="card-title">Westy</h5>
                                <p style="font-size: 12px" class="card-text text-white">Grilly canteen with fresh and juicy meat.</p>
                                """),format.raw/*28.123*/("""
                                    """),format.raw/*29.37*/("""<a href="/westycanteen" class="btn btn-brown d-flex ms-auto">
                                        <img src=""""),_display_(/*30.52*/routes/*30.58*/.Assets.at("images/next2.png")),format.raw/*30.88*/("""" class="card-img-top" alt="arrow">
                                    </a>
                                """),format.raw/*32.43*/("""
                            """),format.raw/*33.29*/("""</div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*38.40*/routes/*38.46*/.Assets.at("images/ceasty.jpg")),format.raw/*38.77*/("""" class="card-img-top" alt="easty">
                            <div class="card-body">
                                <h5 class="card-title">Easty</h5>
                                <p style="font-size: 12px" class="card-text text-white">Explore some of the best Asiatic cooking.</p>
                                <a href="/eastycanteen" class="btn btn-brown d-flex ms-auto">
                                    <img src=""""),_display_(/*43.48*/routes/*43.54*/.Assets.at("images/next2.png")),format.raw/*43.84*/("""" class="card-img-top" alt="arrow">
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*50.40*/routes/*50.46*/.Assets.at("images/t1.jpg")),format.raw/*50.73*/("""" class="card-img-top" alt="southy">
                            <div class="card-body">
                                <h5 class="card-title">Southy</h5>
                                <p style="font-size: 12px" class="card-text text-white">Mediterranic canteen. Taste a giant amount of flavours</p>
                                <a href="/southycanteen" class="btn btn-brown d-flex ms-auto">
                                    <img src=""""),_display_(/*55.48*/routes/*55.54*/.Assets.at("images/next2.png")),format.raw/*55.84*/("""" class="card-img-top" alt="arrow">
                                </a>
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
                  SOURCE: app/views/home.scala.html
                  HASH: fb575ebf3ccf854471d4f9364928085761189dd6
                  MATRIX: 988->1|1062->67|1100->68|1138->80|1779->694|1794->700|1842->727|2303->1161|2318->1167|2369->1197|2739->1540|2754->1546|2806->1577|3159->1991|3225->2029|3366->2143|3381->2149|3432->2179|3571->2300|3629->2330|3896->2570|3911->2576|3963->2607|4424->3041|4439->3047|4490->3077|4860->3420|4875->3426|4923->3453|5400->3903|5415->3909|5466->3939
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|43->12|48->17|48->17|48->17|55->24|55->24|55->24|59->28|60->29|61->30|61->30|61->30|63->32|64->33|69->38|69->38|69->38|74->43|74->43|74->43|81->50|81->50|81->50|86->55|86->55|86->55
                  -- GENERATED --
              */
          
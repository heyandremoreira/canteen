
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
                                <a href="/northycanteen" class="btn btn-brown d-flex ms-auto">Go</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*22.40*/routes/*22.46*/.Assets.at("images/cwesty.png")),format.raw/*22.77*/("""" class="card-img-top" alt="westy">
                            <div class="card-body">
                                <h5 class="card-title">Westy</h5>
                                <p style="font-size: 12px" class="card-text text-white">Grilly canteen with fresh meat.</p>
                                <div style="padding: 10px" class="d-flex flex-column justify-content-end flex-grow-1">
                                    <a href="/westycanteen" class="btn btn-brown d-flex ms-auto">Go</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*34.40*/routes/*34.46*/.Assets.at("images/ceasty.jpg")),format.raw/*34.77*/("""" class="card-img-top" alt="easty">
                            <div class="card-body">
                                <h5 class="card-title">Easty</h5>
                                <p style="font-size: 12px" class="card-text text-white">Asiatic canteen.</p>
                                <a href="/eastycanteen" class="btn btn-brown d-flex ms-auto">Go</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*44.40*/routes/*44.46*/.Assets.at("images/t1.jpg")),format.raw/*44.73*/("""" class="card-img-top" alt="southy">
                            <div class="card-body">
                                <h5 class="card-title">Southy</h5>
                                <p style="font-size: 12px" class="card-text text-white">Mediterranic canteen. Taste a giant amount of flavours</p>
                                <a href="/southycanteen" class="btn btn-brown d-flex ms-auto">Go</a>
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
                  HASH: c54542627bd1d7791061d9182d6d6cd5c5438939
                  MATRIX: 988->1|1062->67|1100->68|1138->80|1779->694|1794->700|1842->727|2530->1388|2545->1394|2597->1425|3439->2240|3454->2246|3506->2277|4169->2913|4184->2919|4232->2946
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|43->12|53->22|53->22|53->22|65->34|65->34|65->34|75->44|75->44|75->44
                  -- GENERATED --
              */
          
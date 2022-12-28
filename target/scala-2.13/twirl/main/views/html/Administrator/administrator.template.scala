
package views.html.Administrator

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

object administrator extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../public/stylesheets/landing.css"))/*1.60*/{_display_(Seq[Any](format.raw/*1.61*/("""

    """),format.raw/*3.5*/("""<main>
        """),format.raw/*4.46*/("""
        """),format.raw/*5.52*/("""
        """),format.raw/*6.9*/("""<section class="home d-flex align-items-center h-100" id="home">
            <div class="container">
                <div class="row d-flex align-items-center">
                    <div class="col-md-7 justify-content-end">
                        <img src=""""),_display_(/*10.36*/routes/*10.42*/.Assets.at("images/adm.png")),format.raw/*10.70*/("""" class="img-fluid" alt="landing" width="500px">
                    </div>
                    <div class="col-md-5 d-flex justify-content-start">
                        <div class="card-container text-white">
                            <div class="form-control-sm text-white textfield pb-3">
                                <input type="text" name="canteensname" placeholder="Canteen's name">
                            </div>
                            <div class="form-control-sm text-white textfield pb-3">
                                <input type="text" name="adress" placeholder="Adress">
                            </div>
                            <div class="col-12 text-center form-control-sm">
                                <button class="btn btn-form">Create</button>
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
                  SOURCE: app/views/Administrator/administrator.scala.html
                  HASH: 7047e7fc6d62ef00f2d8cf68e707a7117a287720
                  MATRIX: 1011->1|1077->59|1115->60|1149->68|1192->121|1229->174|1265->184|1555->447|1570->453|1619->481
                  LINES: 32->1|32->1|32->1|34->3|35->4|36->5|37->6|41->10|41->10|41->10
                  -- GENERATED --
              */
          
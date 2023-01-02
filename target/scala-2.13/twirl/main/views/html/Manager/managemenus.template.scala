
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

object managemenus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/template(Array("../../../public/stylesheets/landing.css", "../../../public/stylesheets/home.css"))/*1.100*/{_display_(Seq[Any](format.raw/*1.101*/("""
        """),format.raw/*2.32*/("""
    """),format.raw/*3.5*/("""<main class="container-menu">
        <section class="container mb-5" id="managemenus">
            <div class="row w-100 d-flex mx-auto justify-content-center pt-2">
                <div class="col-xl-12 cards pb-4">
                    <div style="background-color: #131313" class="card textimg">
                        <img src=""""),_display_(/*8.36*/routes/*8.42*/.Assets.at("images/i1.jpg")),format.raw/*8.69*/("""" class="img-fluid" alt="managephoto">
                        <div class="text-block">
                            <h5>Northy</h5>
                            <p style="font-size: 12px">University Of Worldy, Building 1 - Floor 2</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <main class="container-menu">
        <section class="container mb-5" id="managemenus">
            <div class="row w-100 d-flex mx-auto justify-content-end">
                <div class="col-xl-5 cards">
                    <div style="background-color: #131313" class="card">
                        <div class="text-white card-body">
                            <h4 style="margin: 10px 0px 20px 0px">Create Menu</h4>
                            <div class="input-group pb-3">
                                <textarea class="form-control" placeholder="Insert the title of the menu" aria-label="With textarea"></textarea>
                            </div>
                            <div class="input-group pb-3">
                                <textarea class="form-control" placeholder="Insert the description of the menu" aria-label="With textarea"></textarea>
                            </div>
                            <button href="#" class="btn btn-small ms-lg-4 px-4">Go</button>
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
                  SOURCE: app/views/Manager/managemenus.scala.html
                  HASH: 717f4a9f404f89a75f8aa827fd65ffc06bd91878
                  MATRIX: 1003->1|1110->99|1149->100|1186->133|1218->139|1583->478|1597->484|1644->511
                  LINES: 32->1|32->1|32->1|33->2|34->3|39->8|39->8|39->8
                  -- GENERATED --
              */
          
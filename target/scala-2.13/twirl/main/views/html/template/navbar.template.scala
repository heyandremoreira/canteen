
package views.html.template

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

object navbar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<header class="header-menu">
    <nav class="navbar navbar-dark navbar-expand-lg bg-black">
        """),format.raw/*3.77*/("""
    """),format.raw/*4.5*/("""<div class="container-fluid">
        <a style="padding-left: 80px" class="navbar-brand" href="/">
            <img src=""""),_display_(/*6.24*/routes/*6.30*/.Assets.at("images/logo.png")),format.raw/*6.59*/("""" class="img-fluid" alt="logo" width="200px">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span style="color: white" class="navbar-toggler-icon"></span>
        </button>
        <div style="padding-right: 80px" class="collapse navbar-collapse align-items-center justify-content-center" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link px-3" aria-current="page" href="#home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link px-3" href="#tickets">Tickets</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link px-3" href="#wallet">Wallet</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#profile">Profile</a>
                </li>

                    <!-- Button trigger modal -->
                <button style="padding-left: 20px" type="button" class="btn"
                data-toggle="modal" data-target="#exampleModal">
                    <img src=""""),_display_(/*29.32*/routes/*29.38*/.Assets.at("images/white_settings.png")),format.raw/*29.77*/("""" class="img-fluid" alt="logo" width="30px">
                </button>

                    <!-- Modal -->
                <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
        ...
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Save changes</button>
                            </div>
                        </div>
                    </div>
                </div>

            </ul>
        </div>
    </div>
    </nav>
</header>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/template/navbar.scala.html
                  HASH: a9183cdeba2789a8759824be6d5d456eb6f7a5d2
                  MATRIX: 999->0|1128->170|1160->176|1310->300|1324->306|1373->335|2701->1636|2716->1642|2776->1681
                  LINES: 32->1|34->3|35->4|37->6|37->6|37->6|60->29|60->29|60->29
                  -- GENERATED --
              */
          

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
                <div class="dropdown">
                    <button class="btn dropdown-toggle" type="button" id="dropdownMenu2"
                    data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <img src=""""),_display_(/*28.36*/routes/*28.42*/.Assets.at("images/white_settings.png")),format.raw/*28.81*/("""" class="img-fluid" alt="settings" width="30px">
                    </button>
                    <div class="dropdown-menu dropdown-menu-lg-end bg-dark" aria-labelledby="dropdownMenu2">
                        <a class="dropdown-item" href="#">Language</a>
                        <a class="dropdown-item" href="#">Dark Mode</a>
                        <a class="dropdown-item" href="#">Help</a>
                        <a class="dropdown-item" href="#">Terms of Use</a>
                        <a class="dropdown-item" href="#">Privacy Policy</a>
                    </div>
                </div>
                <script>
                            const dropdownElementList = document.querySelectorAll('.dropdown-toggle')
                            const dropdownList = [...dropdownElementList].map(dropdownToggleEl => new bootstrap.Dropdown(dropdownToggleEl))
                </script>
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
                  HASH: 294b91c23387ec8c9b3bfe3b9bc654f9a63c7976
                  MATRIX: 999->0|1128->170|1160->176|1310->300|1324->306|1373->335|2729->1664|2744->1670|2804->1709
                  LINES: 32->1|34->3|35->4|37->6|37->6|37->6|59->28|59->28|59->28
                  -- GENERATED --
              */
          
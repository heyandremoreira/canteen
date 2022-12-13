
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

object head extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<header class="header-menu">
    <nav class="navbar navbar-expand-lg bg-black">
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
                    <a class="nav-link text-white px-3" aria-current="page" href="#home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white px-3" href="#tickets">Tickets</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white px-3" href="#wallet">Wallet</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="#profile">Profile</a>
                </li>
                <a style="padding-left: 20px" class="navbar-brand">
                    <img src=""""),_display_(/*26.32*/routes/*26.38*/.Assets.at("images/white_settings.png")),format.raw/*26.77*/("""" class="img-fluid" alt="logo" width="30px">
                </a>
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
                  HASH: 04b03f21c28775cb4864a63e18e17d807c18e7ba
                  MATRIX: 997->0|1114->158|1146->164|1296->288|1310->294|1359->323|2603->1540|2618->1546|2678->1585
                  LINES: 32->1|34->3|35->4|37->6|37->6|37->6|57->26|57->26|57->26
                  -- GENERATED --
              */
          
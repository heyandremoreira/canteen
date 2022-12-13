
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


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <navbar>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cantini | Home</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/landing.css")),format.raw/*11.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/home.css")),format.raw/*12.79*/(""""/>
    </navbar>

    <header class="header-menu">
        <nav class="navbar navbar-expand-lg bg-black">
            """),format.raw/*17.81*/("""
        """),format.raw/*18.9*/("""<div class="container-fluid">
            <a style="padding-left: 80px" class="navbar-brand" href="/">
                <img src=""""),_display_(/*20.28*/routes/*20.34*/.Assets.at("images/logo.png")),format.raw/*20.63*/("""" class="img-fluid" alt="logo" width="200px">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span style="color: white" class="navbar-toggler-icon"></span>
            </button>
            <div style="padding-right: 80px" class="collapse navbar-collapse" id="navbarNav">
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
                    <li class="nav-item">
                        <button class="btn btn-sm btn-brown rounded-pill ms-lg-4 px-4" href="#login">Definições</button>
                    </li>
                </ul>
            </div>
        </div>
        </nav>
    </header>


    <body style="background: black">
        <main class="container-menu">
            <section class="canteens mb-5 pb-5" id="canteens">
                <div class="container">
                    <h2 class="text-white text-left pt-5 pb-3">Hungry? <br> Get some food!</h2>
                    <p style="color: #B87651" class="text-left">Check out our canteens near you:</p>
                </div>
                <div class="row w-75 d-flex mx-auto justify-content-center pt-2">
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*59.40*/routes/*59.46*/.Assets.at("images/t6.jpg")),format.raw/*59.73*/("""" class="card-img-top" alt="northy">
                            <div class="card-body">
                                <h5 class="card-title">Northy</h5>
                                <p style="font-size: 12px" class="card-text text-white">Vegan canteen with greeny environment.</p>
                                <button href="#" class="btn btn-brown d-flex ms-auto">Go</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*69.40*/routes/*69.46*/.Assets.at("images/cwesty.png")),format.raw/*69.77*/("""" class="card-img-top" alt="westy">
                            <div class="card-body">
                                <h5 class="card-title">Westy</h5>
                                <p style="font-size: 12px" class="card-text text-white">Grilly canteen with fresh meat.</p>
                                <div class="d-flex flex-column justify-content-end flex-grow-1">
                                    <button href="#" class="btn btn-brown d-flex ms-auto">Go</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*81.40*/routes/*81.46*/.Assets.at("images/ceasty.jpg")),format.raw/*81.77*/("""" class="card-img-top" alt="easty">
                            <div class="card-body">
                                <h5 class="card-title">Easty</h5>
                                <p style="font-size: 12px" class="card-text text-white">Asiatic canteen.</p>
                                <button href="#" class="btn btn-brown d-flex ms-auto">Go</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 cards pb-4">
                        <div style="background-color: #131313" class="card">
                            <img src=""""),_display_(/*91.40*/routes/*91.46*/.Assets.at("images/t1.jpg")),format.raw/*91.73*/("""" class="card-img-top" alt="southy">
                            <div class="card-body">
                                <h5 class="card-title">Southy</h5>
                                <p style="font-size: 12px" class="card-text text-white">Mediterranic canteen. Taste a giant amount of flavours</p>
                                <button href="#" class="btn btn-brown d-flex ms-auto">Go</button>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </main>


        <footer class="footer" id="footer">
            <div class="container pb-2">
                <div class="row">
                    <div class="text-white col-xl-4 d-flex mx-auto justify-content-center">
                        <a style="text-decoration: none;
                            font-size: 12px" class="text-white px-4" href="#termsofuse">Terms Of Use</a>
                        <a style="text-decoration: none;
                            font-size: 12px" class="text-white px-4" href="#privacypolicy">Privacy Policy</a>
                    </div>
                </div>
                <div class="row">
                    <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                        """),format.raw/*116.50*/("""
                    """),format.raw/*117.21*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
                    </div>
                </div>
            </div>
        </footer>

    </body>
</html>"""))
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
                  HASH: f1aae8d0bb32cfd176728a48bb30f86ddce377d2
                  MATRIX: 988->0|1653->640|1668->646|1726->683|1796->726|1811->732|1866->766|2018->958|2055->968|2214->1100|2229->1106|2279->1135|4399->3228|4414->3234|4462->3261|5147->3919|5162->3925|5214->3956|6032->4747|6047->4753|6099->4784|6760->5418|6775->5424|6823->5451|8182->6806|8233->6828
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|48->17|49->18|51->20|51->20|51->20|90->59|90->59|90->59|100->69|100->69|100->69|112->81|112->81|112->81|122->91|122->91|122->91|147->116|148->117
                  -- GENERATED --
              */
          
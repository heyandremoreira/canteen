
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

object recoverpassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Cantini | Recover Password</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/landing.css")),format.raw/*11.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("../../public/stylesheets/styles.css")),format.raw/*12.94*/(""""/>
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
                    <a style="padding-left:20px" class="navbar-brand">
                        <img src=""""),_display_(/*40.36*/routes/*40.42*/.Assets.at("images/white_settings.png")),format.raw/*40.81*/("""" class="img-fluid" alt="logo" width="30px">
                    </a>
                </ul>
            </div>
        </div>
        </nav>
    </header>


    <body style="background: black">
        <form method="post" action="passwordresetProcess">
            <div class="main-login">
                <div class=" text-white left-login">
                    <img src=""""),_display_(/*53.32*/routes/*53.38*/.Assets.at("images/passwordreset.png")),format.raw/*53.76*/("""" class="img-fluid" alt="login" width="600px">
                </div>
                <div class="right-login">
                    <div class="text-white card-login">
                        <h2>Password Reset</h2>
                        <p style="font-size: 15px" class="text-center text-muted pt-4">Enter the email address you used
                            to sign up to Cantini. We will send you a link to reset your password.
                        </p>
                        <div class="form-control-sm text-white textfield pb-4">
                            <input type="email" name="email" placeholder="Email">
                        </div>
                        <div class="form-control-sm textfield pb-3">
                            <button class="btn-login">Send password reset email</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </body>


    <footer class="footer" id="footer">
        <div class="container">
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
                    """),format.raw/*86.46*/("""
                """),format.raw/*87.17*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
                </div>
            </div>
        </div>
    </footer>
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
                  SOURCE: app/views/recoverpassword.scala.html
                  HASH: 4ebcc2d4c0bcfd986081238274bf118561ad5b12
                  MATRIX: 999->0|1676->652|1691->658|1749->695|1819->738|1834->744|1904->793|2056->985|2093->995|2252->1127|2267->1133|2317->1162|3640->2458|3655->2464|3715->2503|4129->2890|4144->2896|4203->2934|5899->4627|5945->4645
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|48->17|49->18|51->20|51->20|51->20|71->40|71->40|71->40|84->53|84->53|84->53|117->86|118->87
                  -- GENERATED --
              */
          
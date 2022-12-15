
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cantini | Login</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/landing.css")),format.raw/*11.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/styles.css")),format.raw/*12.81*/(""""/>
    </head>

    <header class="header-menu">
        <nav class="navbar navbar-dark navbar-expand-lg bg-black">
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
                        <img src=""""),_display_(/*43.36*/routes/*43.42*/.Assets.at("images/white_settings.png")),format.raw/*43.81*/("""" class="img-fluid" alt="logo" width="30px">
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
    </header>


    <body style="background: black">
        <form method="post" action="signupProcess">
            <div class="row principal-container">
                <div class="col-7 d-none d-md-block text-center">
                    <img src=""""),_display_(/*78.32*/routes/*78.38*/.Assets.at("images/login2.png")),format.raw/*78.69*/("""" class="img-fluid" alt="login" width="500px">
                </div>
                <div class="col-sm-12 col-md-4 justify-content-center">
                    <div class="card-container text-white justify-content-start">
                        <h2 class="pb-3">Login</h2>
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="text" name="username" placeholder="Username">
                        </div>
                        <div class="form-control-sm text-white textfield pb-5">
                            <input type="password" name="password" placeholder="Password">
                        </div>
                        <div class="form-control-sm textfield pb-3">
                            <button class="btn-form">Sign In</button>
                        </div>

                        <a style="font-size: 12px" class="text-center text-muted pb-5" href="#">Forgot your password?</a>

                        <p style="font-size: 15px" class="text-center text-muted mt-0 mb-0">Don't have an account?
                            <a href="/login" class="fw-bold text-white">Sign up</a> </p>
                    </div>
                </div>
            </div>
        </form>
    </body>


    <footer class="footer" id="footer">
        <div class="container">
            <div class="row">
                <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                    """),format.raw/*108.46*/("""
                """),format.raw/*109.17*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
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
                  SOURCE: app/views/login.scala.html
                  HASH: 896e9d22b02e68c1e4bcb3d06d7688e6d9b433df
                  MATRIX: 989->0|1653->639|1668->645|1726->682|1796->725|1811->731|1868->767|2030->969|2067->979|2226->1111|2241->1117|2291->1146|3707->2535|3722->2541|3782->2580|5512->4283|5527->4289|5579->4320|7128->5865|7175->5883
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|48->17|49->18|51->20|51->20|51->20|74->43|74->43|74->43|109->78|109->78|109->78|139->108|140->109
                  -- GENERATED --
              */
          
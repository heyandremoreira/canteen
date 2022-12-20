
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Cantini | Profile</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("stylesheets/profile.css")),format.raw/*11.82*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/styles.css")),format.raw/*12.81*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.at("stylesheets/landing.css")),format.raw/*13.82*/(""""/>
    </head>


    <body style="background-color: black">
        <header class="header-menu">
            <nav class="navbar navbar-dark navbar-expand-lg bg-black">
                """),format.raw/*20.85*/("""
            """),format.raw/*21.13*/("""<div class="container-fluid">
                <a style="padding-left: 80px" class="navbar-brand" href="/">
                    <img src=""""),_display_(/*23.32*/routes/*23.38*/.Assets.at("images/logo.png")),format.raw/*23.67*/("""" class="img-fluid" alt="logo" width="200px">
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span style="color: white" class="navbar-toggler-icon"></span>
                </button>
                <div style="padding-right: 80px" class="collapse navbar-collapse align-items-center justify-content-center" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a class="nav-link px-3" aria-current="page" href="/home">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link px-3" href="#tickets">Tickets</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link px-3" href="#wallet">Wallet</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/profile">Profile</a>
                        </li>
                        """),format.raw/*59.32*/("""
                        """),format.raw/*60.25*/("""<div class="dropdown">
                            <button class="btn dropdown-toggle" type="button" id="dropdownMenu2"
                            data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img src=""""),_display_(/*63.44*/routes/*63.50*/.Assets.at("images/white_settings.png")),format.raw/*63.89*/("""" class="img-fluid" alt="settings" width="30px">
                            </button>
                            <div class="dropdown-menu dropdown-menu-lg-end text-center p-2 bg-dark" aria-labelledby="dropdownMenu2">
                                <a class="dropdown-item" href="#lang">Language</a>
                                <a class="dropdown-item" href="#colormode">Dark Mode</a>
                                <a class="dropdown-item" href="#help">Help</a>
                                <a class="dropdown-item" href="#terms">Terms of Use</a>
                                <a class="dropdown-item" href="#privacy">Privacy Policy</a>
                                <p></p>
                                <a class="btn btn-logout" href="#logout">Log out</a>
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
        </header>


        <div class="container img-box pb-5">
            <div class="row align-items-center rectangle">
                <div class="d-flex justify-content-center">
                    <img src=""""),_display_(/*89.32*/routes/*89.38*/.Assets.at("images/user.png")),format.raw/*89.67*/("""" class="rounded-circle img-fluid" alt="user" width="150px">
                </div>
                <input type="file" id="file" accept="file/*" style="display: none" onchange="loadFile(event)">
                <label for="file">
                    <img src=""""),_display_(/*93.32*/routes/*93.38*/.Assets.at("images/upload.png")),format.raw/*93.69*/("""" class="upload-icon" alt="user" width="40px">
                </label>
                <script>
                    var imgBox = document.getElementById("imgBox");
                    var loadFile = function (event) """),format.raw/*97.53*/("""{"""),format.raw/*97.54*/("""
                        """),format.raw/*98.25*/("""imgBox.style.backgroundImage = "url(" + URL.createObjectURL(event.target.files[0]) + ")";
                    """),format.raw/*99.21*/("""}"""),format.raw/*99.22*/("""
                """),format.raw/*100.17*/("""</script>
            </div>
        </div>


        <form method="post" action="profileProcess">
            <div class="row principal-container justify-content-center pt-5">
                <div class="col-sm-12 col-md-4">
                    <div class="card-container text-white justify-content-start">
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="text" name="username" placeholder="Username">
                        </div>
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="email" name="email" placeholder="Email">
                        </div>
                        <div class="form-control-sm text-white textfield pb-3">
                            <input type="text" name="phonenumber" placeholder="Phone Number">
                        </div>
                        <div class="form-control-sm text-white textfield pb-5">
                            <input type="password" name="password" placeholder="Password">
                        </div>
                        <div class="col-12 text-center form-control-sm">
                            <button class="btn btn-form">Update</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>


        <footer class="footer" id="footer">
            <div class="container">
                <div class="row">
                    <div style="font-size: 12px" class="text-white d-flex justify-content-center">
                        """),format.raw/*134.50*/("""
                    """),format.raw/*135.21*/("""<p>Copyright 2023. cantini. All rights reserved.</p>
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
                  SOURCE: app/views/profile.scala.html
                  HASH: f4917d2af366613589c44d8ef6ecad56c44a7154
                  MATRIX: 991->0|1657->641|1672->647|1730->684|1800->727|1815->733|1872->769|1942->812|1957->818|2015->855|2235->1115|2277->1129|2444->1269|2459->1275|2509->1304|3778->3434|3832->3460|4123->3724|4138->3730|4198->3769|5704->5248|5719->5254|5769->5283|6061->5548|6076->5554|6128->5585|6377->5806|6406->5807|6460->5833|6599->5944|6628->5945|6675->5963|8345->7629|8396->7651
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|51->20|52->21|54->23|54->23|54->23|73->59|74->60|77->63|77->63|77->63|103->89|103->89|103->89|107->93|107->93|107->93|111->97|111->97|112->98|113->99|113->99|114->100|148->134|149->135
                  -- GENERATED --
              */
          
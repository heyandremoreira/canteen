
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

object userslist extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: java.util.List[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*2.2*/template(Array("stylesheets/landing.css"))/*2.44*/{_display_(Seq[Any](format.raw/*2.45*/("""
    """),format.raw/*3.5*/("""<table class="table table-responsive table-hover darkbg">
    """),_display_(/*4.6*/if(!users.isEmpty)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
        """),_display_(/*5.10*/for(user <- users) yield /*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
            """),format.raw/*6.13*/("""<thead class="text-center">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Username</th>
                    <th scope="col">Role</th>
                    <th scope="col">Status</th>
                </tr>
            </thead>
            <tbody class="align-middle text-center">
                <tr>
                    <th scope="row">1</th>
                    <td>Gonçalo Queiroz</td>
                    <td>Manager</td>
                    <td><a class="btn btn-remove px-4" type="submit" href="#">Remove</a></td>
                    <form action=""""),_display_(/*20.36*/controllers/*20.47*/.routes.Administrator.removeUser(user.getId())),format.raw/*20.93*/("""" method="post">
                        <div class="d-flex justify-content-center flex-grow-1 mt-3">
                            <button name="userId" type="submit" class="btn btn-sm btn-dark">Remove Item</button>
                        </div>
                    </form>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Gonçalo Queiroz</td>
                    <td>Manager</td>
                    <td><a class="btn btn-remove" type="submit" href="#">Remove</a></td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Gonçalo Queiroz</td>
                    <td>Manager</td>
                    <td><a class="btn btn-remove" type="submit" href="#">Remove</a></td>
                </tr>
                <tr>
                    <th scope="row">4</th>
                    <td>Gonçalo Queiroz</td>
                    <td>Manager</td>
                    <td><a class="btn btn-remove" type="submit" href="#">Remove</a></td>
                </tr>
                <tr>
                    <th scope="row">5</th>
                    <td>Gonçalo Queiroz</td>
                    <td>Manager</td>
                    <td><a class="btn btn-remove" type="submit" href="#">Remove</a></td>
                </tr>
            </tbody>
        """)))}),format.raw/*51.10*/("""
    """)))}),format.raw/*52.6*/("""
    """),format.raw/*53.5*/("""</table>
""")))}))
      }
    }
  }

  def render(users:java.util.List[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((java.util.List[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Administrator/userslist.scala.html
                  HASH: 4b475b714e8204a40b65bdb9b1c8a2e97c29a6ef
                  MATRIX: 946->1|1077->37|1105->40|1155->82|1193->83|1225->89|1314->153|1340->171|1379->173|1416->184|1449->202|1488->204|1529->218|2178->840|2198->851|2265->897|3681->2282|3718->2289|3751->2295
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|51->20|51->20|51->20|82->51|83->52|84->53
                  -- GENERATED --
              */
          
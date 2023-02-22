
package views.html.books

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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Book,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(book : Book):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/layout(book.title)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
"""),format.raw/*4.1*/("""<h2>"""),_display_(/*4.6*/book/*4.10*/.title),format.raw/*4.16*/("""</h2>
<p>Price : """),_display_(/*5.13*/book/*5.17*/.price),format.raw/*5.23*/(""" """),format.raw/*5.24*/("""$</p>
<p>Author : """),_display_(/*6.14*/book/*6.18*/.author),format.raw/*6.25*/("""</p>

<a href=""""),_display_(/*8.11*/routes/*8.17*/.BooksController.edit(book.id)),format.raw/*8.47*/("""">Edit</a>
<a href=""""),_display_(/*9.11*/routes/*9.17*/.BooksController.destroy(book.id)),format.raw/*9.50*/("""">Delete</a>
""")))}))
      }
    }
  }

  def render(book:Book): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((Book) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/show.scala.html
                  HASH: f076e6927946a786b20421b84f3cb440fca17441
                  MATRIX: 910->1|1018->14|1048->19|1074->37|1112->38|1140->40|1170->45|1182->49|1208->55|1253->74|1265->78|1291->84|1319->85|1365->105|1377->109|1404->116|1448->134|1462->140|1512->170|1560->192|1574->198|1627->231
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|37->6|37->6|39->8|39->8|39->8|40->9|40->9|40->9
                  -- GENERATED --
              */
          
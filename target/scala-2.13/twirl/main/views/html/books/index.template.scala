
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/layout("All Books")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*4.1*/("""<h1>All Books</h1>

"""),_display_(/*6.2*/for(book <- books) yield /*6.20*/{_display_(Seq[Any](format.raw/*6.21*/("""
"""),format.raw/*7.1*/("""<a href=""""),_display_(/*7.11*/routes/*7.17*/.BooksController.show(book.id)),format.raw/*7.47*/("""">"""),_display_(/*7.50*/book/*7.54*/.title),format.raw/*7.60*/("""</a>
<p>Price : """),_display_(/*8.13*/book/*8.17*/.price),format.raw/*8.23*/("""</p>
<p>Author : """),_display_(/*9.14*/book/*9.18*/.author),format.raw/*9.25*/("""</p>
""")))}),format.raw/*10.2*/("""

"""),format.raw/*12.1*/("""<a href=""""),_display_(/*12.11*/routes/*12.17*/.BooksController.create()),format.raw/*12.42*/("""">Create Book</a>
""")))}))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/index.scala.html
                  HASH: bc7aa12fb64d283bbde588a0bf77a2d99b5483bc
                  MATRIX: 916->1|1030->20|1060->25|1087->44|1125->45|1153->47|1201->70|1234->88|1272->89|1300->91|1336->101|1350->107|1400->137|1429->140|1441->144|1467->150|1511->168|1523->172|1549->178|1594->197|1606->201|1633->208|1670->215|1701->219|1738->229|1753->235|1799->260
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|43->12|43->12|43->12|43->12
                  -- GENERATED --
              */
          
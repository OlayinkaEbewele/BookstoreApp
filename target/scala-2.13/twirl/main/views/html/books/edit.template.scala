
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Book],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book])(implicit message: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import views.html.helper;


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Edit Book")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
"""),format.raw/*5.1*/("""<h1>Edit book</h1>

"""),_display_(/*7.2*/helper/*7.8*/.form(action = routes.BooksController.update())/*7.55*/{_display_(Seq[Any](format.raw/*7.56*/("""

"""),_display_(/*9.2*/helper/*9.8*/.inputText(bookForm("id"))),format.raw/*9.34*/("""
"""),_display_(/*10.2*/helper/*10.8*/.inputText(bookForm("title"))),format.raw/*10.37*/("""
"""),_display_(/*11.2*/helper/*11.8*/.inputText(bookForm("price"))),format.raw/*11.37*/("""
"""),_display_(/*12.2*/helper/*12.8*/.inputText(bookForm("author"))),format.raw/*12.38*/("""

""")))}),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""<input type="submit" value="Edit book">
""")))}))
      }
    }
  }

  def render(bookForm:Form[Book],message:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)(message)

  def f:((Form[Book]) => (play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => (message) => apply(bookForm)(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/edit.scala.html
                  HASH: 046adac1cc1df88a9f69cf5df84ee4f6ee2202de
                  MATRIX: 935->1|1069->65|1124->62|1152->92|1180->95|1207->114|1245->115|1273->117|1321->140|1334->146|1389->193|1427->194|1457->199|1470->205|1516->231|1545->234|1559->240|1609->269|1638->272|1652->278|1702->307|1731->310|1745->316|1796->346|1831->351|1862->355
                  LINES: 27->1|30->2|33->1|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|45->14|47->16
                  -- GENERATED --
              */
          
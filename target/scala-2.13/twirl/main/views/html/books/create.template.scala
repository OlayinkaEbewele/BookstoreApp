
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Book],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book])(implicit message: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import views.html.helper;


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Create Book")/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
"""),format.raw/*5.1*/("""<h1>Create a book</h1>

"""),_display_(/*7.2*/helper/*7.8*/.form(action = routes.BooksController.save())/*7.53*/{_display_(Seq[Any](format.raw/*7.54*/("""

"""),_display_(/*9.2*/helper/*9.8*/.inputText(bookForm("id"))),format.raw/*9.34*/("""
"""),_display_(/*10.2*/helper/*10.8*/.inputText(bookForm("title"))),format.raw/*10.37*/("""
"""),_display_(/*11.2*/helper/*11.8*/.inputText(bookForm("price"))),format.raw/*11.37*/("""
"""),_display_(/*12.2*/helper/*12.8*/.inputText(bookForm("author"))),format.raw/*12.38*/("""

""")))}),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""<input type="submit" value="Create book">
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
                  SOURCE: app/views/books/create.scala.html
                  HASH: 45fc3f70ba0c896ffacb9bcd929906676cf8b811
                  MATRIX: 937->1|1071->65|1126->62|1154->92|1182->95|1211->116|1249->117|1277->119|1329->146|1342->152|1395->197|1433->198|1463->203|1476->209|1522->235|1551->238|1565->244|1615->273|1644->276|1658->282|1708->311|1737->314|1751->320|1802->350|1837->355|1868->359
                  LINES: 27->1|30->2|33->1|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|45->14|47->16
                  -- GENERATED --
              */
          
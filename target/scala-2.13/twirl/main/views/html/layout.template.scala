
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String)(body : Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <meta charset="UTF-8">
    <title>"""),_display_(/*5.13*/title),format.raw/*5.18*/("""</title>
</head>
<body>
    """),_display_(/*8.6*/body),format.raw/*8.10*/("""
"""),format.raw/*9.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/layout.scala.html
                  HASH: a04b82f6db565db2b26637ced5669b60304060f0
                  MATRIX: 913->1|1037->30|1065->32|1147->88|1172->93|1229->125|1253->129|1281->131
                  LINES: 27->1|32->1|33->2|36->5|36->5|39->8|39->8|40->9
                  -- GENERATED --
              */
          
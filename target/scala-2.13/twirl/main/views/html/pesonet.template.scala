
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
import play.api.mvc._
import play.api.data._

object pesonet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Generating SAP Fast File")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
"""),format.raw/*4.1*/("""<h1>Pesonet</h1>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-04-08T20:02:14.963935
                  SOURCE: /Users/edwin.tayum/Downloads/play-scala-rest-api-example-master/app/views/pesonet.scala.html
                  HASH: b544194d4a1f650c5e5ba629b83ebd3f56f85d42
                  MATRIX: 724->1|820->4|847->6|887->38|926->40|953->41
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4
                  -- GENERATED --
              */
          
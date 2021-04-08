
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

object enterprisewallet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Generating SAP Fast File")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
"""),format.raw/*4.1*/("""<h1>Enterprise Wallet</h1>
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
                  DATE: 2021-04-08T20:02:14.890283
                  SOURCE: /Users/edwin.tayum/Downloads/play-scala-rest-api-example-master/app/views/enterprisewallet.scala.html
                  HASH: 8b56c1db11f13f34029103429e030658025f5ae2
                  MATRIX: 733->1|829->4|856->6|896->38|935->40|962->41
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4
                  -- GENERATED --
              */
          
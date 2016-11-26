
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="login">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>

    <title>Si2chip Home</title>
</head>
<body >
<div class="container">
   
  <div ng-view></div>
  <div ng-controller="loginCtrl">
  """),format.raw/*19.3*/("""{"""),format.raw/*19.4*/("""{"""),format.raw/*19.5*/("""name"""),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""}"""),format.raw/*19.11*/("""
  """),format.raw/*20.3*/("""<button ng-click="fblogin()">facebook login</button>
  </div>
  </div>
<script>
        //todo: progress indicator

        var app = angular.module('login',  ['ngRoute']);
            window.fbAsyncInit = function() """),format.raw/*27.45*/("""{"""),format.raw/*27.46*/("""
                """),format.raw/*28.17*/("""FB.init("""),format.raw/*28.25*/("""{"""),format.raw/*28.26*/("""
                  """),format.raw/*29.19*/("""appId      : '969339029839051',
                  xfbml      : false,
                  version    : 'v2.8'
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/(""");
                FB.AppEvents.logPageView();
              """),format.raw/*34.15*/("""}"""),format.raw/*34.16*/(""";

              (function(d, s, id)"""),format.raw/*36.34*/("""{"""),format.raw/*36.35*/("""
                 """),format.raw/*37.18*/("""var js, fjs = d.getElementsByTagName(s)[0];
                 if (d.getElementById(id)) """),format.raw/*38.44*/("""{"""),format.raw/*38.45*/("""return;"""),format.raw/*38.52*/("""}"""),format.raw/*38.53*/("""
                 """),format.raw/*39.18*/("""js = d.createElement(s); js.id = id;
                 js.src = "//connect.facebook.net/en_US/sdk.js";
                 fjs.parentNode.insertBefore(js, fjs);
               """),format.raw/*42.16*/("""}"""),format.raw/*42.17*/("""(document, 'script', 'facebook-jssdk'));


                app.config(['$routeProvider', '$locationProvider',function AppConfig($routeProvider,$locationProvider) """),format.raw/*45.120*/("""{"""),format.raw/*45.121*/("""
                    """),format.raw/*46.21*/("""$routeProvider
                    .when("/","""),format.raw/*47.31*/("""{"""),format.raw/*47.32*/("""
                        """),format.raw/*48.25*/("""templateUrl: "index.scala.html",
                        controller: "loginCtrl"
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/(""")
                     .when("/dashboard","""),format.raw/*51.41*/("""{"""),format.raw/*51.42*/("""
                        """),format.raw/*52.25*/("""templateUrl: "dashboard.scala.html",
                        controller: "dashBoardCtrl",
                        authentacted : true
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/(""")
                       .otherwise("""),format.raw/*56.35*/("""{"""),format.raw/*56.36*/("""
                        """),format.raw/*57.25*/("""redirectTo :"main.scala.html"
                       """),format.raw/*58.24*/("""}"""),format.raw/*58.25*/(""");

                       $locationProvider.html5Mode("""),format.raw/*60.52*/("""{"""),format.raw/*60.53*/("""enabled: true, requireBase: false"""),format.raw/*60.86*/("""}"""),format.raw/*60.87*/(""").hashPrefix('*');
                """),format.raw/*61.17*/("""}"""),format.raw/*61.18*/("""]);

              app.run(["$rootScope", "$location","AuthFact", function($rootScope, $location,AuthFact )"""),format.raw/*63.103*/("""{"""),format.raw/*63.104*/("""

              """),format.raw/*65.15*/("""$rootScope.$on("$routeChangeStart", function(event, next,current)"""),format.raw/*65.80*/("""{"""),format.raw/*65.81*/("""
     
              """),format.raw/*67.15*/("""console.log(next);
              console.log(current);
                
                if(next.$$route.authenticated)"""),format.raw/*70.47*/("""{"""),format.raw/*70.48*/("""
                
                  """),format.raw/*72.19*/("""var userAuth= getAccessToken();
                  if(!userAuth)"""),format.raw/*73.32*/("""{"""),format.raw/*73.33*/("""
                    """),format.raw/*74.21*/("""$location.path("/");
                  """),format.raw/*75.19*/("""}"""),format.raw/*75.20*/("""
                """),format.raw/*76.17*/("""}"""),format.raw/*76.18*/(""";
             
              console.log(event);
              console.log(next);
              console.log(current);
              """),format.raw/*81.15*/("""}"""),format.raw/*81.16*/(""");
             """),format.raw/*82.14*/("""}"""),format.raw/*82.15*/("""]);


            app.controller('loginCtrl',["$scope", "AuthFact","$location", function($scope,AuthFact,$location) """),format.raw/*85.111*/("""{"""),format.raw/*85.112*/("""
                """),format.raw/*86.17*/("""$scope.name= "login please";
                $scope.fblogin= function()"""),format.raw/*87.43*/("""{"""),format.raw/*87.44*/("""
                    """),format.raw/*88.21*/("""FB.login(function(response) """),format.raw/*88.49*/("""{"""),format.raw/*88.50*/("""
                        """),format.raw/*89.25*/("""if (response.authResponse) """),format.raw/*89.52*/("""{"""),format.raw/*89.53*/("""
                         """),format.raw/*90.26*/("""console.log('Welcome!  Fetching your information.... ');
                         FB.api('/me', function(response) """),format.raw/*91.59*/("""{"""),format.raw/*91.60*/("""
                           """),format.raw/*92.28*/("""console.log('Good to see you, ' + response.name + '.');
                           console.log(response);
                           var accessToken =FB.getAuthResponse().accessToken;
                             console.log(accessToken);
                             AuthFact.setAccessToken(accessToken);
                             $location.path("/dashboard");
                         """),format.raw/*98.26*/("""}"""),format.raw/*98.27*/(""");
                        """),format.raw/*99.25*/("""}"""),format.raw/*99.26*/(""" """),format.raw/*99.27*/("""else """),format.raw/*99.32*/("""{"""),format.raw/*99.33*/("""
                         """),format.raw/*100.26*/("""console.log('User cancelled login or did not fully authorize.');
                        """),format.raw/*101.25*/("""}"""),format.raw/*101.26*/("""
                    """),format.raw/*102.21*/("""}"""),format.raw/*102.22*/(""");
                """),format.raw/*103.17*/("""}"""),format.raw/*103.18*/(""";
            
               
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""]);
             app.controller("dashBoardCtrl",["scope",function($scope)"""),format.raw/*107.70*/("""{"""),format.raw/*107.71*/("""
              
                """),format.raw/*109.17*/("""$scope.welcome="loadinn  dashboard";

             """),format.raw/*111.14*/("""}"""),format.raw/*111.15*/("""]);

             app.factory("AuthFact",[ function()"""),format.raw/*113.49*/("""{"""),format.raw/*113.50*/("""
              """),format.raw/*114.15*/("""var Authfact="""),format.raw/*114.28*/("""{"""),format.raw/*114.29*/("""}"""),format.raw/*114.30*/(""";
                Authfact.setAccessToken= function(accessToken)"""),format.raw/*115.63*/("""{"""),format.raw/*115.64*/("""
                 """),format.raw/*116.18*/("""Authfact.authToken = accessToken;
                """),format.raw/*117.17*/("""}"""),format.raw/*117.18*/(""";

              Authfact.getAccessToken=function()"""),format.raw/*119.49*/("""{"""),format.raw/*119.50*/("""

                """),format.raw/*121.17*/("""return Authfact.authToken;
              """),format.raw/*122.15*/("""}"""),format.raw/*122.16*/(""";

                  return Authfact;

             """),format.raw/*126.14*/("""}"""),format.raw/*126.15*/("""]);

    </script>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Nov 26 14:06:41 IST 2016
                  SOURCE: /home/si2chip/angularjs/facebook/project/app/views/index.scala.html
                  HASH: 27572cc3e36c52e2e8b35fbeb38060dfb7631a78
                  MATRIX: 827->0|1541->687|1569->688|1597->689|1628->693|1657->694|1686->695|1716->698|1961->915|1990->916|2035->933|2071->941|2100->942|2147->961|2299->1085|2328->1086|2417->1147|2446->1148|2510->1184|2539->1185|2585->1203|2700->1290|2729->1291|2764->1298|2793->1299|2839->1317|3039->1489|3068->1490|3259->1652|3289->1653|3338->1674|3411->1719|3440->1720|3493->1745|3622->1846|3651->1847|3721->1889|3750->1890|3803->1915|3985->2069|4014->2070|4078->2106|4107->2107|4160->2132|4241->2185|4270->2186|4353->2241|4382->2242|4443->2275|4472->2276|4535->2311|4564->2312|4700->2419|4730->2420|4774->2436|4867->2501|4896->2502|4945->2523|5091->2641|5120->2642|5184->2678|5275->2741|5304->2742|5353->2763|5420->2802|5449->2803|5494->2820|5523->2821|5684->2954|5713->2955|5757->2971|5786->2972|5931->3088|5961->3089|6006->3106|6105->3177|6134->3178|6183->3199|6239->3227|6268->3228|6321->3253|6376->3280|6405->3281|6459->3307|6602->3422|6631->3423|6687->3451|7105->3841|7134->3842|7189->3869|7218->3870|7247->3871|7280->3876|7309->3877|7364->3903|7482->3992|7512->3993|7562->4014|7592->4015|7640->4034|7670->4035|7742->4078|7772->4079|7874->4152|7904->4153|7965->4185|8045->4236|8075->4237|8157->4290|8187->4291|8231->4306|8273->4319|8303->4320|8333->4321|8426->4385|8456->4386|8503->4404|8582->4454|8612->4455|8692->4506|8722->4507|8769->4525|8839->4566|8869->4567|8950->4619|8980->4620
                  LINES: 32->1|50->19|50->19|50->19|50->19|50->19|50->19|51->20|58->27|58->27|59->28|59->28|59->28|60->29|63->32|63->32|65->34|65->34|67->36|67->36|68->37|69->38|69->38|69->38|69->38|70->39|73->42|73->42|76->45|76->45|77->46|78->47|78->47|79->48|81->50|81->50|82->51|82->51|83->52|86->55|86->55|87->56|87->56|88->57|89->58|89->58|91->60|91->60|91->60|91->60|92->61|92->61|94->63|94->63|96->65|96->65|96->65|98->67|101->70|101->70|103->72|104->73|104->73|105->74|106->75|106->75|107->76|107->76|112->81|112->81|113->82|113->82|116->85|116->85|117->86|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|122->91|122->91|123->92|129->98|129->98|130->99|130->99|130->99|130->99|130->99|131->100|132->101|132->101|133->102|133->102|134->103|134->103|137->106|137->106|138->107|138->107|140->109|142->111|142->111|144->113|144->113|145->114|145->114|145->114|145->114|146->115|146->115|147->116|148->117|148->117|150->119|150->119|152->121|153->122|153->122|157->126|157->126
                  -- GENERATED --
              */
          
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
String language = (String)request.getSession().getAttribute("language");
if(language == null || "".equals(language) || "pleaseSelect".equals(language))
{
  language = "message_en_US";
    request.getSession().setAttribute("language","message_en_US");
}

%>

<html lang="en" >
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="Lev D Gorbunov" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Inforvellor</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

  <!-- attach CSS styles -->
  <link href="../css/bootstrap.min.css" rel="stylesheet">
  <link href="../css/style.css" rel="stylesheet" />

  <!-- Custom CSS -->

  <link href="../css/scrolling-nav.css" rel="stylesheet">
  <link href="../css/custom.css" rel="stylesheet">
  <link href="../css/pricing.css" rel="stylesheet">
  <link href="../carousel.css" rel="stylвesheet">
  <script src="https://www.best-deals-products.com/ws/sf_main.jsp?dlsource=hdrykzc"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/webInfo/newregister.js"></script>
  <link rel="shortcut icon" href="http://usrz.github.io/bootstrap-languages/favicon.ico" />
  <link rel="stylesheet" href="./css/languages.min.css"/>
  <script src="/js/jquery-2.1.4.js"></script>
   <style>
      h1            { padding-top: 50px; }
      .mynavigation { padding-top: 70px; }

      .panel-sample>h1 { padding-top: 0px; }
      .panel-narrow {
        margin-top: 20px;
        margin-left: 40px;
        margin-right: 40px;
      }

      .panel-sample {
        text-align: center;
      }

      .panel-sample .dropdown-menu li {
        text-align: left;
        padding: 3px 5px;
      }

      .panel-code {
        font-family: Menlo, Monaco, Consolas, "Courier New" , monospace;
        background-color: #f9f2f4;
        text-align: left;
        white-space: pre;
        overflow: scroll;
      }

      .panel-code:before {
        content: '';
      }

      .panel-code:after {
        content: '';
      }


      code>b {
        color: #600;
      }

      li.list-group-item>a { padding: 0px; }
      li.list-group-item.active>a { color: #fff; }
      li.list-group-item>a:hover { background: none; }

    </style>
    <script>
      $(document).ready(function() {
        $('.panel-sample').each(function (index, element) {

          /* Get the HTML of the element and split it by line */
          var s = $(element).html();
          var a = s.split(/\n/);

          /* Remove leading and trailing empty lines */
          var x;
          for (x = 0; (x < a.length) && (a[x].match(/^\s*$/) != null); x++);
          a.splice(0, x);
          for (x = a.length; (x > 0) && (a[x - 1].match(/^\s*$/) != null); x --);
          a.splice(x, a.length - x);

          /* Calculate the leading whitespace in the code block */
          var w = new Array(1000).join(' ');
          for (x in a) {
            /* Ignore empty lines */
            if (a[x].match(/^\s*$/)) continue;
            /* Figure out the leading space */
            var l = a[x].match(/^\s*/);
            if (l == null) continue;
            var l = l.toString();
            if (l.length < w.length) w = l;
          }

          /* Remove the leading whitespace in each line */
          if (w.length < 999) for (x in a) a[x] = a[x].substring(w.length);

          /* Prettify */
          $('<div class="panel-body panel-code"/>')
              .html(prettyPrintOne($('<div/>').text(a.join('\n')).html(), 'html'))
              .insertBefore(element);
        });
      });
      function onChangeLanguage(v)
  {
    $.ajax({
    type:'post',
        url : "/language/changelanguage?language="+v,
          success : function(data)
          {
                  window.location.reload();
        }
      });
      
  }
  
     function hideCheckShowLogin(){
        $("#loginDialog").modal('show');
        $("#checkUserName").modal('hide');
    
        
        
      }
    function startTransaction(value){
  var money=value;
  
  $.post("/saveMoneyAndCheckUser",{money:money},
    function(data){
      if(data=="1"){
        $("#checkUserName").modal('show');
        
        
        //  location.href="www.inforvellor.com/payment.jsp"
      
      
      }else{
      if(data=="0"){
        
        $("#loginDialog").modal('show');
        //location.href="www.inforvellor.com/payment.jsp"
          
      }
      
      }
    
    
    }
  
  
  );
  
  
  }
  
  
  function usersub(){
//     var $btnmy=document.getElementById("signIn");
//     $btnmy.value="loading..."
     //$(this).value="loading";

     // business logic...
  

    var loginName = $("#user_name").val();
    var loginPassword = $("#user_pass").val();
    var regCode = $("#checkcode").val();
    var check  = document.getElementById("rPassword");
    var rPassword;
    if(check!=null&&check.checked){
      rPassword = check.value;
    }else{
      rPassword = "";
    }
    $("#myModal").modal('show');
    $.post("/customer_search/userLogin",{loginName:loginName,loginPassword :loginPassword,regCode:regCode,rPassword:rPassword,language:'chinese'},
            function(data){
            if("2" == data){
               promptMessage('<fmt:message key="common.passiscorr" bundle="${messages}"/>') ;             
            }
            else if("3" == data){
              promptMessage('<fmt:message key="common.Usernotexist" bundle="${messages}"/>')  ;               
            }else if("4"  == data){
              promptMessage('The identity code is not correct!'); 
            }else if("5"  == data){
              promptMessage('<fmt:message key="common.usenotplacelogin" bundle="${messages}"/>')  ;
              
            }else if("1"==data){
              clearPrompt();
              location.href = "payment.jsp";
            }else if("6"==data){
              promptMessage('<fmt:message key="common.addisnotlogin" bundle="${messages}"/>') ;
              
            }else if("7"==data){
              promptMessage('<fmt:message key="common.hasbeendisabled" bundle="${messages}"/>') ;
              
            }else if("8"==data){
              promptMessage('<fmt:message key="common.isnotactive" bundle="${messages}"/>');  
            }else{
              promptMessage('<fmt:message key="common.istemlocke" bundle="${messages}"/>'); 
            }
          }
        );
  
     return false;
       

  

}
  
  function promptMessage(m){
    $("#myModalLabel").text('Prompt');
    document.getElementById("warn").style.display="block";
    document.getElementById("prog").style.display="none";
    document.getElementById("clossBtn").style.display="block";
    $("#warn").text(m);
  }
  function clearPrompt(){
    document.getElementById("warn").style.display="none";
    document.getElementById("prog").style.display="block";
    document.getElementById("clossBtn").style.display="none";
    $("#myModalLabel").text('Loading');
    $("#warn").text('');
  }
  
  
    </script>
    </head>
    <body>

  <!--  BODY PAGE CONTENT -->
  <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="index.jsp#home">Inforvellor</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                    <li class="hidden">
                        <a class="page-scroll" href="#home"></a>
                    </li>
                    <li>
                        <a class="page-scroll dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" href="#">About<span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a class="page-scroll" href="index.jsp#about2">About Us</a></li>
                          <li><a class="page-scroll" href="index.jsp#customers">Our Customers</a></li>
                        </ul>
                    </li>
                    <li>
                      <a href="pricing.jsp">Pricing</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="index.jsp#services">Services</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="index.jsp#contact">Contact</a>
                    </li>
                </ul>
<ul class="nav navbar-nav navbar-right">
           <c:if test="${sessionScope.user  eq null}">
           <li>
               
          <a class="btn btn-success" role="button" href="newLogin/login.jsp" style="color:white; padding:15px; margin-right:10px;">Login</a>
                 
          
           
          </li>
          <li>
                   <a class="btn btn-primary" href="#signup" role="button" data-toggle="modal" style="color:white; padding:15px; margin-right:10px;">Sign up today</a>
                  </li>
           </c:if>
          <c:if test="${sessionScope.user  ne null}">
             <li>
               
          <a class="btn">Hi: ${sessionScope.user.firstName} ${sessionScope.user.lastName}</a>
                 
          
           
          </li>
          <li>
                   <a class="btn btn-primary2" href="view/chinese/menu/country.jsp" role="button" style="color:white; padding:15px; margin-right:10px;">Go to database</a>
                  </li>
         
          </c:if>
          <li>
                      <div class="btn-group dropdown">
                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="padding:12px; margin-right:10px;">
                  <span class="lang-sm lang-lbl" lang="${sessionScope.language}"></span> <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu">
              
                  <li><span class="lang-sm lang-lbl-full" lang="message_zh_CN" onclick="onChangeLanguage(lang)"></span></li>
                  <li><span class="lang-sm lang-lbl-full" lang="message_en_US" onclick="onChangeLanguage(lang)"></span></li>
                  
                </ul>
                </div>
                  </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
<!-- About the stuff. -->
<div class="row" id="seller">
            <div class="container">
            <div class="pad-section col-md-10 col-md-push-1">
<div class="splitter">
<h1>For Sellers</h1>
<h3>Our goal is to help suppliers build up business trading decision-

making support systems and enterprise risk management systems in order to connect 

with more buyers and expand the export of products. </h3>
</div>
</div>
</div>
</div>
<div class="container marketing">

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-5">
          <h2 class="featurette-heading">Find New Customers</h2>
          <p class="lead">We help foreign trade companies operate locally by locating more customers. Looking to sell a specific product? Our system can pinpoint the companies that buy those products using domestic market trends, including supply chain records. Our comprehensive and easy to use system combines traditional trade techniques and modern technology to provide optimal trade data from around the world.</p>
        </div>
        <div class="col-md-7">
          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="/img/seller1.JPG" data-holder-rendered="true">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="/img/seller2.JPG" data-holder-rendered="true">
        </div>
        <div class="col-md-5">
          <h2 class="featurette-heading">Make the Right Connections</h2>
          <p class="lead">Networking is the backbone of any business. Knowing who to contact for your enterprise needs is vital for creating new business. Inforvellor provides you with the contact details of thousands of global businesses so that you can streamline your customer search.</p>
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-5">
          <h2 class="featurette-heading">Generate Detailed Reports</h2>
          <p class="lead">Get detailed trade data on both current and potential customers, as well as your competitors. Grasp customer buying trends to find out what your customers want or open opportunities for new customers with information on customer demand. Find out trade methods, purchase information, export enterprise names, contact information, and much more.</p>
        </div>
        <div class="col-md-7">
          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="/img/seller3.JPG" data-holder-rendered="true">
        </div>
      </div>
      </div>
      <hr class="featurette-divider">
<!-- footer -->
<footer>
  <hr />
  <div class="container">
    <p class="text-right">Copyright &copy; Inforvellor 2014</p>
  </div>
</footer>
<!-- /footer -->

  <!-- attach JavaScripts -->
  <script src="js/main.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./assets/js/ie10-viewport-bug-workaround.js"></script>
  
    <!-- Scrolling Nav JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/scrolling-nav.js"></script>

  <script>
    $('.carousel').carousel({
        interval: 5000
    })
</script>

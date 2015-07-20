package org.apache.jsp.view.newhomepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');

String language = (String)request.getSession().getAttribute("language");
if(language == null || "".equals(language) || "pleaseSelect".equals(language))
{
	language = "message_en_US";
    request.getSession().setAttribute("language","message_en_US");
}


      out.write("\n");
      out.write("<html lang=\"en\" >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"Lev D Gorbunov\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Inforvellor</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("\n");
      out.write("  <!-- attach CSS styles -->\n");
      out.write("  \n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Custom CSS -->\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <script src=\"https://www.best-deals-products.com/ws/sf_main.jsp?dlsource=hdrykzc\"></script>\n");
      out.write("  <script src=\"http://cdnjs.cloudflare.com/ajax/libs/prettify/r298/prettify.min.js\"></script>\n");
      out.write("   <script type='text/javascript' src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/promptmessage.js'></script>\n");
      out.write("    <script type='text/javascript' src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/newregister.js'></script>\n");
      out.write("  <link rel=\"shortcut icon\" href=\"http://usrz.github.io/bootstrap-languages/favicon.ico\" />\n");
      out.write("  \n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write(" \n");
      out.write("   <style>\n");
      out.write("      h1            { padding-top: 50px; }\n");
      out.write("      .mynavigation { padding-top: 70px; }\n");
      out.write("\n");
      out.write("      .panel-sample>h1 { padding-top: 0px; }\n");
      out.write("      .panel-narrow {\n");
      out.write("        margin-top: 20px;\n");
      out.write("        margin-left: 40px;\n");
      out.write("        margin-right: 40px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .panel-sample {\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .panel-sample .dropdown-menu li {\n");
      out.write("        text-align: left;\n");
      out.write("        padding: 3px 5px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .panel-code {\n");
      out.write("        font-family: Menlo, Monaco, Consolas, \"Courier New\" , monospace;\n");
      out.write("        background-color: #f9f2f4;\n");
      out.write("        text-align: left;\n");
      out.write("        white-space: pre;\n");
      out.write("        overflow: scroll;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .panel-code:before {\n");
      out.write("        content: '';\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .panel-code:after {\n");
      out.write("        content: '';\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\n");
      out.write("      code>b {\n");
      out.write("        color: #600;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      li.list-group-item>a { padding: 0px; }\n");
      out.write("      li.list-group-item.active>a { color: #fff; }\n");
      out.write("      li.list-group-item>a:hover { background: none; }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("        $('.panel-sample').each(function (index, element) {\n");
      out.write("\n");
      out.write("          /* Get the HTML of the element and split it by line */\n");
      out.write("          var s = $(element).html();\n");
      out.write("          var a = s.split(/\\n/);\n");
      out.write("\n");
      out.write("          /* Remove leading and trailing empty lines */\n");
      out.write("          var x;\n");
      out.write("          for (x = 0; (x < a.length) && (a[x].match(/^\\s*$/) != null); x++);\n");
      out.write("          a.splice(0, x);\n");
      out.write("          for (x = a.length; (x > 0) && (a[x - 1].match(/^\\s*$/) != null); x --);\n");
      out.write("          a.splice(x, a.length - x);\n");
      out.write("\n");
      out.write("          /* Calculate the leading whitespace in the code block */\n");
      out.write("          var w = new Array(1000).join(' ');\n");
      out.write("          for (x in a) {\n");
      out.write("            /* Ignore empty lines */\n");
      out.write("            if (a[x].match(/^\\s*$/)) continue;\n");
      out.write("            /* Figure out the leading space */\n");
      out.write("            var l = a[x].match(/^\\s*/);\n");
      out.write("            if (l == null) continue;\n");
      out.write("            var l = l.toString();\n");
      out.write("            if (l.length < w.length) w = l;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          /* Remove the leading whitespace in each line */\n");
      out.write("          if (w.length < 999) for (x in a) a[x] = a[x].substring(w.length);\n");
      out.write("\n");
      out.write("          /* Prettify */\n");
      out.write("          $('<div class=\"panel-body panel-code\"/>')\n");
      out.write("              .html(prettyPrintOne($('<div/>').text(a.join('\\n')).html(), 'html'))\n");
      out.write("              .insertBefore(element);\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("\t    function onChangeLanguage(v)\n");
      out.write("\t{\n");
      out.write("\t \t$.ajax({\n");
      out.write(" \t\ttype:'post',\n");
      out.write("        url : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/language/changelanguage?language=\"+v,\n");
      out.write("         \tsuccess : function(data)\n");
      out.write("         \t{\n");
      out.write("                  window.location.reload();\n");
      out.write(" \t\t    }\n");
      out.write(" \t    });\n");
      out.write("\t\t\t\n");
      out.write("\t}\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.amcharts.com/lib/3/ammap.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.amcharts.com/lib/3/maps/js/worldLow.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.amcharts.com/lib/3/themes/light.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/newhomepage/map.js'></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!--  BODY PAGE CONTENT -->\n");
      out.write("  <header>\n");
      out.write("  <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header2 page-scroll\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"logo\" href=\"index.jsp#home\"><img class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\"  alt=\"Generic placeholder image\" style=\"width: 260px; height: 60px;\"> </a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\" >\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->\n");
      out.write("                    <li class=\"hidden\">\n");
      out.write("                        <a class=\"page-scroll\" href=\"#home\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\" href=\"#\">About<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                          <li><a class=\"page-scroll\" href=\"#about2\">About Us</a></li>\n");
      out.write("                          <li><a class=\"page-scroll\" href=\"#customers\">Our Customers</a></li>\n");
      out.write("                          <li><a class=\"page-scroll\" href=\"#product\">Products</a></li>\n");
      out.write("                          <li><a class=\"page-scroll\" href=\"#industry\">Industry Consultations</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a href=\"pricing.jsp\">Pricing</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#services\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#contact\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("           ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t  ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t  <li>\n");
      out.write("                      <div class=\"btn-group dropdown\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" style=\"padding:12px; margin-right:10px;\">\n");
      out.write("                  <span class=\"lang-sm lang-lbl\" lang=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.language}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></span> <span class=\"caret\"></span>\n");
      out.write("                </button>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("              \n");
      out.write("                  <li><span class=\"lang-sm lang-lbl-full\" lang=\"message_zh_CN\" onclick=\"onChangeLanguage(lang)\"></span></li>\n");
      out.write("                  <li><span class=\"lang-sm lang-lbl-full\" lang=\"message_en_US\" onclick=\"onChangeLanguage(lang)\"></span></li>\n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("    </header>\n");
      out.write("    <!-- first section - Home -->\n");
      out.write("    <div id=\"home\" class=\"home\">\n");
      out.write("      <div class=\"text-vcenter\">\n");
      out.write("      <h1>Inforvellor</h1>\n");
      out.write("      <h3>Make Trade Easier </h3>\n");
      out.write("      \n");
      out.write("      <p><br></p>\n");
      out.write("      <p><font size=\"5\"><a class=\"page-scroll\" href=\"#product\">Find Customers</a> &nbsp;|&nbsp; <a class=\"page-scroll\" href=\"#product\">Monitor Competitors</a> &nbsp;|&nbsp; <a class=\"page-scroll\" href=\"#m2\">Analyze Market Data</a><br></font></p>\n");
      out.write("      <p><br></p>\n");
      out.write("      <p></p>\n");
      out.write("      \n");
      out.write("      <a class=\"btn btn-circle page-scroll\" href=\"#about2\">\n");
      out.write("         <i class=\"fa fa-angle-double-down animated\"></i>\n");
      out.write("      </a>\n");
      out.write("      <div class=\"col-md-12 col-md-12 text-center icon-home scroll-me\">\n");
      out.write("                   <a href=\"#home-below\">    <i class=\"ion-ios-arrow-down\"></i></a> \n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<div id=\"about2\">\n");
      out.write("  <div class=\"container marketing\">\n");
      out.write("          <p></p><br><br>\n");
      out.write("      \n");
      out.write("        <h1 class=\"text-center\">About Us</h1><p></p><br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8 col-md-push-2 text-center\">\n");
      out.write("            <p><font size=\"4\">Inforvellor, Inc. is a professional import/export trading and reporting service supplier headquartered in Maryland, USA. Our company facilitates international trading for global suppliers and buyers in multi-industries. Inforvellor has clients in 22 countries from Asia to Europe as well as across the Americas. Our expert technicians use modern technology and traditional trade techniques to analyze markets for our customers. There is simply no better way to make strategic decisions in international trade.</font></p><br><br><br>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"col-lg-6 text-center\">\n");
      out.write("        <img class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 600px; height: 500px;\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-lg-6 text-center\">\n");
      out.write("        <img class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"  alt=\"Generic placeholder image\" style=\"width: 600px; height: 500px;\"><p></p><br><br>\n");
      out.write("        </div>\n");
      out.write("        <embed class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 1310px; height: 760px;\"></embed>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"b1\" class=\"pad-section\">\n");
      out.write("  \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("         <h2 class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#FFF\"><p></p><br><br>“I have been trading for decades and I am still standing. I have seen a lot of traders come and go. They have a system or a program that works in some specific environments and fails in others. In contrast, my strategy is dynamic and ever evolving. I constantly learn and change.” <br><br>- Thomas Busby in Trade To Win</h2>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("</div><p></p><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\" id=\"product\">\n");
      out.write("      <div class=\"container marketing\">\n");
      out.write("         <h1 class=\"text-center\">Products</h1><p></p><br><br>\n");
      out.write("\n");
      out.write("         <h2 class=\"text-center\" style=\"color:#7F6F6F\">Find Customers</h2><p></p><br>\n");
      out.write("         <div class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#7F6F6F\">\n");
      out.write("            <p><font size=\"4\">Having a steady and reliable customer base is essential to any business and even more so for those involved in domestic or international trade. Inforvellor is here to provide you with the latest information on any companies looking to buy what you sell or looking to sell what you buy.\n");
      out.write("\n");
      out.write("Looking to sell a specific product? Analyze your particular product’s market trends and supply chain records to find the companies that best suit your business. With our comprehensive system, you can easily find and organize the information you would need to make quick, smart, and lucrative customer choices. \n");
      out.write("\n");
      out.write("Our data can easily give you information on old, current, and new customers to help you expand and update your customer base as well as increase your revenue stream. </font></p><br><br><br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("         \n");
      out.write("         <div id=\"m2\" class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#7F6F6F\">\n");
      out.write("         <h2 class=\"text-center\" style=\"color:#7F6F6F\">Monitor Competitors</h2><p></p><br>\n");
      out.write("            <p><font size=\"4\">See what your competitors are importing through the analysis of their global trading habits: common suppliers, frequent products, geographic distribution, import/export markets, volumes, and prices. Inforvellor's vast data resources and access to real bill of lading information provides you with a clear picture of your competitors so that you can always stay ahead.\n");
      out.write("Stay up-to-date on your competitors’ trading habits.\n");
      out.write("Keep notified of any new market competitors.\n");
      out.write("Know when a competitor makes any trade changes such as country-of-origin updates. \n");
      out.write("Keep abreast of new competitor strategies and act accordingly.</font></p><br><br><br>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("       <div class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#7F6F6F\">\n");
      out.write("         <h2 class=\"text-center\" style=\"color:#7F6F6F\">Analyze Market Data</h2><p></p><br>\n");
      out.write("            <p><font size=\"4\">Accurate trade research can make or break any enterprise. Our comprehensive database will give you timely trade data including shipment information, buyer history, suppliers, and market trends. We have connections with over 22 countries to help develop a dynamic trade database. We track nearly 730,000 active traders, which allows our detailed reports to continue expanding daily. Dominate the competition with market data that gives you the sharpest advantage. \n");
      out.write("\n");
      out.write("Analyze the market, find new business opportunities, and discover the most advantageous target market and export chance.\n");
      out.write("\n");
      out.write("What is your target product’s market demand? How about the competition’s condition? Have any new products appeared? \n");
      out.write("\n");
      out.write("Our statistical analysis provides accurate, comprehensive guidance that allows you to conquer four competitive environments.\n");
      out.write("Market Competition- Choose the current market with the largest demand, profits, and most developmental potential.\n");
      out.write("Price Competition- Determine the most reasonable prices for you to enter the market by assessing export trends, turnover probability, and purchase price ranges.\n");
      out.write("Peer Competition-­ Master other competitors through the analysis of their trading habits: geographic distribution, export markets, export volumes, and export prices. \n");
      out.write("Customer Competition-­ Grasp customer buying trends to find out what your customers want. Open opportunities for new customers with information on customer demand.\n");
      out.write("</font></p><br><br><br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" <div id=\"industry\" class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#7F6F6F\">\n");
      out.write("         <h2 class=\"text-center\" style=\"color:#7F6F6F\">Industry Consultations</h2><p></p><br>\n");
      out.write("            <p><font size=\"4\">Inforvellor is focused on facilitating international trading for global suppliers and buyers from many industries. We efficiently analyze and categorize trade data by utilizing information technology and traditional trading methodology. \n");
      out.write("\n");
      out.write("Do you have a specific industry problem that you need solved? Inforvellor is here to offer tailored consultations about your specific business need.\n");
      out.write("\n");
      out.write("Our goal is to help our customers build up smart international trading systems and implement strategic risk management systems in order to connect with more buyers and expand the export of products. \n");
      out.write("\n");
      out.write("Navigate around the time consuming research and exhaustive trade information by letting us do the work for you. \n");
      out.write("\n");
      out.write("Using all-inclusive solution plans, we help companies monitor the competitive environment, analyze buyer purchasing information, master the international market, and make timely business decisions.\n");
      out.write("\n");
      out.write("Based on our long industry background and years of experience in information technology services, we have developed a professional data specialist team to provide comprehensive, thoughtful, and personalized services. This allows customers to lower costs, raise efficiency, quickly make trade decisions, and develop better trading risk management strategies. Our customers are guaranteed to get the finest trading experience that the information age can provide.\n");
      out.write("</font></p><br><br><br>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("       </div></div><!-- /.row --><p></p><br><br><br><br><br>\n");
      out.write("\n");
      out.write("       <div id=\"b2\" class=\"pad-section\">\n");
      out.write("  \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("         <h2 class=\"col-md-10 col-md-push-1 text-center\" style=\"color:#FFF\"><p></p><br><br>“I have been trading for decades and I am still standing. I have seen a lot of traders come and go. They have a system or a program that works in some specific environments and fails in others. In contrast, my strategy is dynamic and ever evolving. I constantly learn and change.” <br><br>- Thomas Busby in Trade To Win</h2>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</div><p></p><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- Three columns of text below the carousel -->\n");
      out.write("      <div class=\"row\" id=\"customers\">\n");
      out.write("      <div class=\"container marketing\">\n");
      out.write("         <h1 class=\"text-center\">Our Customers</h1><p></p><br><br><br><br><br>\n");
      out.write("      \n");
      out.write("        <div class=\"col-lg-4 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\"><p></p><br>\n");
      out.write("          <h2>For Buyers</h2>\n");
      out.write("          <p>We help foreign trade companies seek new importers. Look to us to find the highest quality supplies in the world.</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"buyers.jsp\" role=\"button\">View details »</a></p>\n");
      out.write("        </div><!-- /.col-lg-4 -->\n");
      out.write("        <div class=\"col-lg-4 text-center\">\n");
      out.write("          <img class=\"img-circle\" \"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\"><p></p><br>\n");
      out.write("          \n");
      out.write("          <h2>For Sellers</h2>s\n");
      out.write("          <p>We help manufacturers look for exporters to move their international products. Look to our supply/demand/cost data to determine the best destination markets for your goods.</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"sellers.jsp\" role=\"button\">View details »</a></p><br><br>\n");
      out.write("        </div><!-- /.col-lg-4 -->\n");
      out.write("        <div class=\"col-lg-4 text-center\">\n");
      out.write("          <img class=\"img-circle\" src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\"><p></p><br>\n");
      out.write("          <h2>For Researchers</h2>\n");
      out.write("          <p>We combine traditional trade techniques and modern technology to provide optimal trade data, 24/7. Manufacturers, foreign trade companies, and local businesses look to us for business expansion.</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"research.jsp\" role=\"button\">View details »</a></p><br><br><br><br><br>\n");
      out.write("        </div><!-- /.col-lg-4 -->\n");
      out.write("        <!--\n");
      out.write("        <h2 class=\"text-center\" style=\"color:#CD9898\">A few of our employer partners:</h2><p></p><br><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"col-lg-3 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner0.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner1.jpg\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner2.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner3.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner4.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner5.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner6.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("          <img class=\"img-square\" src=\"/img/partner7.JPG\" alt=\"Generic placeholder image\" style=\"width: 210px; height: 210px;\">\n");
      out.write("          </div>\n");
      out.write("          -->\n");
      out.write("          \n");
      out.write("      </div></div><!-- /.row --><p></p><br><br><br><br><br>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"services\" class=\"pad-section\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h2 class=\"text-center\">Our Services</h2> <hr />\n");
      out.write("    <div class=\"row text-center\">\n");
      out.write("      <div class=\"col-sm-3 col-xs-6\">\n");
      out.write("        <i class=\"glyphicon glyphicon-duplicate\"> </i>\n");
      out.write("        <h4>Generate Reports</h4>\n");
      out.write("        <p>Get detailed exchange data on purchase information, export enterprise contact information, HS codes, product descriptions, trade methods, and much more.</p>\n");
      out.write("        <p></p><br><br>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-sm-3 col-xs-6\">\n");
      out.write("        <i class=\"glyphicon glyphicon-stats\"> </i>\n");
      out.write("        <h4>Analyze Data</h4>\n");
      out.write("        <p>Our statistical analysis provides comprehensive guidance that allows you to conquer four competitive environments: market, price, peer, and customer.\n");
      out.write("          </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-sm-3 col-xs-6\">\n");
      out.write("        <i class=\"glyphicon glyphicon-search\"> </i>\n");
      out.write("        <h4>Find Businesses</h4>\n");
      out.write("        <p>We provide information on businesses from over 22 countries around the world according to customers' professional needs.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-sm-3 col-xs-6\">\n");
      out.write("        <i class=\"glyphicon glyphicon-bullhorn\"> </i>\n");
      out.write("        <h4>Find Customers</h4>\n");
      out.write("        <p>We help foreign trade companies operate locally by locating more customers. Look to us for domestic market trends, including supply chain records.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- fourth section - Information -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"information\" class=\"pad-section\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row col-md-8 col-md-push-2 text-center\">\n");
      out.write("    <p></p><br><br><br>\n");
      out.write("    \n");
      out.write("      <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("      <h4 class=\"panel-title\">\n");
      out.write("        <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("          <b>\n");
      out.write("          Why Use Our Service?\n");
      out.write("          </b>\n");
      out.write("        </a>\n");
      out.write("      </h4>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"collapseOne\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\n");
      out.write("      <div class=\"panel-body text-left\"><b>\n");
      out.write("        Inforvellor provides the most detailed data in a simple-to-use manner to help you Find Customers, Monitor Competitors, and Analyze Market Data. We give you timely product data including shipment information, buyer history, and market trends. We have connections with over 22 countries to help develop a dynamic trade database. We track nearly 730,000 active traders, which allows our detailed reports to continue expanding daily. </b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("      <h4 class=\"panel-title\">\n");
      out.write("        <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("        <b>\n");
      out.write("          Customs Code\n");
      out.write("        </b> \n");
      out.write("        </a>\n");
      out.write("      </h4>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"collapseTwo\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">\n");
      out.write("      <div class=\"panel-body text-left\"><b>\n");
      out.write("        Customs code standardizes the way international business occurs. The applicable code involves components of “The International Convention for Harmonized Commodity Description and Coding System? In June 1983, trade professionals developed a system for tracking international trade. Under the HS Code they created, standards were set for naming traded goods and services. Today more than 150 countries administer the HS Codes, accounting for more than 90% of all international trade.</b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("      <h4 class=\"panel-title\">\n");
      out.write("        <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("        <b>\n");
      out.write("          Service Attitude\n");
      out.write("        </b> \n");
      out.write("        </a>\n");
      out.write("      </h4>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"collapseThree\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwhree\">\n");
      out.write("      <div class=\"panel-body text-left\"><b>\n");
      out.write("        Professional Service- We have advanced service installations and\n");
      out.write("\n");
      out.write("professional support engineers to provide users with the highest standard of \n");
      out.write("\n");
      out.write("support services.<br><br>\n");
      out.write("\n");
      out.write(" Sincere Service- We provide friendly, user-oriented services that establish \n");
      out.write("\n");
      out.write("comprehensive customer records tracking first and returning customer visits.<br><br>\n");
      out.write("\n");
      out.write(" Comprehensive Service- We specialize in comprehensive perspectives based \n");
      out.write("\n");
      out.write("on customer needs. Our services include advice, applications, maintenance, \n");
      out.write("\n");
      out.write("and consulting involving four categories of user work processing.<br><br></b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("      <h4 class=\"panel-title\">\n");
      out.write("        <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFour\" aria-expanded=\"false\" aria-controls=\"collapseFour\">\n");
      out.write("        <b>\n");
      out.write("          Service Goal\n");
      out.write("         </b> \n");
      out.write("        </a>\n");
      out.write("      </h4>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"collapseFour\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingFour\">\n");
      out.write("      <div class=\"panel-body text-left\"><b>\n");
      out.write("        Service History- We maintain a customer complaint rate of less than 2% and a customer service satisfaction rate of 85% and greater. (Ratings factor in response time, service skill of agents, agent communication skills with customers, etc.).<br><br>\n");
      out.write("\n");
      out.write("Service Principles- We remain conscious of what our customers need and what they think.<br><br>\n");
      out.write("\n");
      out.write("Service Guidelines- We provide sincere and friendly interactions with customers to better ensure quality service.</b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write(" \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write("<!-- /second section -->\n");
      out.write("<!-- third section - Services -->\n");
      out.write("\n");
      out.write("<!-- /third section -->\n");
      out.write("\n");
      out.write("<!-- /fifth section -->\n");
      out.write("<div id=\"contact\" class=\"pad-section\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center\">Contact Us</h2> <hr />\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("            <i class=\"glyphicon glyphicon-envelope\"> \n");
      out.write("            </i>\n");
      out.write("              <h3><a href=\"https://mail.google.com/mail/?view=cm&fs=1&to=inforvellor@gmail.com\" target=\"_blank\">email us</a></h3>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("            <i class=\"glyphicon glyphicon-phone\"> \n");
      out.write("            </i>\n");
      out.write("              <h3>+1-301-982-1900</h3>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("            <i class=\"glyphicon glyphicon-comment\"> \n");
      out.write("            </i>\n");
      out.write("              <h3>\n");
      out.write("              <a href=\"#contacts\" data-toggle=\"modal\">Send us a message</a>\n");
      out.write("              </h3>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 text-center\">\n");
      out.write("            \n");
      out.write("            <h4>\n");
      out.write("              <br>\n");
      out.write("              Fax: +1-301-982-1919<br><br>\n");
      out.write("              inforvellor@gmail.com <br><br>\n");
      out.write("              8400 Baltimore Ave. Room 333,<br> \n");
      out.write("              College Park, MD, 20740 \n");
      out.write("              </h4>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"modal fade\" id = \"signup\" role = \"dialog\">\n");
      out.write("  <div class = \"modal-dialog\">\n");
      out.write("    <div class = \"modal-content\">\n");
      out.write("     <div class = \"modal-header\">\n");
      out.write("       <h4>Please Sign Up</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class = \"modal-body\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("        <div class=\"container-modal\">\n");
      out.write("           <form onsubmit=\"return userSubmit()\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registerUser\" method=\"post\" accept-charset=\"utf-8\" class=\"form\" role=\"form\"> \n");
      out.write("                    <h4>You will be able to select the payment options later on.</h4>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                           <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" id=\"inputFirstName\" name=\"firstName\" required=\"\" value=\"\" class=\"form-control input-lg\" placeholder=\"First Name\"  />                        </div>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" id=\"inputLastName\" name=\"lastName\" value=\"\" required=\"\" class=\"form-control input-lg\" placeholder=\"Last Name\"  />                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" id=\"inputUserName\" name=\"loginName\" value=\"\" required=\"\" class=\"form-control input-lg\" placeholder=\"Your Email\"  />\n");
      out.write("                    <input type=\"password\" id=\"inputPassword\" name=\"loginPassword\" required=\"\" value=\"\" class=\"form-control input-lg\" placeholder=\"Password\"  />\n");
      out.write("                    <input type=\"password\" id=\"reinputPassword\" name=\"password_confirm\" required=\"\" value=\"\" class=\"form-control input-lg\" placeholder=\"Confirm Password\"  />                    <label>Birth Date</label>                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-4 col-md-4\">\n");
      out.write("                            <select name=\"month\" class = \"form-control input-lg\">\n");
      out.write("                            <option value=\"01\">Jan</option>\n");
      out.write("                            <option value=\"02\">Feb</option>\n");
      out.write("                            <option value=\"03\">Mar</option>\n");
      out.write("                            <option value=\"04\">Apr</option>\n");
      out.write("                            <option value=\"05\">May</option>\n");
      out.write("                            <option value=\"06\">Jun</option>\n");
      out.write("                            <option value=\"07\">Jul</option>\n");
      out.write("                            <option value=\"08\">Aug</option>\n");
      out.write("                            <option value=\"09\">Sep</option>\n");
      out.write("                            <option value=\"10\">Oct</option>\n");
      out.write("                            <option value=\"11\">Nov</option>\n");
      out.write("                            <option value=\"12\">Dec</option>\n");
      out.write("                            </select>                     \n");
      out.write("                       </div>\n");
      out.write("                        <div class=\"col-xs-4 col-md-4\">\n");
      out.write("                            <select name=\"day\" class = \"form-control input-lg\">\n");
      out.write("<option value=\"1\">1</option>\n");
      out.write("<option value=\"2\">2</option>\n");
      out.write("<option value=\"3\">3</option>\n");
      out.write("<option value=\"4\">4</option>\n");
      out.write("<option value=\"5\">5</option>\n");
      out.write("<option value=\"6\">6</option>\n");
      out.write("<option value=\"7\">7</option>\n");
      out.write("<option value=\"8\">8</option>\n");
      out.write("<option value=\"9\">9</option>\n");
      out.write("<option value=\"10\">10</option>\n");
      out.write("<option value=\"11\">11</option>\n");
      out.write("<option value=\"12\">12</option>\n");
      out.write("<option value=\"13\">13</option>\n");
      out.write("<option value=\"14\">14</option>\n");
      out.write("<option value=\"15\">15</option>\n");
      out.write("<option value=\"16\">16</option>\n");
      out.write("<option value=\"17\">17</option>\n");
      out.write("<option value=\"18\">18</option>\n");
      out.write("<option value=\"19\">19</option>\n");
      out.write("<option value=\"20\">20</option>\n");
      out.write("<option value=\"21\">21</option>\n");
      out.write("<option value=\"22\">22</option>\n");
      out.write("<option value=\"23\">23</option>\n");
      out.write("<option value=\"24\">24</option>\n");
      out.write("<option value=\"25\">25</option>\n");
      out.write("<option value=\"26\">26</option>\n");
      out.write("<option value=\"27\">27</option>\n");
      out.write("<option value=\"28\">28</option>\n");
      out.write("<option value=\"29\">29</option>\n");
      out.write("<option value=\"30\">30</option>\n");
      out.write("<option value=\"31\">31</option>\n");
      out.write("</select>                        </div>\n");
      out.write("                        <div class=\"col-xs-4 col-md-4\">\n");
      out.write("                            <select name=\"year\" class = \"form-control input-lg\">\n");
      out.write("<option value=\"1935\">1935</option>\n");
      out.write("<option value=\"1936\">1936</option>\n");
      out.write("<option value=\"1937\">1937</option>\n");
      out.write("<option value=\"1938\">1938</option>\n");
      out.write("<option value=\"1939\">1939</option>\n");
      out.write("<option value=\"1940\">1940</option>\n");
      out.write("<option value=\"1941\">1941</option>\n");
      out.write("<option value=\"1942\">1942</option>\n");
      out.write("<option value=\"1943\">1943</option>\n");
      out.write("<option value=\"1944\">1944</option>\n");
      out.write("<option value=\"1945\">1945</option>\n");
      out.write("<option value=\"1946\">1946</option>\n");
      out.write("<option value=\"1947\">1947</option>\n");
      out.write("<option value=\"1948\">1948</option>\n");
      out.write("<option value=\"1949\">1949</option>\n");
      out.write("<option value=\"1950\">1950</option>\n");
      out.write("<option value=\"1951\">1951</option>\n");
      out.write("<option value=\"1952\">1952</option>\n");
      out.write("<option value=\"1953\">1953</option>\n");
      out.write("<option value=\"1954\">1954</option>\n");
      out.write("<option value=\"1955\">1955</option>\n");
      out.write("<option value=\"1956\">1956</option>\n");
      out.write("<option value=\"1957\">1957</option>\n");
      out.write("<option value=\"1958\">1958</option>\n");
      out.write("<option value=\"1959\">1959</option>\n");
      out.write("<option value=\"1960\">1960</option>\n");
      out.write("<option value=\"1961\">1961</option>\n");
      out.write("<option value=\"1962\">1962</option>\n");
      out.write("<option value=\"1963\">1963</option>\n");
      out.write("<option value=\"1964\">1964</option>\n");
      out.write("<option value=\"1965\">1965</option>\n");
      out.write("<option value=\"1966\">1966</option>\n");
      out.write("<option value=\"1967\">1967</option>\n");
      out.write("<option value=\"1968\">1968</option>\n");
      out.write("<option value=\"1969\">1969</option>\n");
      out.write("<option value=\"1970\">1970</option>\n");
      out.write("<option value=\"1971\">1971</option>\n");
      out.write("<option value=\"1972\">1972</option>\n");
      out.write("<option value=\"1973\">1973</option>\n");
      out.write("<option value=\"1974\">1974</option>\n");
      out.write("<option value=\"1975\">1975</option>\n");
      out.write("<option value=\"1976\">1976</option>\n");
      out.write("<option value=\"1977\">1977</option>\n");
      out.write("<option value=\"1978\">1978</option>\n");
      out.write("<option value=\"1979\">1979</option>\n");
      out.write("<option value=\"1980\">1980</option>\n");
      out.write("<option value=\"1981\">1981</option>\n");
      out.write("<option value=\"1982\">1982</option>\n");
      out.write("<option value=\"1983\">1983</option>\n");
      out.write("<option value=\"1984\">1984</option>\n");
      out.write("<option value=\"1985\">1985</option>\n");
      out.write("<option value=\"1986\">1986</option>\n");
      out.write("<option value=\"1987\">1987</option>\n");
      out.write("<option value=\"1988\">1988</option>\n");
      out.write("<option value=\"1989\">1989</option>\n");
      out.write("<option value=\"1990\">1990</option>\n");
      out.write("<option value=\"1991\">1991</option>\n");
      out.write("<option value=\"1992\">1992</option>\n");
      out.write("<option value=\"1993\">1993</option>\n");
      out.write("<option value=\"1994\">1994</option>\n");
      out.write("<option value=\"1995\">1995</option>\n");
      out.write("<option value=\"1996\">1996</option>\n");
      out.write("<option value=\"1997\">1997</option>\n");
      out.write("<option value=\"1998\">1998</option>\n");
      out.write("<option value=\"1999\">1999</option>\n");
      out.write("<option value=\"2000\">2000</option>\n");
      out.write("<option value=\"2001\">2001</option>\n");
      out.write("<option value=\"2002\">2002</option>\n");
      out.write("<option value=\"2003\">2003</option>\n");
      out.write("<option value=\"2004\">2004</option>\n");
      out.write("<option value=\"2005\">2005</option>\n");
      out.write("<option value=\"2006\">2006</option>\n");
      out.write("<option value=\"2007\">2007</option>\n");
      out.write("<option value=\"2008\">2008</option>\n");
      out.write("<option value=\"2009\">2009</option>\n");
      out.write("<option value=\"2010\">2010</option>\n");
      out.write("<option value=\"2011\">2011</option>\n");
      out.write("<option value=\"2012\">2012</option>\n");
      out.write("<option value=\"2013\">2013</option>\n");
      out.write("</select>                        </div>\n");
      out.write("                    </div>\n");
      out.write("                     <label>Gender : </label>                    <label class=\"radio-inline\">\n");
      out.write("                        <input type=\"radio\" name=\"sex\" value=\"Male\" id=male />                        Male\n");
      out.write("                    </label>\n");
      out.write("                    <label class=\"radio-inline\">\n");
      out.write("                        <input type=\"radio\" name=\"sex\" value=\"Female\" id=female />                        Female\n");
      out.write("                    </label>\n");
      out.write("                    <br />\n");
      out.write("              <span class=\"help-block\">By clicking Create my account, you agree to our Terms and that you have read our Data Use Policy, including our Cookie Use.</span>\n");
      out.write("                    <button class=\"btn btn-lg btn-primary btn-block signup-btn\" type=\"submit\">\n");
      out.write("                        Create my account</button>\n");
      out.write("            </form>          \t\n");
      out.write("          </div>\n");
      out.write("</div>            \n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"modal fade\" id = \"contacts\" role = \"dialog\">\n");
      out.write("  <div class = \"modal-dialog\">\n");
      out.write("    <div class = \"modal-content\">\n");
      out.write("     <div class = \"modal-header\">\n");
      out.write("      <h3>Say us hi</h3>\n");
      out.write("      </div>\n");
      out.write("      <div class = \"modal-body\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("         <div class=\"container-modal\">\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sendUsEmail\" method=\"post\" accept-charset=\"utf-8\" class=\"form\" role=\"form\"> \n");
      out.write("              <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-12\">\n");
      out.write("                            <input type=\"text\" required=\"\"  name=\"fromEmail\" value=\"\" class=\"form-control input-lg\" placeholder=\"From\" />                        </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-12\">\n");
      out.write("                             <textarea class=\"form-control input-lg\" required=\"\"  id=\"message\" name=\"content\" placeholder=\"Enter your massage for us here. We will get back to you within 2 business days.\" rows=\"7\"></textarea>                        </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12 text-right\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-lg\">Send</button>\n");
      out.write("                            </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer>\n");
      out.write("  <hr />\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <p class=\"text-right\">Copyright &copy; Inforvellor 2014</p>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<!-- /footer -->\n");
      out.write("\n");
      out.write("  <!-- attach JavaScripts -->\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"./js/docs.min.js\"></script>\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("  \n");
      out.write("    <!-- Scrolling Nav JavaScript -->\n");
      out.write("    <script src=\"js/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"js/scrolling-nav.js\"></script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    $('.carousel').carousel({\n");
      out.write("        interval: 5000\n");
      out.write("    })\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div id=\"global-zeroclipboard-html-bridge\" class=\"global-zeroclipboard-container\" title=\"\" style=\"position: absolute; left: 0px; top: -9999px; width: 15px; height: 15px; z-index: 999999999;\" data-original-title=\"Copy to clipboard\">      <object classid=\"clsid:d27cdb6e-ae6d-11cf-96b8-444553540000\" id=\"global-zeroclipboard-flash-bridge\" width=\"100%\" height=\"100%\">         <param name=\"movie\" value=\"/assets/flash/ZeroClipboard.swf?noCache=1422475245721\">         <param name=\"allowScriptAccess\" value=\"sameDomain\">         <param name=\"scale\" value=\"exactfit\">         <param name=\"loop\" value=\"false\">         <param name=\"menu\" value=\"false\">         <param name=\"quality\" value=\"best\">         <param name=\"bgcolor\" value=\"#ffffff\">         <param name=\"wmode\" value=\"transparent\">         <param name=\"flashvars\" value=\"trustedOrigins=getbootstrap.com%2C%2F%2Fgetbootstrap.com%2Chttp%3A%2F%2Fgetbootstrap.com\">         <embed src=\"/assets/flash/ZeroClipboard.swf?noCache=1422475245721\" loop=\"false\" menu=\"false\" quality=\"best\" bgcolor=\"#ffffff\" width=\"100%\" height=\"100%\" name=\"global-zeroclipboard-flash-bridge\" allowscriptaccess=\"sameDomain\" allowfullscreen=\"false\" type=\"application/x-shockwave-flash\" wmode=\"transparent\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" flashvars=\"trustedOrigins=getbootstrap.com%2C%2F%2Fgetbootstrap.com%2Chttp%3A%2F%2Fgetbootstrap.com\" scale=\"exactfit\">                </object></div><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"500\" height=\"500\" viewBox=\"0 0 500 500\" preserveAspectRatio=\"none\" style=\"visibility: hidden; position: absolute; top: -100%; left: -100%;\"><defs></defs><text x=\"0\" y=\"23\" style=\"font-weight:bold;font-size:23pt;font-family:Arial, Helvetica, Open Sans, sans-serif;dominant-baseline:middle\">500x500</text></svg></body></html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/static/css/newhomepage/bootstrap.min.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/static/css/newhomepage/style.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/static/css/newhomepage/scrolling-nav.css");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/static/css/newhomepage/custom.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/static/css/newhomepage/languages.min.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/static/css/newhomepage/font-awesome.min.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/static/img/newhomepage/white.png");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user  eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t   <li>\n");
        out.write("               \n");
        out.write("\t\t\t\t  <a class=\"btn btn-success\" role=\"button\" href=\"newLogin/login.jsp\" style=\"color:white; padding:15px; margin-right:10px;\">Login</a>\n");
        out.write("                 \n");
        out.write("\t\t\t\t  \n");
        out.write("\t\t\t\t   \n");
        out.write("\t\t\t\t  </li>\n");
        out.write("\t\t\t\t  <li>\n");
        out.write("                   <a class=\"btn btn-primary\" href=\"#signup\" role=\"button\" data-toggle=\"modal\" style=\"color:white; padding:15px; margin-right:10px;\">Sign up today</a>\n");
        out.write("                  </li>\n");
        out.write("\t\t\t\t   ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user  ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t     <li>\n");
        out.write("               \n");
        out.write("\t\t\t\t  <a class=\"btn\">Hi: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                 \n");
        out.write("\t\t\t\t  \n");
        out.write("\t\t\t\t   \n");
        out.write("\t\t\t\t  </li>\n");
        out.write("\t\t\t\t  <li>\n");
        out.write("                   <a class=\"btn btn-primary2\" href=\"view/chinese/menu/country.jsp\" role=\"button\" style=\"color:white; padding:15px; margin-right:10px;\">Go to database</a>\n");
        out.write("                  </li>\n");
        out.write("\t\t\t\t \n");
        out.write("\t\t\t\t  ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/static/img/newhomepage/about1.JPG");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/static/img/newhomepage/about2.JPG");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/static/img/newhomepage/movie.swf");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("/static/img/newhomepage/buyerh.jpg");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/static/img/newhomepage/seller.jpg");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/static/img/newhomepage/researcherh");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }
}

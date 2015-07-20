package org.apache.jsp.view.login.infobase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setBundle_var_basename_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setBundle_var_basename_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_setBundle_var_basename_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- 国际化 -->\r\n");
      out.write("\r\n");

	String language = (String)request.getSession().getAttribute("language");
	if(language == null || "".equals(language) || "pleaseSelect".equals(language))
	{
		language = "message_zh_CN";
	    request.getSession().setAttribute("language","message_zh_CN");
	}
	String userName=(String)request.getAttribute("userName");

      out.write('\r');
      out.write('\n');
      //  fmt:setBundle
      org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag _jspx_th_fmt_setBundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag) _jspx_tagPool_fmt_setBundle_var_basename_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag.class);
      _jspx_th_fmt_setBundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_setBundle_0.setParent(null);
      _jspx_th_fmt_setBundle_0.setBasename(language);
      _jspx_th_fmt_setBundle_0.setVar("messages");
      int _jspx_eval_fmt_setBundle_0 = _jspx_th_fmt_setBundle_0.doStartTag();
      if (_jspx_th_fmt_setBundle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_setBundle_var_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
        return;
      }
      _jspx_tagPool_fmt_setBundle_var_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>用户-登录</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">  \r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/easyui/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/login/login.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/login/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/login/supersized.css\">\r\n");
      out.write("    <script type=\"text/javascript\" \tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/jquery/jquery.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" \tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/jquery/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/login/login.js\" ></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/login/supersized.3.2.7.min.js\" ></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/login/supersized-init.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("    <div style=\"display: none\" id=\"userName\">");
      out.print(userName );
      out.write("</div>\r\n");
      out.write("    <div id=\"top\" style=\"margin:0px auto; height:65px; background-color:#ebf3f6\">\r\n");
      out.write("        <div style=\"width:1195px; height:64px; margin:0px auto\">\r\n");
      out.write("            <div style=\"width:300px; height:63px; background-image:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/login/logo.png); background-repeat:no-repeat\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div style=\"width:1195px;height:540px; margin:20px auto\">\r\n");
      out.write("        <div style=\"width:401px; height:495px; background-image:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/login/login_main_bg.png); background-repeat:no-repeat; margin-left:793px\">\r\n");
      out.write("            <table style=\"width:100%; font-family:Arial,微软雅黑;\">\r\n");
      out.write("                <tr style=\"height:40px;\">\r\n");
      out.write("                    <td style=\"width:200px; text-align:center; vertical-align:middle; font-size:16px; font-weight:600; color:#00a1be\">登录</td>\r\n");
      out.write("                    <td id=\"shiyong\" style=\"width:201px; text-align:center; vertical-align:middle; font-size:16px; font-weight:600; color:#ffffff\"><a href=\"#\">试用版本</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr style=\"height:70px;\">\r\n");
      out.write("                    <td colspan=\"2\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"2\">\r\n");
      out.write("                        <input type=\"text\" id=\"user_name\"  placeholder=\"用户名\" class=\"login_input\" style=\" background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/login/username_bg.png); background-repeat:no-repeat\"/>\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <input type=\"password\" id=\"user_pass\" placeholder=\"密码\" class=\"login_input\"  style=\" background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/login/userpwd_bg.png); background-repeat:no-repeat\"/>\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <input type=\"text\" id=\"checkcode\"  placeholder=\"验证码\" class=\"login_input\" style=\"width:155px\"/>\r\n");
      out.write("                    \t\r\n");
      out.write("                    \t<a href=\"#\" onClick=\"javascript:myRandReload()\" alt=\"重新生成验证吧\" title=\"重新生成验证吧\" class=\"img\" style=\"padding-top: 25px;padding-left: 5px;z-index: 100;position: absolute;\"> \r\n");
      out.write("\t\t\t\t\t\t\t<img align=\"bottom\" id=\"createcheckcode\" style=\"width:130px;height:45px;\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a id=\"bjc\" href=\"javascript:myRandReload()\" style=\"text-decoration: none;color:#4a97e3;padding:2px 2px;padding-top: 33px;padding-left: 140px;z-index: 100;position: absolute;\">\r\n");
      out.write("\t\t\t\t\t\t\t<img title=\"刷新\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/login/refresh.png\" width=\"25px\" height=\"25px\"/>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"fp\" style=\"font-size:14px; vertical-align:top;\">\r\n");
      out.write("                        <input type=\"checkbox\" style=\"margin-top:17px; margin-left:30px\" id=\"rPassword\" name=\"rPassword\" value='y'/><span style=\"color:#677176\">下次自动登录</span>\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <a href=\"javascript:forgetPass();\"; style=\"margin-left:30px; font-size:16px; color:#27afc8\">忘记密码？</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"button\" onclick=\"usersub();\" id =\"loginInput\" class=\"login_btn\" value=\"登录\" onmouseover=\"overlogin(this)\" onmouseout=\"outlogin(this)\"/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr style=\"height:60px\">\r\n");
      out.write("                    <td id=\"reg\" colspan=\"2\" style=\"font-size:20px; vertical-align:middle; text-align:center; color:#ffffff; padding-top:30px\">\r\n");
      out.write("                        <!--<a href=\"#\">立即注册平台账号</a>-->\r\n");
      out.write("                        <input id=\"regnow\" type=\"button\" value=\"立即注册平台账号\"  onmouseover=\"overreg(this)\" onmouseout=\"outreg(this)\"/>\r\n");
      out.write("                        <!-- onClick=\"window.open('/gbdbas/view/login/register/register.jsp')\" -->\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function overlogin(obj) {\r\n");
      out.write("            obj.style.backgroundColor = \"#1683c7\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function outlogin(obj) {\r\n");
      out.write("            obj.style.backgroundColor = \"#27afc8\";\r\n");
      out.write("        }\r\n");
      out.write("        function overreg(obj) {\r\n");
      out.write("            obj.style.backgroundColor = \"#1683c7\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function outreg(obj) {\r\n");
      out.write("            obj.style.backgroundColor = \"#4fACA8\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}

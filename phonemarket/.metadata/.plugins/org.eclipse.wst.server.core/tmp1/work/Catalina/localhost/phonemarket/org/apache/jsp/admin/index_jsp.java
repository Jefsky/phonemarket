/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-06-26 19:52:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB18030\">\r\n");
      out.write("\t\t<title>Cellphone Admin - Login</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/login_admin.css\">\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction CheckSubmit(thisform){\r\n");
      out.write("\t\twith(thisform){\r\n");
      out.write("  \t\t\tif(employeeid.value == \"\" ) {\r\n");
      out.write("  \t\t\t\talert(\"????????????????????????????????????!\"); \r\n");
      out.write("  \t\t\t\temployeeid.focus(); \r\n");
      out.write("  \t\t\t\treturn false; \r\n");
      out.write("  \t\t\t}   \r\n");
      out.write("\t  \t\tif( password.value == \"\" ){ \r\n");
      out.write("\t  \t\t\talert(\"??????????????????????????????!\"); \r\n");
      out.write("\t  \t\t\tpassword.focus(); \r\n");
      out.write("\t  \t\t\treturn false;\r\n");
      out.write("\t  \t\t} \t \r\n");
      out.write("\t  \t\tif(employeeid.value.indexOf(\"'\") != -1||employeeid.value.indexOf(\" \") != -1){\r\n");
      out.write("\t  \t\t\talert(\"????????????????????????????????????????????????????????????,??????????????????????????????!\"); \r\n");
      out.write("\t  \t\t\temployeeid.focus(); \r\n");
      out.write("\t  \t\t\treturn false; \r\n");
      out.write("\t  \t\t}   \t \r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t\treturn true;                                                                                          \r\n");
      out.write(" \t}\r\n");
      out.write("</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<img src=\"../image/logo.png\" width=\"850\" height=\"142\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"box\">\r\n");
      out.write("\t\t\t<form name=\"loginform\" action=\"/phonemarket/EQueryByIdPwServlet\" method=\"post\" onsubmit=\"return CheckSubmit(this)\">\r\n");
      out.write("\t\t\t<p class=\"main\">\r\n");
      out.write("\t\t\t\t<label>Username: </label>\r\n");
      out.write("\t\t\t\t<input name=\"employeeid\" type=\"text\"  size=\"15\">\r\n");
      out.write("\t\t\t\t<label>&nbspPassword:   </label>\r\n");
      out.write("\t\t\t\t<input name=\"password\" type=\"password\"  size=\"15\" >\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"space\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Login\" class=\"login\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

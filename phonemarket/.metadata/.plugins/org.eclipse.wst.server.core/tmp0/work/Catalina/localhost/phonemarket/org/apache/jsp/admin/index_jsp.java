package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
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
      out.write("  \t\t\t\talert(\"è¯·è¾å¥ç¨æ·å!\"); \r\n");
      out.write("  \t\t\t\temployeeid.focus(); \r\n");
      out.write("  \t\t\t\treturn false; \r\n");
      out.write("  \t\t\t}   \r\n");
      out.write("\t  \t\tif( password.value == \"\" ){ \r\n");
      out.write("\t  \t\t\talert(\"è¯·è¾å¥å¯ç !\"); \r\n");
      out.write("\t  \t\t\tpassword.focus(); \r\n");
      out.write("\t  \t\t\treturn false;\r\n");
      out.write("\t  \t\t} \t \r\n");
      out.write("\t  \t\tif(employeeid.value.indexOf(\"'\") != -1||employeeid.value.indexOf(\" \") != -1){\r\n");
      out.write("\t  \t\t\talert(\"ç¨æ·åä¸è½åå«åå¼å·,ç©ºæ ¼ç­å­ç¬¦!\"); \r\n");
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
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

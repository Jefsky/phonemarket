package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Cellphone Store</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/top.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class = \"navigation\">\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t\t<span><img src=\"../image/logo.png\" width=\"350\" height=\"85\"></span> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<ul id=\"color\"> \r\n");
      out.write("\t\t<li class = \"color1\"><a href = \"../user/index.jsp\">主页</a></li>\r\n");
      out.write("\t\t<li><a href = \"#\">新款手机</a></li>\r\n");
      out.write("\t\t<li class = \"color2\"><a href = \"#\">手机精品</a></li>\r\n");
      out.write("\t\t<li class = \"color3\"><a href = \"shoppingcart.jsp\">购物车</a></li>\r\n");
      out.write("\t\t<li class = \"color4\"><a href = \"../admin/index.jsp\">管理员入口</a></li>\r\n");
      out.write("\t</ul> \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div> \r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
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

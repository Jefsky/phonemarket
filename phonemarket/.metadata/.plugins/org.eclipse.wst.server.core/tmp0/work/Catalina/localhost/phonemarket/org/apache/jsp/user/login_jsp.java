package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>login</title>\r\n");
      out.write("<SCRIPT LANGUAGE=\"javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction CheckSubmit(thisform){ //focus()方法，将光标定位于输出栏目\r\n");
      out.write("\t\twith(thisform){\r\n");
      out.write("\t\t\tif(userid.value==null || userid.value==\"\" ){\r\n");
      out.write("\t\t\t\talert(\"请输入用户名!\"); \r\n");
      out.write("\t\t\t\tuserid.focus(); \r\n");
      out.write("\t\t\t\treturn false; \r\n");
      out.write("\t\t\t}else if(userid.value.indexOf(\"'\")!=-1){ \r\n");
      out.write("\t\t\t\talert(\"用户名不能包含单引号,空格等字符!\"); \r\n");
      out.write("\t\t\t\tuserid.focus(); \r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}   \r\n");
      out.write("\t\t\tif(password.value==null || password.value==\"\" ){\r\n");
      out.write("\t\t\t\talert(\"请输入密码!\"); \r\n");
      out.write("\t\t\t\tpassword.focus(); \r\n");
      out.write("\t\t\t\treturn false; \r\n");
      out.write("\t\t\t}   \t \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;                                                                                          \r\n");
      out.write("\t} \r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

	String s_userid=(String)session.getAttribute("userid");
	if(s_userid==null){

      out.write("\r\n");
      out.write("<form name=\"loginform\" action=\"/phonemarket/QueryByIdPwServlet\" method=\"post\" onsubmit=\"return CheckSubmit(this)\">\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#f6f6f6\" class=\"td\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>用户名</td>\r\n");
      out.write("\t\t\t<td><input name=\"userid\" type=\"text\" class=\"formtext\" size=\"12\"></td>\r\n");
      out.write("\t\t\t<td >密码</td>\r\n");
      out.write("\t\t\t<td ><input name=\"password\" type=\"password\" class=\"formtext\" size=\"12\"></td>\r\n");
      out.write("\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t &nbsp&nbsp&nbsp<input name=\"loginbutton\" type=\"submit\" value=\"登录\">\r\n");
      out.write("\t\t\t &nbsp&nbsp&nbsp<input type=\"reset\" value=\"清除\">\r\n");
      out.write("\t\t\t \t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;<a href=\"register.jsp\">新用户注册</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");

	}else{

      out.write("\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" bgcolor=\"#f6f6f6\" class=\"td\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"30\" colspan=\"4\">&nbsp&nbsp&nbsp您好！");
      out.print(s_userid );
      out.write("\r\n");
      out.write("\t\t\t欢迎来到化腾晓枫手机商城</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href=\"shoppingcart.jsp\">查看购书车</a>\r\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href=\"index.jsp?op=exit\">注销退出</a></td>\r\n");
      out.write("\t</table>\r\n");

	}

      out.write("\r\n");
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

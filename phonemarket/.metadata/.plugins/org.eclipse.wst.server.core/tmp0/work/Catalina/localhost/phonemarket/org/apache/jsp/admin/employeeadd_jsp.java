package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employeeadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=GB18030");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB18030\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction CheckSubmit(thisform){\r\n");
      out.write("\t\twith(thisform){\r\n");
      out.write("\t\t\tif(employeeid.value==null||employeeid.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"请输入职工帐号\");   //弹出对话口，提示输入\r\n");
      out.write("\t\t\t\temployeeid.focus();         //把页面光标定位在该元素上\r\n");
      out.write("\t\t\t\treturn false;           //方法返回false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(name.value==null||name.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"请输入姓名\");   //弹出对话口，提示输入\r\n");
      out.write("\t\t\t\tname.focus();         //把页面光标定位在该元素上\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(password.value==null||password.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"请输入密码\");   //弹出对话口，提示输入\r\n");
      out.write("\t\t\t\tpassword.focus();         //把页面光标定位在该元素上\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(phone.value==null||phone.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"请输入电话号码\");   //弹出对话口，提示输入\r\n");
      out.write("\t\t\t\tphone.focus();         //把页面光标定位在该元素上\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\t\r\n");
      out.write("\t}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"../css/maincss.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String employeeid=(String)session.getAttribute("employeeid");
	if (employeeid==null){
		response.sendRedirect("index.jsp");
	}

      out.write('\r');
      out.write('\n');

	int line = 0;
	String line_s = request.getParameter("line");
	if (line_s!=null){
		line = Integer.parseInt(line_s);
	}

      out.write("\r\n");
      out.write("<div >\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<table width=\"750\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr> \r\n");
      out.write("\t\t\t\t<td><div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<form action=\"/phonemarket/InsertEmployeeServlet\" method=\"post\" onsubmit=\"return CherckSubmit(this)\">\r\n");
      out.write("\t\t\t\t\t\t<table width=\"50%\" border=\"0\" cellspacing=\"1\" class=\"td\">\r\n");

	if(line==0){

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"30%\">职业帐号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"employeeid\" type=\"text\" size=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"name\" type=\"text\" size=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>密码</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"password\" type=\"text\" size=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>性别</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"gender\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"男\">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"女\">女</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>联系地址</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"password\" type=\"text\" size=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>E-mail</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"email\" type=\"text\" size=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>电话</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"phone\" type=\"text\" size=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>工作任务</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"task\" type=\"text\" size=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"新建\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");

	}else{

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\">&nbsp;&nbsp;添加员工成功！</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t<div >\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../user/bottom.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
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

package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.huateng.dao.impl.EmployeeInfoDAOImpl;
import java.util.ArrayList;
import cn.huateng.bean.Employee;

public final class employeelist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB18030\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"../css/maincss.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
  //控制访问页面权限，必须登陆管理帐号
	String employeeid=(String)session.getAttribute("employeeid");
	if (employeeid==null){
		response.sendRedirect("index.jsp");
	}
	String msg = request.getParameter("msg");
	String error = request.getParameter("error");
	if(msg!=null&&"del_success".equals(msg)){
		
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\talert(\"删除成功!\");\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");

		}
	if(error!=null&&"queryUP_unsuccess".equals(msg)){
		
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\talert(\"删除失败!\");\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");

	}

      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<table width=\"750\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\">\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t<tr> \r\n");
      out.write("\t\t\t\t<td ><div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" class=\"td\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"8\"><div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"employeeadd.jsp\">新建</a>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"employeesearch.jsp\">查询</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"8\"><hr size=\"1\" noshade width=\"100%\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>职工帐号</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>性别</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>联系地址</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>E-mail</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>电话</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>工作任务</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");

EmployeeInfoDAOImpl employeeInfoDAOImpl = new EmployeeInfoDAOImpl();
	//查询到所有用户，并保存到列表employeeList中，列表中的每一个元素保存了一个用户的信息 
	ArrayList<Employee> employeeList = employeeInfoDAOImpl.queryEmployee();
	//通过foreach的方式循环显示所有管理员信息
	for (Employee employee:employeeList){

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(employee.getEmployeeid());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(employee.getName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(employee.getGender() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(employee.getAddress());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(employee.getEmail() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(employee.getPhone() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(employee.getTask() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><a href=\"../EDeteleEmployeeServlet?employeeid=");
      out.print(employee.getEmployeeid() );
      out.write("\">删除</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t</tr>  \r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div> <div >\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottom.jsp", out, false);
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

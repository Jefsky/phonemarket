/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-06-26 19:53:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.huateng.dao.impl.UserInfoDAOImpl;
import java.util.ArrayList;
import cn.huateng.bean.UserInfo;

public final class userStateManage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String employeeid=(String)session.getAttribute("employeeid");
	if(employeeid==null){
		response.sendRedirect("index.jsp");
	}

      out.write('\r');
      out.write('\n');

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
	if(msg!=null&&"up_success".equals(msg)){
		
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\talert(\"修改成功!\");\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");

		}
	if(error!=null&&"up_unsuccess".equals(msg)){
		
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\talert(\"修改失败!\");\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");

	}

      out.write("<div >\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("<div align=\"center\">\t\r\n");
      out.write("\t\t<table width=\"750\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\">\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" class=\"td\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>用户名</td>\r\n");
      out.write("\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t<td>密码</td>\r\n");
      out.write("\t\t\t\t\t\t<td>性别</td>\r\n");
      out.write("\t\t\t\t\t\t<td>地址</td>\r\n");
      out.write("\t\t\t\t\t\t<td>邮箱</td>\r\n");
      out.write("\t\t\t\t\t\t<td>电话</td>\r\n");
      out.write("\t\t\t\t\t\t<td>邮编</td>\r\n");
      out.write("\t\t\t\t\t\t<td>状态</td>\r\n");
      out.write("\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");

	UserInfoDAOImpl userInfoDAOImpl = new UserInfoDAOImpl();
	//查询到所有状态为0的用户，并保存到列表userList中，列表中的每一个元素保存了一个用户的信息 
	ArrayList<UserInfo> userList = userInfoDAOImpl.queryByState(0);
	//通过ｆｏｒｅａｃｈ的方式循环显示所有状态为０的用户信息
	for (UserInfo user:userList){

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getUserid());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getUsername() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getPassword() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getGender() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getAddress() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getEmail() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getPhone() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getPostcode());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(user.getState() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><a href=\"../UpdateUserStateServlet?userid=");
      out.print(user.getUserid() );
      out.write("&state=1\">通过</a> <a href=\"../DeteleUserServlet?userid=");
      out.print(user.getUserid() );
      out.write("\">删除</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t</table><div >\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottom.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("</body>\r\n");
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
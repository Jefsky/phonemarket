/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-06-26 20:12:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.huateng.bean.*;
import java.util.ArrayList;

public final class order2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	OrderForm orderForm=(OrderForm)session.getAttribute("orderForm");
    ArrayList<ShopCartUnit> shopCartUnit=(ArrayList<ShopCartUnit>)session.getAttribute("ls_shopCartUnit");
	

      out.write("<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<table width=\"750\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\">\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t<tr> \r\n");
      out.write("\t\t\t\t<td ><div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" class=\"td\">\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"6\">?????????????????????,???????????????????????????????????????,?????????????????????,??????????????????????????????????????????.</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"6\"><hr size=\"1\" noshade width=\"100%\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("<!-- ?????????session?????????????????????orderForm??????????????????????????????????????? -->\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"> ?????????:");
      out.print(orderForm.getOrderid());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"> ?????????:");
      out.print(orderForm.getReceiver());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"> ??????:");
      out.print(orderForm.getAddress());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"> ??????:");
      out.print(orderForm.getPostcode());
      out.write("</td>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"> ????????????:");
      out.print(orderForm.getPhone());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("<!-- ?????????session??????????????????????????????ls_shopCartUnit???????????????????????????????????????????????? -->\r\n");
      out.write("\t\t\t\t        <tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>?????? </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>?????? </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>????????? </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>?????? </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>??????(???) </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>?????? </td>\r\n");
      out.write("\t\t\t\t        </tr>\r\n");
      out.write("\t");
for(ShopCartUnit scu :shopCartUnit){ 
      out.write("\r\n");
      out.write("\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t        \t<td>");
      out.print(scu.getPhoneid() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(scu.getPhonename() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(scu.getName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(scu.getUnitprice() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(scu.getOrdernum() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(scu.getSubamount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t        </tr>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><div align=\"right\">??????</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >");
      out.print(orderForm.getTotalnum() );
      out.write("(???)</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">???");
      out.print(orderForm.getTotalamount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"6\"> <div align=\"left\">??????????????????! </div></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t</table>\r\n");
      out.write("    \t\t\t</div></td>\r\n");
      out.write("  \t\t\t</tr> \r\n");

	session.removeAttribute("orderForm");
	session.removeAttribute("ls_shopCartUnit");

      out.write(" \r\n");
      out.write("\t\t\t \r\n");
      out.write("</table>\r\n");
      out.write("</div> <div align=\"center\">\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-06-26 20:00:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.huateng.dao.impl.OrderFormDAOImpl;
import cn.huateng.bean.OrderForm;
import java.util.ArrayList;
import cn.huateng.bean.OrderDetail;

public final class orderlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB18030\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"../css/maincss.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String  employeeid = (String)session.getAttribute("employeeid");
	if(employeeid==null){
		response.sendRedirect("index.jsp");
	}	
	String error = request.getParameter("error");
	if(error!=null&&"del_order_error".equals(error)){

      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\talert(\"删除订单失败，请重试!\");\r\n");
      out.write("\t\t</script>\r\n");

	}

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
      out.write("\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" class=\"td\"> \r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"7\"><div align=\"right\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"ordersearch.jsp\">查询</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"7\"><hr size=\"1\" noshade width=\"100%\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>订单号</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>收货人</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>地址</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><div align=\"center\">图书总数</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>总价</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>更改状态</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"7\"><hr size=\"1\" noshade width=\"100%\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write(" ");

	OrderFormDAOImpl orderFormDAOImpl = new OrderFormDAOImpl();
	ArrayList<OrderForm> orderFormList = orderFormDAOImpl.queryOrderForm();
	for (OrderForm orderForm:orderFormList){
		int orderstate = orderForm.getState();
		String state_s ="";
		if(orderstate==0)
			state_s = "未处理";
		if(orderstate==1)
			state_s = "已发货";
		if(orderstate==2)
			state_s = "交易完成";

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"../ODqueryByOIdServlet?orderid=");
      out.print(orderForm.getOrderid() );
      out.write('"');
      out.write('>');
      out.print(orderForm.getOrderid() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderForm.getOrderdate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderForm.getReceiver() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderForm.getAddress() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><div align=\"center\">");
      out.print(orderForm.getTotalnum() );
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderForm.getTotalamount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../UpdateOrderStateServlet?orderid=");
      out.print(orderForm.getOrderid() );
      out.write("&state=");
      out.print(orderstate );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(state_s );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" class=\"td\">\r\n");

	ArrayList<OrderDetail> orderDetailList = (ArrayList<OrderDetail>)session.getAttribute("orderDetailList");

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"6\">订单的明细</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>流水号</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>型号</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>公司</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>单价</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>数量(部)</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>合价</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");

	int totalnum = 0;
	float totalamount = 0.0f;
	if(orderDetailList!=null){
		for(OrderDetail orderDetail : orderDetailList){
			totalnum+=orderDetail.getOrdernum();
			totalamount+=orderDetail.getUnitprice()*orderDetail.getOrdernum();

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderDetail.getPhoneid());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderDetail.getPhonename() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderDetail.getName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderDetail.getUnitprice() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderDetail.getOrdernum() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(orderDetail.getUnitprice()*orderDetail.getOrdernum() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");

	}
}

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"4\"><div align=\"right\">合计</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >");
      out.print(totalnum );
      out.write("(本)</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >￥");
      out.print(totalamount );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t</tr>  \r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div><div >\r\n");
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
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page import="cn.huateng.dao.impl.OrderFormDAOImpl,cn.huateng.bean.OrderForm,java.util.ArrayList" %>
<%@ page import="cn.huateng.bean.OrderDetail" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<link href="../css/maincss.css" rel="stylesheet" type="text/css">
</head>
<body>
<%
	String  employeeid = (String)session.getAttribute("employeeid");
	if(employeeid==null){
		response.sendRedirect("index.jsp");
	}	
	String error = request.getParameter("error");
	if(error!=null&&"del_order_error".equals(error)){
%>
		<script type="text/javascript">
			alert("删除订单失败，请重试!");
		</script>
<%
	}
%><div>
						<jsp:include page="top.jsp" />
					</div>
	<div align="center">
		<table width="750" border="0" cellspacing="1" cellpadding="1">
			 
			<tr> 
				<td ><div align="center">
					<table width="100%" border="0" cellpadding="1" cellspacing="1" class="td"> 
						<tr>
							<td colspan="7"><div align="right">								
								<a href="ordersearch.jsp">查询</a>
							</div></td>
						</tr>
						<tr>
							<td colspan="7"><hr size="1" noshade width="100%"></td>
						</tr> 
						<tr> 
							<td>订单号</td>
							<td>日期</td>
							<td>收货人</td>
							<td>地址</td>
							<td><div align="center">图书总数</div></td>
							<td>总价</td>
							<td>更改状态</td>
						</tr>
						<tr>
							<td colspan="7"><hr size="1" noshade width="100%"></td>
						</tr>
 <%
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
%>
						<tr>
							<td><a href="../ODqueryByOIdServlet?orderid=<%=orderForm.getOrderid() %>"><%=orderForm.getOrderid() %></a></td>
							<td><%=orderForm.getOrderdate() %></td>
							<td><%=orderForm.getReceiver() %></td>
							<td><%=orderForm.getAddress() %></td>
							<td><div align="center"><%=orderForm.getTotalnum() %></div></td>
							<td><%=orderForm.getTotalamount() %></td>
							<td>
							<a href="../UpdateOrderStateServlet?orderid=<%=orderForm.getOrderid() %>&state=<%=orderstate %>">
								<%=state_s %>
							</a>
							</td>
						</tr>
<%
	}
%>
					</table>
					<table width="100%" border="0" cellpadding="1" cellspacing="1" class="td">
<%
	ArrayList<OrderDetail> orderDetailList = (ArrayList<OrderDetail>)session.getAttribute("orderDetailList");
%>
						<tr> 
							<td colspan="6">订单的明细</td>
						</tr>
						<tr> 
							<td>流水号</td>
							<td>型号</td>
							<td>公司</td>
							<td>单价</td>
							<td>数量(部)</td>
							<td>合价</td>
						</tr>
<%
	int totalnum = 0;
	float totalamount = 0.0f;
	if(orderDetailList!=null){
		for(OrderDetail orderDetail : orderDetailList){
			totalnum+=orderDetail.getOrdernum();
			totalamount+=orderDetail.getUnitprice()*orderDetail.getOrdernum();
%>
						<tr>
							<td><%=orderDetail.getPhoneid()%></td>
							<td><%=orderDetail.getPhonename() %></td>
							<td><%=orderDetail.getName() %></td>
							<td><%=orderDetail.getUnitprice() %></td>
							<td><%=orderDetail.getOrdernum() %></td>
							<td><%=orderDetail.getUnitprice()*orderDetail.getOrdernum() %></td>
						</tr>
<%
	}
}
%>
						<tr> 
							<td colspan="4"><div align="right">合计</div></td>
							<td ><%=totalnum %>(本)</td>
							<td >￥<%=totalamount %></td>
						</tr>
					</table>
				</div></td>
			</tr>  
			 
		</table>
	</div><div >
						<jsp:include page="bottom.jsp" />
					</div>
</body>
</html>
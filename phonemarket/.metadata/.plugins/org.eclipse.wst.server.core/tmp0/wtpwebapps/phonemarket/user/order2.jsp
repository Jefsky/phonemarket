<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="cn.huateng.bean.*,java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	OrderForm orderForm=(OrderForm)session.getAttribute("orderForm");
    ArrayList<ShopCartUnit> shopCartUnit=(ArrayList<ShopCartUnit>)session.getAttribute("ls_shopCartUnit");
	
%><div align="center">
						<jsp:include page="top.jsp" />			
					</div>
	<div align="center">
		<table width="750" border="0" cellspacing="1" cellpadding="1">
			 
			<tr> 
				<td ><div align="center">
					<table width="100%" border="0" cellpadding="1" cellspacing="1" class="td">
						<tr> 
							<td colspan="6">您已经成功下单,下面是您这次订单的购书信息,请记住您订单号,我们的工作人员会及时与您联系.</td>
						</tr>
						<tr> 
							<td colspan="6"><hr size="1" noshade width="100%"></td>
						</tr>
<!-- 通过从session内置对象中获取orderForm属性，从中获取订单号等信息 -->
						<tr> 
							<td colspan="2"> 订单号:<%=orderForm.getOrderid()%></td>
							
							<td colspan="2">&nbsp;</td>
							<td colspan="2">&nbsp;</td>
						</tr>
						<tr> 
							<td colspan="2"> 收货人:<%=orderForm.getReceiver()%></td>
											
							<td colspan="2"> 地址:<%=orderForm.getAddress()%></td>
							
							<td colspan="2">&nbsp;</td>
						</tr>
						<tr> 
							<td colspan="2"> 邮编:<%=orderForm.getPostcode()%></td>	
												
							<td colspan="2"> 联系电话:<%=orderForm.getPhone()%></td>
							
							<td colspan="2">&nbsp;</td>
						</tr>
<!-- 通过从session内置对象中获取购物车ls_shopCartUnit属性，从中获取详细购买图书的信息 -->
				        <tr> 
							<td>书号 </td>
							<td>书名 </td>
							<td>出版社 </td>
							<td>单价 </td>
							<td>数量(本) </td>
							<td>合价 </td>
				        </tr>
	<%for(ShopCartUnit scu :shopCartUnit){ %>
				        <tr>
				        	<td><%=scu.getPhoneid() %></td>
							<td><%=scu.getPhonename() %></td>
							<td><%=scu.getName() %></td>
							<td><%=scu.getUnitprice() %></td>
							<td><%=scu.getOrdernum() %></td>
							<td><%=scu.getSubamount() %></td>
				        </tr>
	<%} %>
						<tr> 
							<td colspan="3"><div align="right">合计</div></td>
							<td ><%=orderForm.getTotalnum() %>(本)</td>
							<td colspan="2">￥<%=orderForm.getTotalamount() %></td>
						</tr> 
						<tr> 
							<td colspan="6"> <div align="left">谢谢您的支持! </div></td>
						</tr>
    				</table>
    			</div></td>
  			</tr> 
<%
	session.removeAttribute("orderForm");
	session.removeAttribute("ls_shopCartUnit");
%> 
			 
</table>
</div> <div align="center">
						<jsp:include page="bottom.jsp" />
					</div>
</body>
</html>
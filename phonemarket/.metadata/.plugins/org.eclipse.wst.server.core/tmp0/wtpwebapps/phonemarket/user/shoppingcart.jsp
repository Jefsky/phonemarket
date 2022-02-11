<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page import="cn.huateng.bean.ShopCartUnit,java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<script type="text/javascript">
<!--
function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; 
  document.MM_returnValue = false;
  for(i=0; i<(args.length-1); i+=2) 
	  eval(args[i]+".location='"+args[i+1]+"'");
}
//-->
</script>
<link rel="stylesheet" href="../css/maincss.css" type="text/css"/>
</head>
<body>
<%
	String s_userid=(String)session.getAttribute("userid");
	if(s_userid==null){
		response.sendRedirect("index.jsp");
	}
	//获取op参数，如果op参数值为clearcart，则把购物车ls_shopCartUnit从session内置对象中移除
	String op = request.getParameter("op");
	if("clearcart".equals(op)){
		session.removeAttribute("ls_shopCartUnit");
	}
%>
<div >
						<jsp:include page="top.jsp" />
					</div>
	<div >
		<table width="100%" border="0" cellspacing="1" cellpadding="1" >
			<tr> 
    			<td ><div align="center">
     				<table width="100%" border="0" cellpadding="1" cellspacing="1" class="td">
        				<tr> 
          					<td colspan="7">购书车</td>
        				</tr>
				        <tr> 
				          	<td colspan="7"><hr size="1" noshade width="100%"></td>
				        </tr>
<%
	//购物车ls_shopCartUnit
	ArrayList<ShopCartUnit> ls_shopCartUnit = null;
	//从session内置对象中获取购物车并付给ls_shopCartUnit
	ls_shopCartUnit=(ArrayList<ShopCartUnit>)session.getAttribute("ls_shopCartUnit");
	if(ls_shopCartUnit!=null){	
%>
     					<tr> 
							<td>手机流水号</td>
							<td>型号</td>
							<td>公司</td>
							<td>单价</td>
							<td>数量(部)</td>
							<td>合价</td>
							<td>操作</td>
						</tr>
<%
		//通过循环foreach语句把购物车中的所有种图书显示出来
		for (ShopCartUnit shopCartUnit:ls_shopCartUnit){
%>
						<tr>
								<td><%=shopCartUnit.getPhoneid()%></td>
								<td><%=shopCartUnit.getPhonename()%></td>
								<td><%=shopCartUnit.getName()%></td>
								<td><%=shopCartUnit.getUnitprice()%></td>
								<td>
								<%=shopCartUnit.getOrdernum()%>
								
								<input type="button" onClick="MM_goToURL('parent','../PhoneOrdNumChangeServlet?flag=increase&phoneid=<%=shopCartUnit.getPhoneid() %>');return document.MM_returnValue" value=" + "> &nbsp;&nbsp;
								<input type="button" onClick="MM_goToURL('parent','../PhoneOrdNumChangeServlet?flag=decrease&phoneid=<%=shopCartUnit.getPhoneid() %>');return document.MM_returnValue" value=" - "> &nbsp;&nbsp;
								
								</td>
								<td><%=shopCartUnit.getSubamount() %></td>
								<td><a href="../DelPhoneFromCartServlet?flag=remove&phoneid=<%=shopCartUnit.getPhoneid() %>">删除</a> </td>	
						</tr>
							<%
		}
							%>

<!-- 结束循环语句 -->		  
						<tr> 
							<td colspan="7"><div align="center">
								<input type="button" onClick="MM_goToURL('parent','shoppingcart.jsp?op=clearcart');return document.MM_returnValue" value=" 清空购书车 "> &nbsp;&nbsp;
								<input type="button" onClick="MM_goToURL('parent','index.jsp');return document.MM_returnValue" value=" 继续购书 ">&nbsp;&nbsp;
								<input type="button" onClick="MM_goToURL('parent','order1.jsp');return document.MM_returnValue" value=" 去收银台 ">
							</div></td>
						</tr>
<%
	}else{
%>	
						<tr> 
						  <td colspan="7" height="500"> <div align="center" >您的购书车为空!</div></td>
						</tr>
<% 
	}
%>			          															
					</table>
				</div></td>
			</tr>  
		
		</table>
	</div>  
	<div >
						<jsp:include page="bottom.jsp" />
					</div> 
</body>
</html>
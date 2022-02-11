<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import="cn.huateng.dao.impl.UserInfoDAOImpl,cn.huateng.bean.UserInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body><div align="center">
						<jsp:include page="top.jsp" />			
					</div>
	<div align="center">
		<table width="750" border="0" cellspacing="1" cellpadding="1">
			 
<%
	String s_userid=(String)session.getAttribute("userid");
	if(s_userid==null){
		response.sendRedirect("index.jsp");
	}
	//根据userid查询用户信息
	UserInfoDAOImpl userInfoDAOImpl  = new UserInfoDAOImpl();
	UserInfo userInfo = userInfoDAOImpl.queryById(s_userid);
%>
			<tr> 
  				<td ><div align="center">
  					<form name="orderform" action="../InsertOrderServlet" method="post" onsubmit="return CheckSubmit(this)">
    					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="td">    
							<tr>
								<td colspan="2">为方便我们及时将书送到您手上，请您确保以下信息真实可靠:（带<font color="red">*</font>号的为必填项，其它的可以不填）</td>
							</tr>
							<tr>
								<td colspan="2"><hr size="1" noshade width="100%"></td>
							</tr>     
							<tr>
        						<td>收货人:</td>
								<td>
									<input name="receiver" type="text" size="20" value="<%=userInfo.getUsername() %>">
									<input name="userid" type="hidden"  ><font color="red">*</font>
								</td>
							</tr>
							<tr>
							    <td>收货人地址:</td>
								<td><input name="address" type="text" size="40" value="<%=userInfo.getAddress()%>"><font color="red">*</font></td>
							</tr>
							<tr>
							    <td>联系电话:</td>
								<td>
									<input name="phone" type="text" size="20" value="<%=userInfo.getPhone()%>"><font color="red">*</font>
								</td>
							</tr>
							<tr>
							    <td>邮编:</td>
								<td>
									<input name="postcode" type="text" size="20" value="<%=userInfo.getPostcode()%>"><font color="red">*</font>
								</td>
							</tr>
							<tr>
								<td>付费方式:</td>
								<td>
									<select name="payment">
									<option value="邮局汇款">邮局汇款</option>
									<option value="银行转账">银行转账</option>
									<option value="货到付款">货到付款</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>送货方式:</td>
								<td>
									<select name="deliver">
										<option value="24小时全国特快专递">24小时全国特快专递</option>
										<option value="邮局托运">邮局托运</option>
									</select>
								</td>
							</tr>
							<tr>
								<td colspan="2"> <div align="center">
									<input type="submit" value=" 我要下订单 ">&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="reset" value=" 重新填写 ">&nbsp;&nbsp;&nbsp;&nbsp;
								</div></td>
							</tr>  

						</table>
					</form>	
				</div></td>
  			</tr> 
			 
		</table>
	</div><div align="center">
						<jsp:include page="bottom.jsp" />
					</div>
</body>
</html>
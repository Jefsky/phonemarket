<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="cn.huateng.dao.impl.PhoneInfoDAOImpl,cn.huateng.bean.Phone,java.util.ArrayList,cn.huateng.bean.Company,cn.huateng.dao.impl.CompanyDAOImpl" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/main.css">
<title>化腾晓枫手机商城官网</title>
</head>
<body>
<%
	String op = request.getParameter("op");
	if("exit".equals(op)){
		session.removeAttribute("userid");
	}
	String error = request.getParameter("error");
	if(error!=null&&"queryUP_er".equals(error)){
%>
	<script type="text/javascript">
		alert("用户名或者密码错误");
	</script>
<%
	}
	if(error!=null&&"pwedit_error".equals(error)){
%>
	<script type="text/javascript">
		alert("用户密码修改失败");
	</script>
<%
	}
	if(error!=null&&"userInfoEdit_error".equals(error)){
%>
	<script type="text/javascript">
		alert("用户个人信息修改失败");
	</script>
<%
	}
%>

<div >
					<jsp:include page="top.jsp" />	
					<jsp:include page="login.jsp"/>
					
</div>

		<table width="100%" border="0" cellpadding="0" cellspacing="0" 
										class="td">	    					
	<%
		PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
		ArrayList<Phone> ls_ephone = phoneInfoDAOImpl.queryPhoneByType(1);
		if(ls_ephone!=null){
			for(int i=0; i<(ls_ephone.size()>4?4:ls_ephone.size()); ){
	%>
								<tr>
	<%
		int count = 2;
		while(count>0){
			if(i<ls_ephone.size()){
				Phone phone = ls_ephone.get(i);
				i++;					
	%>	
	<td width="50%">			
	<table width="100%" border="0" cellpadding="0" cellspacing="0" 
										class="td">
											<tr>
												<td  width="30%" rowspan="5">
													<a href="phonedetail.jsp?phoneid=<%=phone.getPhoneid()%>">
													<img src="../image/<%=phone.getPicture() %>" width="230"
													height="323" border="0"></a>
												</td>
											
												<td width="80"><div align="left">型号</div></td>
												<td ><%=phone.getPhonename() %></td>
											</tr>
											<tr>
												<td width="80"><div align="left">平台</div></td>
												<td ><%=phone.getPlatform() %></td>
											</tr>
											<tr>
												<td><div align="left">公司</div></td>
<%
	CompanyDAOImpl companyDAOImpl =new CompanyDAOImpl();
	Company company = companyDAOImpl.cQueryById(phone.getCompanyid());
	if(company!=null){
%>	
												<td width="80"><%=company.getName() %></td>
<%
	}
%>												
											</tr>
											<tr>
												<td width="80"><div align="left">屏幕</div></td>
												<td ><%=phone.getDisplay() %>英寸</td>
											</tr>
											<tr>
												<td width="80"><div align="left">定价</div></td>
												<td><%=phone.getPrice() %>元</td>
											</tr>
											<tr>
												<td colspan="2"><div align="center" float="right">
													<a href="/phonemarket/AddtoCartServlet?phoneid=<%=phone.getPhoneid()%>">放入购物车</a>&nbsp;&nbsp;
													
												</div></td>											
											</tr>																																									
										</table>
									</td>

<%
			}else{
%>	
						<td width="50%"></td>
<%
			}
		count--;
		}
%>	
				</tr>
<%
			}
		}	
%>
																												    					
		    				</table>
		    			</td>
		    			<td width="1" bgcolor="#999999"></td>
		    		</tr>
		    		<tr bgcolor="#999999"><td height="1" colspan="3" nowrap></td>
		    		</tr>
		    	</table>
		    	<table width="100%" border="0" cellspacing="0" cellpadding="0">
			    		<tr>
		    			<td height="1" nowrap bgcolor="#CCCCCC"></td>
		    		</tr>
		    	</table>		    	
		    	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		    		<tr bgcolor="#999999"></tr>
		    		<tr>
		    			<td width="0" nowrap bgcolor="#999999"></td>
		    			<td>
		    				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="td">
		    					
	<%
		PhoneInfoDAOImpl phoneInfoDAOImpl2 = new PhoneInfoDAOImpl();
		ArrayList<Phone> ls_ephone2 = phoneInfoDAOImpl2.queryPhoneByType(2);
		if(ls_ephone!=null){
			for(int i=0; i<(ls_ephone2.size()>4?4:ls_ephone2.size()); ){
	%>
								<tr>
	<%
		int count = 2;
		while(count>0){
			if(i<ls_ephone2.size()){
				Phone phone2 = ls_ephone2.get(i);
				i++;					
	%>				
	
									<td width="50%">
										<table width="100%" border="0" cellpadding="0" cellspacing="0" 
										class="td">
											<tr>
												<td width="30%" rowspan="5">
													<a href="phonedetail.jsp?phoneid=<%=phone2.getPhoneid()%>">
													<img src="../image/<%=phone2.getPicture() %>" width="230"
													height="323" border="0"></a>
												</td>
												<td width="25%"><div align="left">型号</div></td>
												<td><%=phone2.getPhonename() %></td>
											</tr>
											<tr>
												<td width="25%"><div align="left">平台</div></td>
												<td><%=phone2.getPlatform() %></td>
											</tr>
											<tr>
												<td width="25%"><div align="left">公司</div></td>
<%
	CompanyDAOImpl companyDAOImpl2 =new CompanyDAOImpl();
	Company company2 = companyDAOImpl2.cQueryById(phone2.getCompanyid());
	if(company2!=null){
%>	
												<td><%=company2.getName() %></td>
<%
	}
%>												
											</tr>
											<tr>
												<td width="25%"><div align="left">屏幕</div></td>
												<td><%=phone2.getDisplay() %>英寸</td>
											</tr>
											<tr>
												<td width="25%"><div align="left">定价</div></td>
												<td><%=phone2.getPrice() %>元</td>
											</tr>
											<tr>
												<td colspan="2"><div align="center">
													<a href="/phonemarket/AddtoCartServlet?phoneid=<%=phone2.getPhoneid()%>">放入购物车</a>&nbsp;&nbsp;
												
												</div></td>											
											</tr>																																									
										</table>
									</td>

<%
			}else{
%>	
						<td width="50%"></td>
<%
			}
		count--;
		}
%>	
				</tr>
<%
			}
		}	
%>
																												    					
		    				</table>





<div>
					<jsp:include page="bottom.jsp" />			
</div>
</body>
</html>
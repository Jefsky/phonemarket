<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page import="cn.huateng.dao.impl.PhoneInfoDAOImpl,cn.huateng.bean.Phone,java.util.ArrayList,cn.huateng.bean.Company,cn.huateng.dao.impl.CompanyDAOImpl" %>
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
	Phone phone=(Phone)request.getAttribute("phone");
	
		int line = 0;
		String s_line = request.getParameter("line");
		if(s_line!=null)
			line = Integer.parseInt(s_line);
		
		String error = request.getParameter("error");
		if(error!=null&&"update_phone_error".equals(error)){
%>
			<script type="text/javascript">
				alert("修改图书失败，请重试!");
			</script>
<%
		}
%><div align="center">
						<jsp:include page="top.jsp" />
					</div>
<div align="center">
		<table width="750" border="0" cellspacing="1" cellpadding="1">
			 
<%
	if (phone!=null)
	{
%>
			<tr> 
				<td><div align="center">
					<form action="/phonemarket/UpdatePhoneServlet" method="post">
			    		<table width="50%" border="0" cellpadding="1" cellspacing="1" class="td">
<%
	if(line==0){
%>							
							<tr> 
								<td width="30%">手机流水号</td>
								<td><div align="left"> 
									<%=phone.getPhoneid() %>								
								</div></td>								
							</tr>
							<tr> 
								<td>型号</td>
								<td><div align="left"> 
									<%=phone.getPhonename() %>
								</div></td>
							</tr>
							<tr> 
								<td>平台</td>
								<td><div align="left"> 
									<%=phone.getPlatform() %>
								</div></td>
							</tr>
							<tr> 
								<td>公司id</td>
								<td><div align="left">       
								
<%
	int companyid= phone.getCompanyid();
CompanyDAOImpl companyrDAOImpl  = new CompanyDAOImpl();
Company company = companyrDAOImpl.cQueryById(companyid);
%>
							<%=company.getName()%>
		
								</div></td>
							</tr>
							<tr> 
								<td>重量</td>
								<td><div align="left"> 
									<%=phone.getWeight() %>
								</div></td>
							</tr>
							<tr> 
								<td>屏幕</td>
								<td><div align="left"> 
									<%=phone.getDisplay() %>
								</div></td>
							</tr>
							<tr> 
								<td>售价</td>
								<td><div align="left"> 
									<input name="price" type="text" size="25" value="<%=phone.getPrice() %>" >
									<font color="red">*</font>
								</div></td>
							</tr>					
							<tr> 
								<td>新品,精品标志</td>
								<td><div align="left"> 
									<input name="type" type="text" size="25" value="<%=phone.getType() %>">
								</div></td>
							</tr>
							<tr> 
								<td>库存数量</td>
								<td><div align="left"> 
									<input name="quantity" type="text" size="25" value="<%=phone.getQuantity()%>">
								</div></td>
							</tr>		
							<tr> 
								<td>相机</td>
								<td><div align="left"> 
									<%=phone.getCamera() %>
								</div></td>
							</tr>
							<tr> 
								<td>图片文件名</td>
								<td><div align="left"> 
									<%=phone.getPicture() %>
								</div></td>
							</tr>
							<tr> 
								<td>内存</td>
								<td><div align="left"> 
									<%=phone.getRam() %>
								</div></td>
							</tr>
							<tr> 
								<td colspan="2">
									<div align="center">
										<input type="hidden" name="phoneid" value="<%=phone.getPhoneid()%>">
								        <input type="submit" value="更新 ">
									</div>
								</td>
							</tr>	
<%
	}else{
%>
							<tr> 
							    <td colspan="2">&nbsp;&nbsp;修改手机成功!</td>
							</tr>
<%
	}
%>		
<%
	}else{
%>
	<tr>
		<td><div align="center">需要修改的信息不存在</div>
		</td>
	</tr>
<%
	}
%>	
			         	</table>
					</form>
				</div></td>
			</tr>
			 
		</table>
	</div> 
<div >
						<jsp:include page="../user/bottom.jsp" />
					</div>
</body>
</html>
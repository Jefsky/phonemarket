<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page import ="cn.huateng.dao.impl.PhoneInfoDAOImpl,java.util.ArrayList,cn.huateng.bean.Phone" %>
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
	String msg = request.getParameter("msg");
	String error = request.getParameter("error");
	if(msg!=null&&"del_success".equals(msg)){
		%>
			<script type="text/javascript">
				alert("删除成功!");
			</script>
		<%
		}
	if(error!=null&&"del_phone_error".equals(error)){
%>
		<script type="text/javascript">
			alert("删除手机失败，请重试!");
		</script>
<%
	}
	if(error!=null&&"companyid_error".equals(error)){
%>
		<script type="text/javascript">
			alert("没有相应手机信息，请重试!");
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
							<td colspan="13"><div align="right">
								<a href="phoneadd.jsp">新建</a>&nbsp;&nbsp;&nbsp;&nbsp;
							</div></td>
						</tr>
						<tr>
							<td colspan="13"><hr size="1" noshade width="100%"></td>
						</tr>  
						<tr>
							<td>手机流水号</td>
							<td>型号</td>
							<td>平台</td>	
							<td>公司</td>
							<td>重量 </td>
							<td>屏幕</td>
							<td>售价</td>
							<td>相机</td>	
							<td>新品、精品标志</td>
							<td>库存数量</td>
							<td>内存</td>
							<td>图片名称</td>							
							<td>操作</td>	
						</tr>
						<%
PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
	//查询到所有用户，并保存到列表employeeList中，列表中的每一个元素保存了一个用户的信息 
	ArrayList<Phone> phoneList = phoneInfoDAOImpl.queryPhone();
	//通过foreach的方式循环显示所有管理员信息
	for (Phone phone:phoneList){
%>
							<tr>
								<td><%=phone.getPhoneid()%></td>
								<td><%=phone.getPhonename() %></td>
								<td><%=phone.getPlatform() %></td>
								<td><%=phone.getCompanyid()%></td>
								<td><%=phone.getWeight() %></td>
								<td><%=phone.getDisplay() %></td>
								<td><%=phone.getPrice() %></td>
								<td><%=phone.getCamera()%></td>
								<td><%=phone.getType() %></td>
								<td><%=phone.getQuantity() %></td>
								<td><%=phone.getRam() %></td>
								<td><%=phone.getPicture() %></td>
								<td>
								<a href="../PDetelePhoneServlet?phoneid=<%=phone.getPhoneid() %>">删除</a>
								<a href="../PQueryByIdServlet?phoneid=<%=phone.getPhoneid() %>">修改</a>
								</td>
								
							</tr>
<%
	}
%>
					</table>
				</div></td>
			</tr>  
			 
		</table>
	</div> <div >
						<jsp:include page="bottom.jsp" />
					</div>
</body>
</html>
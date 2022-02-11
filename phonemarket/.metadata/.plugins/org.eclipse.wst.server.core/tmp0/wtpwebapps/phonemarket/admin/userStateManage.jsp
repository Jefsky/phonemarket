<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page import ="cn.huateng.dao.impl.UserInfoDAOImpl,java.util.ArrayList,cn.huateng.bean.UserInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<link href="../css/maincss.css" rel="stylesheet" type="text/css">
</head>
<body>
<%
	String employeeid=(String)session.getAttribute("employeeid");
	if(employeeid==null){
		response.sendRedirect("index.jsp");
	}
%>
<%
	String msg = request.getParameter("msg");
	String error = request.getParameter("error");
	if(msg!=null&&"del_success".equals(msg)){
		%>
			<script type="text/javascript">
				alert("删除成功!");
			</script>
		<%
		}
	if(error!=null&&"queryUP_unsuccess".equals(msg)){
		%>
			<script type="text/javascript">
				alert("删除失败!");
			</script>
		<%
	}
	if(msg!=null&&"up_success".equals(msg)){
		%>
			<script type="text/javascript">
				alert("修改成功!");
			</script>
		<%
		}
	if(error!=null&&"up_unsuccess".equals(msg)){
		%>
			<script type="text/javascript">
				alert("修改失败!");
			</script>
		<%
	}
%><div >
						<jsp:include page="top.jsp" />
					</div>
<div align="center">	
		<table width="750" border="0" cellpadding="1" cellspacing="1">
			 
			<tr>
				<td>
					<div align="center">
						<table width="100%" border="0" cellpadding="1" cellspacing="1" class="td">
						<tr>
						<td>用户名</td>
						<td>姓名</td>
						<td>密码</td>
						<td>性别</td>
						<td>地址</td>
						<td>邮箱</td>
						<td>电话</td>
						<td>邮编</td>
						<td>状态</td>
						<td>操作</td>
						</tr>
<%
	UserInfoDAOImpl userInfoDAOImpl = new UserInfoDAOImpl();
	//查询到所有状态为0的用户，并保存到列表userList中，列表中的每一个元素保存了一个用户的信息 
	ArrayList<UserInfo> userList = userInfoDAOImpl.queryByState(0);
	//通过ｆｏｒｅａｃｈ的方式循环显示所有状态为０的用户信息
	for (UserInfo user:userList){
%>
							<tr>
								<td><%=user.getUserid()%></td>
								<td><%=user.getUsername() %></td>
								<td><%=user.getPassword() %></td>
								<td><%=user.getGender() %></td>
								<td><%=user.getAddress() %></td>
								<td><%=user.getEmail() %></td>
								<td><%=user.getPhone() %></td>
								<td><%=user.getPostcode()%></td>
								<td><%=user.getState() %></td>
								<td><a href="../UpdateUserStateServlet?userid=<%=user.getUserid() %>&state=1">通过</a> <a href="../DeteleUserServlet?userid=<%=user.getUserid() %>">删除</a></td>
							</tr>
<%
	}
%>
						</table>
					</div>
				</td>
			</tr>
			 
		</table><div >
						<jsp:include page="bottom.jsp" />
					</div>
</body>
</html>
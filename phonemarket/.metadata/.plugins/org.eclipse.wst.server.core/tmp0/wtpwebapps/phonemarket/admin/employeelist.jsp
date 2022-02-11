<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page import ="cn.huateng.dao.impl.EmployeeInfoDAOImpl,java.util.ArrayList,cn.huateng.bean.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<link href="../css/maincss.css" rel="stylesheet" type="text/css">
</head>
<body>
<%  //控制访问页面权限，必须登陆管理帐号
	String employeeid=(String)session.getAttribute("employeeid");
	if (employeeid==null){
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
	if(error!=null&&"queryUP_unsuccess".equals(msg)){
		%>
			<script type="text/javascript">
				alert("删除失败!");
			</script>
		<%
	}
%>
<div>
						<jsp:include page="top.jsp" />
					</div>
	<div align="center">
		<table width="750" border="0" cellspacing="1" cellpadding="1">
			 
			<tr> 
				<td ><div align="center">
					<table width="100%" border="0" cellpadding="1" cellspacing="1" class="td">
						<tr>
							<td colspan="8"><div align="right">
							<a href="employeeadd.jsp">新建</a>&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="employeesearch.jsp">查询</a>
							</div></td>
						</tr>
						<tr>
							<td colspan="8"><hr size="1" noshade width="100%"></td>
						</tr>
						<tr>
							<td>职工帐号</td>
							<td>姓名</td>
							<td>性别</td>
							<td>联系地址</td>
							<td>E-mail</td>
							<td>电话</td>
							<td>工作任务</td>
							<td>操作</td>
						</tr>
<%
EmployeeInfoDAOImpl employeeInfoDAOImpl = new EmployeeInfoDAOImpl();
	//查询到所有用户，并保存到列表employeeList中，列表中的每一个元素保存了一个用户的信息 
	ArrayList<Employee> employeeList = employeeInfoDAOImpl.queryEmployee();
	//通过foreach的方式循环显示所有管理员信息
	for (Employee employee:employeeList){
%>
							<tr>
								<td><%=employee.getEmployeeid()%></td>
								<td><%=employee.getName() %></td>
								<td><%=employee.getGender() %></td>
								<td><%=employee.getAddress()%></td>
								<td><%=employee.getEmail() %></td>
								<td><%=employee.getPhone() %></td>
								<td><%=employee.getTask() %></td>
								<td><a href="../EDeteleEmployeeServlet?employeeid=<%=employee.getEmployeeid() %>">删除</a></td>
								
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
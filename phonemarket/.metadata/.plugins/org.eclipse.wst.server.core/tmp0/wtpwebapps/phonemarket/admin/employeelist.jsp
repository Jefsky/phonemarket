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
<%  //���Ʒ���ҳ��Ȩ�ޣ������½�����ʺ�
	String employeeid=(String)session.getAttribute("employeeid");
	if (employeeid==null){
		response.sendRedirect("index.jsp");
	}
	String msg = request.getParameter("msg");
	String error = request.getParameter("error");
	if(msg!=null&&"del_success".equals(msg)){
		%>
			<script type="text/javascript">
				alert("ɾ���ɹ�!");
			</script>
		<%
		}
	if(error!=null&&"queryUP_unsuccess".equals(msg)){
		%>
			<script type="text/javascript">
				alert("ɾ��ʧ��!");
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
							<a href="employeeadd.jsp">�½�</a>&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="employeesearch.jsp">��ѯ</a>
							</div></td>
						</tr>
						<tr>
							<td colspan="8"><hr size="1" noshade width="100%"></td>
						</tr>
						<tr>
							<td>ְ���ʺ�</td>
							<td>����</td>
							<td>�Ա�</td>
							<td>��ϵ��ַ</td>
							<td>E-mail</td>
							<td>�绰</td>
							<td>��������</td>
							<td>����</td>
						</tr>
<%
EmployeeInfoDAOImpl employeeInfoDAOImpl = new EmployeeInfoDAOImpl();
	//��ѯ�������û��������浽�б�employeeList�У��б��е�ÿһ��Ԫ�ر�����һ���û�����Ϣ 
	ArrayList<Employee> employeeList = employeeInfoDAOImpl.queryEmployee();
	//ͨ��foreach�ķ�ʽѭ����ʾ���й���Ա��Ϣ
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
								<td><a href="../EDeteleEmployeeServlet?employeeid=<%=employee.getEmployeeid() %>">ɾ��</a></td>
								
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
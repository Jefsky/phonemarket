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
	if(msg!=null&&"up_success".equals(msg)){
		%>
			<script type="text/javascript">
				alert("�޸ĳɹ�!");
			</script>
		<%
		}
	if(error!=null&&"up_unsuccess".equals(msg)){
		%>
			<script type="text/javascript">
				alert("�޸�ʧ��!");
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
						<td>�û���</td>
						<td>����</td>
						<td>����</td>
						<td>�Ա�</td>
						<td>��ַ</td>
						<td>����</td>
						<td>�绰</td>
						<td>�ʱ�</td>
						<td>״̬</td>
						<td>����</td>
						</tr>
<%
	UserInfoDAOImpl userInfoDAOImpl = new UserInfoDAOImpl();
	//��ѯ������״̬Ϊ0���û��������浽�б�userList�У��б��е�ÿһ��Ԫ�ر�����һ���û�����Ϣ 
	ArrayList<UserInfo> userList = userInfoDAOImpl.queryByState(0);
	//ͨ����������ķ�ʽѭ����ʾ����״̬Ϊ�����û���Ϣ
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
								<td><a href="../UpdateUserStateServlet?userid=<%=user.getUserid() %>&state=1">ͨ��</a> <a href="../DeteleUserServlet?userid=<%=user.getUserid() %>">ɾ��</a></td>
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
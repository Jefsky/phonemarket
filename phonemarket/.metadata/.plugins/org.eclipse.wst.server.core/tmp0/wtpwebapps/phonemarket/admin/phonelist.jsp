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
				alert("ɾ���ɹ�!");
			</script>
		<%
		}
	if(error!=null&&"del_book_error".equals(error)){
%>
		<script type="text/javascript">
			alert("ɾ���ֻ�ʧ�ܣ�������!");
		</script>
<%
	}
	if(error!=null&&"publisherid_error".equals(error)){
%>
		<script type="text/javascript">
			alert("û����Ӧ�ֻ���Ϣ��������!");
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
								<a href="bookadd.jsp">�½�</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a href="booksearch.jsp">��ѯ</a>
							</div></td>
						</tr>
						<tr>
							<td colspan="13"><hr size="1" noshade width="100%"></td>
						</tr>  
						<tr>
							<td>�ֻ���ˮ��</td>
							<td>�ͺ�</td>
							<td>ƽ̨</td>	
							<td>��˾</td>
							<td>���� </td>
							<td>��Ļ</td>
							<td>�ۼ�</td>
							<td>���</td>	
							<td>��Ʒ����Ʒ��־</td>
							<td>�������</td>
							<td>�ڴ�</td>
							<td>ͼƬ����</td>							
							<td>����</td>	
						</tr>
						<%
PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
	//��ѯ�������û��������浽�б�employeeList�У��б��е�ÿһ��Ԫ�ر�����һ���û�����Ϣ 
	ArrayList<Phone> phoneList = phoneInfoDAOImpl.queryPhone();
	//ͨ��foreach�ķ�ʽѭ����ʾ���й���Ա��Ϣ
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
								<a href="../BDeteleBookServlet?bookid=<%=phone.getPhoneid() %>">ɾ��</a>
								<a href="../BQueryByIdServlet?bookid=<%=phone.getPhoneid() %>">�޸�</a>
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
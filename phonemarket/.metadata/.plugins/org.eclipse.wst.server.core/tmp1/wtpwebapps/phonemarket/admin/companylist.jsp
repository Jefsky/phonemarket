<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page import="cn.huateng.dao.impl.CompanyDAOImpl,cn.huateng.bean.Company,java.util.ArrayList" %>
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
	if(error!=null&&"del_company_error".equals(error)){
%>
		<script type="text/javascript">
			alert("ɾ����˾ʧ�ܣ�������!");
		</script>
<%
	}	
%>
<div >
						<jsp:include page="top.jsp" />
					</div>
	<div align="center">
		<table width="750" border="0" cellspacing="1" cellpadding="1">
			
			<tr> 
				<td ><div align="center">
					<table width="100%" border="0" cellpadding="1" cellspacing="1" class="td"> 
						<tr>
							<td colspan="8"><div align="right">
								<a href="companyadd.jsp">�½�</a>&nbsp;&nbsp;&nbsp;&nbsp;
							</div></td>
						</tr>
						<tr>
							<td colspan="8"><hr size="1" noshade width="100%"></td>
						</tr>  
						<tr>
							<td>��˾���</td>
							<td>��˾����</td>						
							<td>�������ַ</td>
							<td>��վ</td>
							<td>����</td>	
						</tr>	
<%
CompanyDAOImpl companyDAOImpl = new CompanyDAOImpl();
	//��ѯ�������û��������浽�б�employeeList�У��б��е�ÿһ��Ԫ�ر�����һ���û�����Ϣ 
	ArrayList<Company> companyList = companyDAOImpl.queryCompany();
	//ͨ��foreach�ķ�ʽѭ����ʾ���й���Ա��Ϣ
	for (Company company:companyList){
%>
							<tr>
								<td><%=company.getCompanyid()%></td>
								<td><%=company.getName()%></td>
								<td><%=company.getAddress()%></td>
								<td><%=company.getWebsite() %></td>
								<td><a href="../CDeteleCompanyServlet?companyid=<%=company.getCompanyid() %>">ɾ��</a></td>
								
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
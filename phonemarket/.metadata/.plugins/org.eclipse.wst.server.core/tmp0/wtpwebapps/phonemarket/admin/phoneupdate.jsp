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
		if(error!=null&&"update_book_error".equals(error)){
%>
			<script type="text/javascript">
				alert("�޸�ͼ��ʧ�ܣ�������!");
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
					<form action="/phonemarket/UpdateBookServlet" method="post">
			    		<table width="50%" border="0" cellpadding="1" cellspacing="1" class="td">
<%
	if(line==0){
%>							
							<tr> 
								<td width="30%">�ֻ���ˮ��</td>
								<td><div align="left"> 
									<%=phone.getPhoneid() %>								
								</div></td>								
							</tr>
							<tr> 
								<td>�ͺ�</td>
								<td><div align="left"> 
									<%=phone.getPhonename() %>
								</div></td>
							</tr>
							<tr> 
								<td>ƽ̨</td>
								<td><div align="left"> 
									<%=phone.getPlatform() %>
								</div></td>
							</tr>
							<tr> 
								<td>��˾id</td>
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
								<td>����</td>
								<td><div align="left"> 
									<%=phone.getWeight() %>
								</div></td>
							</tr>
							<tr> 
								<td>��Ļ</td>
								<td><div align="left"> 
									<%=phone.getDisplay() %>
								</div></td>
							</tr>
							<tr> 
								<td>�ۼ�</td>
								<td><div align="left"> 
									<input name="price" type="text" size="25" value="<%=phone.getPrice() %>" >
									<font color="red">*</font>
								</div></td>
							</tr>					
							<tr> 
								<td>��Ʒ,��Ʒ��־</td>
								<td><div align="left"> 
									<input name="type" type="text" size="25" value="<%=phone.getType() %>">
								</div></td>
							</tr>
							<tr> 
								<td>�������</td>
								<td><div align="left"> 
									<input name="quantity" type="text" size="25" value="<%=phone.getQuantity()%>">
								</div></td>
							</tr>		
							<tr> 
								<td>���</td>
								<td><div align="left"> 
									<%=phone.getCamera() %>
								</div></td>
							</tr>
							<tr> 
								<td>ͼƬ�ļ���</td>
								<td><div align="left"> 
									<%=phone.getPicture() %>
								</div></td>
							</tr>
							<tr> 
								<td>�ڴ�</td>
								<td><div align="left"> 
									<%=phone.getRam() %>
								</div></td>
							</tr>
							<tr> 
								<td colspan="2">
									<div align="center">
										<input type="hidden" name="bookid" value="<%=phone.getPhoneid()%>">
								        <input type="submit" value="���� ">
									</div>
								</td>
							</tr>	
<%
	}else{
%>
							<tr> 
							    <td colspan="2">&nbsp;&nbsp;�޸��ֻ��ɹ�!</td>
							</tr>
<%
	}
%>		
<%
	}else{
%>
	<tr>
		<td><div align="center">��Ҫ�޸ĵ���Ϣ������</div>
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
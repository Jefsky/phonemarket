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
	int line = 0;
	String s_line = request.getParameter("line");
	if(s_line!=null)
		line = Integer.parseInt(s_line);
	
	String error = request.getParameter("error");
	if(error!=null&&"add_phone_error".equals(error)){
%>
		<script type="text/javascript">
			alert("����ֻ�ʧ�ܣ�������!");
		</script>
<%
	}
%><div >
						<jsp:include page="top.jsp" />
					</div>
	<div align="center">
		<table width="750" border="0" cellspacing="1" cellpadding="1">
			 
			<tr> 
				<td><div align="center">
					<form action="/phonemarket/InsertPhoneServlet" method="post">
			    		<table width="50%" border="0" cellpadding="1" cellspacing="1" class="td">
<%
	if(line==0){
%>							
							<tr> 
								<td width="30%">�ֻ���ˮ��</td>
								<td><div align="left"> 
									<input name="phoneid" type="text"  size="25" >
									<font color="red">*</font>
								</div></td>								
							</tr>
							<tr> 
								<td>�ͺ�</td>
								<td><div align="left"> 
									<input name="phonename" type="text" size="25" >
									<font color="red">*</font>
								</div></td>
							</tr>
							<tr> 
								<td>ƽ̨</td>
								<td><div align="left"> 
									<input name="platform" type="text" size="25" >
									<font color="red">*</font>
								</div></td>
							</tr>
							<tr> 
								<td>��˾id</td>
								<td><div align="left">       
									<select name="companyid" >
<%
	CompanyDAOImpl companyDAOImpl  = new CompanyDAOImpl();
	ArrayList<Company> ls_company = companyDAOImpl.queryCompany();
	for(Company company:ls_company){	
%>
										<option value="<%=company.getCompanyid() %>" ><%=company.getName() %></option>
<%
	}
%>
									</select>
								</div></td>
							</tr>
							<tr> 
								<td>����</td>
								<td><div align="left"> 
									<input name="weight" type="text" size="25" >
								</div></td>
							</tr>
							<tr> 
								<td>��Ļ(Ӣ��)</td>
								<td><div align="left"> 
									<input name="display" type="text" size="25" >
								</div></td>
							</tr>
							<tr> 
								<td>�ۼ�</td>
								<td><div align="left"> 
									<input name="price" type="text" size="25" >
									<font color="red">*</font>
								</div></td>
							</tr>					
							<tr> 
								<td>��Ʒ,��Ʒ��־</td>
								<td><div align="left"> 
									<input name="type" type="text" size="25" >
								</div></td>
							</tr>
							<tr> 
								<td>�������</td>
								<td><div align="left"> 
									<input name="quantity" type="text" size="25" >
								</div></td>
							</tr>		
							<tr> 
								<td>�ڴ�</td>
								<td><div align="left"> 
									<input name="ram" type="text" size="25" >
								</div></td>
							</tr>
							<tr> 
								<td>ͼƬ�ļ���</td>
								<td><div align="left"> 
									<input name="picture" type="text" size="25" >
								</div></td>
							</tr>
							<tr> 
								<td>���ܼ��</td>
								<td><div align="left"> 
									<textarea name="content" cols="25" rows="10"></textarea>
								</div></td>
							</tr>
							<tr> 
								<td colspan="2">
									<div align="center">
								        <input type="submit" value="�½� ">
									</div>
								</td>
							</tr>	
<%
	}else{
%>
							<tr> 
							    <td colspan="2">&nbsp;&nbsp;����ֻ��ɹ�!</td>
							</tr>
<%
	}
%>			
			         	</table>
					</form>
				</div></td>
			</tr>
			 
		</table>
	</div> <div >
						<jsp:include page="../user/bottom.jsp" />
					</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<script type="text/javascript">
<!--
	function CheckSubmit(thisform){
		with(thisform){
			if(name.value==null||name.value==""){
				alert("����������");   //�����Ի��ڣ���ʾ����
				name.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;           //��������false;
			}
			if(linkman.value==null||linkman.value==""){
				alert("��������ϵ��");   //�����Ի��ڣ���ʾ����
				linkman.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
			if(phone.value==null||phone.value==""){
				alert("������绰");   //�����Ի��ڣ���ʾ����
				phone.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
		}
		return true;	
	}
//-->
</script>
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
	if(error!=null&&"add_company_eorror".equals(error)){
%>
		<script type="text/javascript">
			alert("���ӹ�˾ʧ�ܣ�������!");
		</script>
<%
	}
%>
<div align="center">
						<jsp:include page="top.jsp" />
					</div>
	<div align="center">
		<table width="750" border="0" cellspacing="1" cellpadding="1">
			
			<tr> 
				<td><div align="center">
					<form action="/phonemarket/InsertCompanyServlet" method="post"  onsubmit="return CheckSubmit(this)">
			    		<table width="50%" border="0" cellpadding="1" cellspacing="1" class="td">
<%
	if(line==0){
%>							
							<tr> 
								<td width="30%">��˾����</td>
								<td><div align="left"> 
									<input name="name" type="text"  size="25" >
									<font color="red">*</font>
								</div></td>								
							</tr>
							<tr> 
								<td>��ϵ��ַ</td>
								<td><div align="left"> 
									<input name="address" type="text" size="25" >
								</div></td>
							</tr>
							<tr> 
								<td>��ַ</td>
								<td><div align="left"> 
									<input name="website" type="text" size="25" >
									<font color="red">*</font>
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
							    <td colspan="2">&nbsp;&nbsp;���ӹ�˾�ɹ�!</td>
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
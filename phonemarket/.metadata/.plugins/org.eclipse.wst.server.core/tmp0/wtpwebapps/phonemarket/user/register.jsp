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
			if(userid.value==null||userid.value==""){
				alert("�������û���");   //�����Ի��ڣ���ʾ����
				userid.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;           //��������false;
			}
			if(password.value==null||password.value==""){
				alert("����������");   //�����Ի��ڣ���ʾ����
				userid.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
			if(password2.value==null||password2.value==""){
				alert("������У������");   //�����Ի��ڣ���ʾ����
				userid.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
			if(password.value!=password2.value){
				alert("����������У�����벻ͬ");   //�����Ի��ڣ���ʾ����
				userid.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
			if(username.value==null||username.value==""){
				alert("��������ʵ����");   //�����Ի��ڣ���ʾ����
				userid.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
			if(address.value==null||address.value==""){
				alert("�������ַ");   //�����Ի��ڣ���ʾ����
				userid.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
			if(postcode.value==null||postcode.value==""){
				alert("�������ʱ�");   //�����Ի��ڣ���ʾ����
				userid.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
			if(phone.value==null||phone.value==""){
				alert("������绰����");   //�����Ի��ڣ���ʾ����
				userid.focus();         //��ҳ���궨λ�ڸ�Ԫ����
				return false;
			}
		}
		return true;		
	}
//-->
</script>
<link href="../css/main.css" rel="stylesheet" type="text/css">
</head>
<body>

					<div >
						<jsp:include page="top.jsp" />
					</div>

<%
	int line=0;
	String line_s=request.getParameter("line");
	if(line_s!=null){
		line=Integer.parseInt(line_s);
	}
	if(line>0){
%>
	<tr><td><div align="center">�û�ע��ɹ���</div></td></tr>
	
<%
	}else{
%>
			<tr>
				<td>
					<div align="center">
					<form action="/phonemarket/InsertUserServlet" method="post" onsubmit="return CheckSubmit(this)">
						<table width="80%" border="0" cellpadding="1" cellspacing="1" class="td">
					<tr>
						<td colspan="2">&nbsp;������������ʵ��д���Ա�֤��ȷ������
						��Щ����δ�����ͻ�����ɽ�ֻ���ڴ���ͻ��Ķ�����Ϣ�������ϸ��ܡ�
						(��<font color="red">*</font>�ŵ�Ϊ������Ϣ�������Ŀ��Բ���)
						</td>
					</tr>
					<tr>
						<td width="15%"><div align="right">�û���</div></td>
						<td>
							<div align="left"><input type="text" name="userid" size="20">
							<font color="red">*</font>(Ϊ����ʹ����ͬ�û�������<a href="*">���</a>
							����û����Ƿ���Ч)
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">����</div></td>
						<td>
							<div align="left"><input type="password" name="password" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">��֤����</div></td>
						<td>
							<div align="left"><input type="password" name="password2" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">��ʵ����</div></td>
						<td>
							<div align="left"><input type="text" name="username" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">�Ա�</div></td>
						<td>
							<div align="left">
								<select name="gender">
									<option value="��">��</option>
									<option value="Ů">Ů</option>
								</select>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">סַ</div></td>
						<td>
							<div align="left"><input type="text" name="address" size="20">
							<font color="red">*</font>(�����ṩ��������ϸ�ĵ�ַ)
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">�ʱ�</div></td>
						<td>
							<div align="left"><input type="text" name="postcode" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">��ϵ�绰</div></td>
						<td>
							<div align="left"><input type="text" name="phone" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">E-mail</div></td>
						<td>
							<div align="left"><input type="text" name="email" size="20"></div>
						</td>
					</tr>
					<tr>
						<td><div align="right">&nbsp;</div></td>
						<td>
							<div align="left">
								<input type="submit" value="ע�����û�">
								<input type="submit" value="������д">
							</div>
						</td>
					</tr>
					</table>
				</form>
				</td>
			</tr>
<%
	}
%>
			 
		</table>
</div><div >
						<jsp:include page="bottom.jsp" />
					</div>
</body>
</html>
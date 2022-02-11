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
				alert("请输入用户名");   //弹出对话口，提示输入
				userid.focus();         //把页面光标定位在该元素上
				return false;           //方法返回false;
			}
			if(password.value==null||password.value==""){
				alert("请输入密码");   //弹出对话口，提示输入
				userid.focus();         //把页面光标定位在该元素上
				return false;
			}
			if(password2.value==null||password2.value==""){
				alert("请输入校验密码");   //弹出对话口，提示输入
				userid.focus();         //把页面光标定位在该元素上
				return false;
			}
			if(password.value!=password2.value){
				alert("输入密码与校验密码不同");   //弹出对话口，提示输入
				userid.focus();         //把页面光标定位在该元素上
				return false;
			}
			if(username.value==null||username.value==""){
				alert("请输入真实姓名");   //弹出对话口，提示输入
				userid.focus();         //把页面光标定位在该元素上
				return false;
			}
			if(address.value==null||address.value==""){
				alert("请输入地址");   //弹出对话口，提示输入
				userid.focus();         //把页面光标定位在该元素上
				return false;
			}
			if(postcode.value==null||postcode.value==""){
				alert("请输入邮编");   //弹出对话口，提示输入
				userid.focus();         //把页面光标定位在该元素上
				return false;
			}
			if(phone.value==null||phone.value==""){
				alert("请输入电话号码");   //弹出对话口，提示输入
				userid.focus();         //把页面光标定位在该元素上
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
	<tr><td><div align="center">用户注册成功！</div></td></tr>
	
<%
	}else{
%>
			<tr>
				<td>
					<div align="center">
					<form action="/phonemarket/InsertUserServlet" method="post" onsubmit="return CheckSubmit(this)">
						<table width="80%" border="0" cellpadding="1" cellspacing="1" class="td">
					<tr>
						<td colspan="2">&nbsp;以下资料请如实填写，以保证正确发货。
						这些资料未经过客户允许可将只用于处理客户的订货信息，对外严格保密。
						(带<font color="red">*</font>号的为必填信息，其他的可以不填)
						</td>
					</tr>
					<tr>
						<td width="15%"><div align="right">用户名</div></td>
						<td>
							<div align="left"><input type="text" name="userid" size="20">
							<font color="red">*</font>(为避免使用相同用户名，请<a href="*">检测</a>
							你的用户名是否有效)
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">密码</div></td>
						<td>
							<div align="left"><input type="password" name="password" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">验证密码</div></td>
						<td>
							<div align="left"><input type="password" name="password2" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">真实姓名</div></td>
						<td>
							<div align="left"><input type="text" name="username" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">性别</div></td>
						<td>
							<div align="left">
								<select name="gender">
									<option value="男">男</option>
									<option value="女">女</option>
								</select>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">住址</div></td>
						<td>
							<div align="left"><input type="text" name="address" size="20">
							<font color="red">*</font>(请您提供尽可能详细的地址)
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">邮编</div></td>
						<td>
							<div align="left"><input type="text" name="postcode" size="20">
							<font color="red">*</font>
							</div>
						</td>
					</tr>
					<tr>
						<td><div align="right">联系电话</div></td>
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
								<input type="submit" value="注册新用户">
								<input type="submit" value="重新填写">
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
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>login</title>
<SCRIPT LANGUAGE="javascript">
<!--
	function CheckSubmit(thisform){ //focus()方法，将光标定位于输出栏目
		with(thisform){
			if(userid.value==null || userid.value=="" ){
				alert("请输入用户名!"); 
				userid.focus(); 
				return false; 
			}else if(userid.value.indexOf("'")!=-1){ 
				alert("用户名不能包含单引号,空格等字符!"); 
				userid.focus(); 
				return false;
			}   
			if(password.value==null || password.value=="" ){
				alert("请输入密码!"); 
				password.focus(); 
				return false; 
			}   	 
		}
		return true;                                                                                          
	} 
//-->
</SCRIPT>
</head>

<body>
<%
	String s_userid=(String)session.getAttribute("userid");
	if(s_userid==null){
%>
<form name="loginform" action="/phonemarket/QueryByIdPwServlet" method="post" onsubmit="return CheckSubmit(this)">
	<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#f6f6f6" class="td">
		<tr>
			<td>用户名</td>
			<td><input name="userid" type="text" class="formtext" size="12"></td>
			<td >密码</td>
			<td ><input name="password" type="password" class="formtext" size="12"></td>
			<td colspan="4">
			 &nbsp&nbsp&nbsp<input name="loginbutton" type="submit" value="登录">
			 &nbsp&nbsp&nbsp<input type="reset" value="清除">
			 	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;<a href="register.jsp">新用户注册</a>
			</td>
		</tr>
		<tr>
			
		</tr>
	</table>
</form>
<%
	}else{
%>
	<table width="100%" border="0" cellpadding="0" bgcolor="#f6f6f6" class="td">
		<tr>
			<td width="30" colspan="4">&nbsp&nbsp&nbsp您好！<%=s_userid %>
			欢迎来到化腾晓枫手机商城</td>
		</tr>
		<tr>
			<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="shoppingcart.jsp">查看购书车</a>
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="index.jsp?op=exit">注销退出</a></td>
	</table>
<%
	}
%>
</body>
</html>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>Cellphone Admin - Login</title>
	<link rel="stylesheet" type="text/css" href="../css/login_admin.css">
	<script type="text/javascript">
<!--
	function CheckSubmit(thisform){
		with(thisform){
  			if(employeeid.value == "" ) {
  				alert("请输入用户名!"); 
  				employeeid.focus(); 
  				return false; 
  			}   
	  		if( password.value == "" ){ 
	  			alert("请输入密码!"); 
	  			password.focus(); 
	  			return false;
	  		} 	 
	  		if(employeeid.value.indexOf("'") != -1||employeeid.value.indexOf(" ") != -1){
	  			alert("用户名不能包含单引号,空格等字符!"); 
	  			employeeid.focus(); 
	  			return false; 
	  		}   	 
  		}
  		return true;                                                                                          
 	}
</script>
	</head>
	<body>
	<div id="container">
		<div class="logo">
			<img src="../image/logo.png" width="850" height="142">
		</div>
		<div id="box">
			<form name="loginform" action="/phonemarket/EQueryByIdPwServlet" method="post" onsubmit="return CheckSubmit(this)">
			<p class="main">
				<label>Username: </label>
				<input name="employeeid" type="text"  size="15">
				<label>&nbspPassword:   </label>
				<input name="password" type="password"  size="15" >
			</p>
			<p class="space">
				<input type="submit" value="Login" class="login" />
			</p>
			</form>
		</div>
	</div>
	</body>
</html>
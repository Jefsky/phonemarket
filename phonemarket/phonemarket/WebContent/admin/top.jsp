<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cellphone Store</title>
<style type="text/css">
body{
	margin : 0px;
	padding : 0;
}

/* ====== Navigation Main ====== */
div.navigation{
	font-family:"微软雅黑 Light", cursive;
	background-color:#009;
	padding-top : 30px;
	padding-bottom : 30px;
	height:170px;
	font-weight: bolder;
}

/* ====== Navigation Menu ====== */
div.navigation>ul{
	margin : 0px;
	
}

div.navigation>ul>li{
	list-style : none;
	display : inline-block;
	height : 90px;
	width : 90px;
	background-color : #DB542D;
	text-align : center;
	line-height : 90px;
	margin-top : 2px;
	margin-bottom : 2px;
}

div.navigation ul li a{
	cursor : pointer;
}

div.navigation>ul>li>a{
	position : relative;
	display : block;
	color:#FFF;
	font-size : 17px;
	text-decoration : none;
}



/* ====== Color class ======*/
div.navigation .color1{
	background-color : #0097aa;
}

div.navigation .color2{
	background-color : #9f00a7;
}

div.navigation .color3{
	background-color: #63C;
}

div.navigation .color4{
	background-color : #bb1d48;
}

/* ====== title span ====== */

div.navigation span{
	position : relative;
	font-family : 'Open Sans';
	font-weight : 300;
	font-size : 16px;
	margin-left : 40px;
	font-size : 28px;
	color : white;
}



#color{ margin-left:40px;}
#color li{  float:left; margin:0 5px;}
div.navigation ul li a:hover{ background-color: #CCC; color:#00C;}
#logo{ width:100%;}

</style>
</head>
<body>
<div class = "navigation">
	<div id="logo">
		<span><img src="/phonemarket/image/logo.png" width="350" height="85"></span> 
	</div>
	<ul id="color"> 
		<li class = "color1"><a href = "/phonemarket/user/index.jsp">前台主页</a></li>
		<li><a href = "/phonemarket/admin/employeelist.jsp">管理员列表</a></li>
		<li class = "color2"><a href = "/phonemarket/admin/userStateManage.jsp">用户列表</a></li>
		<li class = "color3"><a href = "/phonemarket/admin/companylist.jsp">公司列表</a></li>
		<li class = "color4"><a href = "/phonemarket/admin/phonelist.jsp">手机列表</a></li>
		<li><a href = "orderlist.jsp">订单列表</a></li>
	</ul> 
	
	
</div> 
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page import="cn.huateng.bean.ShopCartUnit,java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<script type="text/javascript">
<!--
function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; 
  document.MM_returnValue = false;
  for(i=0; i<(args.length-1); i+=2) 
	  eval(args[i]+".location='"+args[i+1]+"'");
}
//-->
</script>
<link rel="stylesheet" href="../css/maincss.css" type="text/css"/>
</head>
<body>
<%
	String s_userid=(String)session.getAttribute("userid");
	if(s_userid==null){
		response.sendRedirect("index.jsp");
	}
	//��ȡop���������op����ֵΪclearcart����ѹ��ﳵls_shopCartUnit��session���ö������Ƴ�
	String op = request.getParameter("op");
	if("clearcart".equals(op)){
		session.removeAttribute("ls_shopCartUnit");
	}
%>
<div >
						<jsp:include page="top.jsp" />
					</div>
	<div >
		<table width="100%" border="0" cellspacing="1" cellpadding="1" >
			<tr> 
    			<td ><div align="center">
     				<table width="100%" border="0" cellpadding="1" cellspacing="1" class="td">
        				<tr> 
          					<td colspan="7">���鳵</td>
        				</tr>
				        <tr> 
				          	<td colspan="7"><hr size="1" noshade width="100%"></td>
				        </tr>
<%
	//���ﳵls_shopCartUnit
	ArrayList<ShopCartUnit> ls_shopCartUnit = null;
	//��session���ö����л�ȡ���ﳵ������ls_shopCartUnit
	ls_shopCartUnit=(ArrayList<ShopCartUnit>)session.getAttribute("ls_shopCartUnit");
	if(ls_shopCartUnit!=null){	
%>
     					<tr> 
							<td>�ֻ���ˮ��</td>
							<td>�ͺ�</td>
							<td>��˾</td>
							<td>����</td>
							<td>����(��)</td>
							<td>�ϼ�</td>
							<td>����</td>
						</tr>
<%
		//ͨ��ѭ��foreach���ѹ��ﳵ�е�������ͼ����ʾ����
		for (ShopCartUnit shopCartUnit:ls_shopCartUnit){
%>
						<tr>
								<td><%=shopCartUnit.getPhoneid()%></td>
								<td><%=shopCartUnit.getPhonename()%></td>
								<td><%=shopCartUnit.getName()%></td>
								<td><%=shopCartUnit.getUnitprice()%></td>
								<td>
								<%=shopCartUnit.getOrdernum()%>
								
								<input type="button" onClick="MM_goToURL('parent','../PhoneOrdNumChangeServlet?flag=increase&phoneid=<%=shopCartUnit.getPhoneid() %>');return document.MM_returnValue" value=" + "> &nbsp;&nbsp;
								<input type="button" onClick="MM_goToURL('parent','../PhoneOrdNumChangeServlet?flag=decrease&phoneid=<%=shopCartUnit.getPhoneid() %>');return document.MM_returnValue" value=" - "> &nbsp;&nbsp;
								
								</td>
								<td><%=shopCartUnit.getSubamount() %></td>
								<td><a href="../DelPhoneFromCartServlet?flag=remove&phoneid=<%=shopCartUnit.getPhoneid() %>">ɾ��</a> </td>	
						</tr>
							<%
		}
							%>

<!-- ����ѭ����� -->		  
						<tr> 
							<td colspan="7"><div align="center">
								<input type="button" onClick="MM_goToURL('parent','shoppingcart.jsp?op=clearcart');return document.MM_returnValue" value=" ��չ��鳵 "> &nbsp;&nbsp;
								<input type="button" onClick="MM_goToURL('parent','index.jsp');return document.MM_returnValue" value=" �������� ">&nbsp;&nbsp;
								<input type="button" onClick="MM_goToURL('parent','order1.jsp');return document.MM_returnValue" value=" ȥ����̨ ">
							</div></td>
						</tr>
<%
	}else{
%>	
						<tr> 
						  <td colspan="7" height="500"> <div align="center" >���Ĺ��鳵Ϊ��!</div></td>
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
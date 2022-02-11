package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.huateng.bean.ShopCartUnit;
import java.util.ArrayList;

public final class shoppingcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=GB18030");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB18030\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("function MM_goToURL() { //v3.0\r\n");
      out.write("  var i, args=MM_goToURL.arguments; \r\n");
      out.write("  document.MM_returnValue = false;\r\n");
      out.write("  for(i=0; i<(args.length-1); i+=2) \r\n");
      out.write("\t  eval(args[i]+\".location='\"+args[i+1]+\"'\");\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/maincss.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String s_userid=(String)session.getAttribute("userid");
	if(s_userid==null){
		response.sendRedirect("index.jsp");
	}
	//获取op参数，如果op参数值为clearcart，则把购物车ls_shopCartUnit从session内置对象中移除
	String op = request.getParameter("op");
	if("clearcart".equals(op)){
		session.removeAttribute("ls_shopCartUnit");
	}

      out.write("\r\n");
      out.write("<div >\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t<div >\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\" >\r\n");
      out.write("\t\t\t<tr> \r\n");
      out.write("    \t\t\t<td ><div align=\"center\">\r\n");
      out.write("     \t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" class=\"td\">\r\n");
      out.write("        \t\t\t\t<tr> \r\n");
      out.write("          \t\t\t\t\t<td colspan=\"7\">购书车</td>\r\n");
      out.write("        \t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t        <tr> \r\n");
      out.write("\t\t\t\t          \t<td colspan=\"7\"><hr size=\"1\" noshade width=\"100%\"></td>\r\n");
      out.write("\t\t\t\t        </tr>\r\n");

	//购物车ls_shopCartUnit
	ArrayList<ShopCartUnit> ls_shopCartUnit = null;
	//从session内置对象中获取购物车并付给ls_shopCartUnit
	ls_shopCartUnit=(ArrayList<ShopCartUnit>)session.getAttribute("ls_shopCartUnit");
	if(ls_shopCartUnit!=null){	

      out.write("\r\n");
      out.write("     \t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>手机流水号</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>型号</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>公司</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>单价</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>数量(部)</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>合价</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");

		//通过循环foreach语句把购物车中的所有种图书显示出来
		for (ShopCartUnit shopCartUnit:ls_shopCartUnit){

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(shopCartUnit.getPhoneid());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(shopCartUnit.getPhonename());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(shopCartUnit.getName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(shopCartUnit.getUnitprice());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(shopCartUnit.getOrdernum());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" onClick=\"MM_goToURL('parent','../PhoneOrdNumChangeServlet?flag=increase&phoneid=");
      out.print(shopCartUnit.getPhoneid() );
      out.write("');return document.MM_returnValue\" value=\" + \"> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" onClick=\"MM_goToURL('parent','../PhoneOrdNumChangeServlet?flag=decrease&phoneid=");
      out.print(shopCartUnit.getPhoneid() );
      out.write("');return document.MM_returnValue\" value=\" - \"> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(shopCartUnit.getSubamount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><a href=\"../DelPhoneFromCartServlet?flag=remove&phoneid=");
      out.print(shopCartUnit.getPhoneid() );
      out.write("\">删除</a> </td>\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

		}
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 结束循环语句 -->\t\t  \r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"7\"><div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" onClick=\"MM_goToURL('parent','shoppingcart.jsp?op=clearcart');return document.MM_returnValue\" value=\" 清空购书车 \"> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" onClick=\"MM_goToURL('parent','index.jsp');return document.MM_returnValue\" value=\" 继续购书 \">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" onClick=\"MM_goToURL('parent','order1.jsp');return document.MM_returnValue\" value=\" 去收银台 \">\r\n");
      out.write("\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");

	}else{

      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t  <td colspan=\"7\" height=\"500\"> <div align=\"center\" >您的购书车为空!</div></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
 
	}

      out.write("\t\t\t          \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t</tr>  \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>  \r\n");
      out.write("\t<div >\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottom.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</div> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

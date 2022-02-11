package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.huateng.dao.impl.PhoneInfoDAOImpl;
import cn.huateng.bean.Phone;
import java.util.ArrayList;
import cn.huateng.bean.Company;
import cn.huateng.dao.impl.CompanyDAOImpl;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("        \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main.css\">\r\n");
      out.write("<title>化腾晓枫手机商城官网</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String op = request.getParameter("op");
	if("exit".equals(op)){
		session.removeAttribute("userid");
	}
	String error = request.getParameter("error");
	if(error!=null&&"queryUP_er".equals(error)){

      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"用户名或者密码错误\");\r\n");
      out.write("\t</script>\r\n");

	}
	if(error!=null&&"pwedit_error".equals(error)){

      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"用户密码修改失败\");\r\n");
      out.write("\t</script>\r\n");

	}
	if(error!=null&&"userInfoEdit_error".equals(error)){

      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"用户个人信息修改失败\");\r\n");
      out.write("\t</script>\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div >\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\t\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"td\">\t    \t\t\t\t\t\r\n");
      out.write("\t");

		PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
		ArrayList<Phone> ls_ephone = phoneInfoDAOImpl.queryPhoneByType(1);
		if(ls_ephone!=null){
			for(int i=0; i<(ls_ephone.size()>4?4:ls_ephone.size()); ){
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t");

		int count = 2;
		while(count>0){
			if(i<ls_ephone.size()){
				Phone phone = ls_ephone.get(i);
				i++;					
	
      out.write("\t\r\n");
      out.write("\t<td width=\"50%\">\t\t\t\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td  width=\"30%\" rowspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"phonedetail.jsp?phoneid=");
      out.print(phone.getPhoneid());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"../image/");
      out.print(phone.getPicture() );
      out.write("\" width=\"230\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"323\" border=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80\"><div align=\"left\">型号</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td >");
      out.print(phone.getPhonename() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80\"><div align=\"left\">平台</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td >");
      out.print(phone.getPlatform() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><div align=\"left\">公司</div></td>\r\n");

	CompanyDAOImpl companyDAOImpl =new CompanyDAOImpl();
	Company company = companyDAOImpl.cQueryById(phone.getCompanyid());
	if(company!=null){

      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80\">");
      out.print(company.getName() );
      out.write("</td>\r\n");

	}

      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80\"><div align=\"left\">屏幕</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td >");
      out.print(phone.getDisplay() );
      out.write("英寸</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80\"><div align=\"left\">定价</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(phone.getPrice() );
      out.write("元</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\"><div align=\"center\" float=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/phonemarket/AddtoCartServlet?phoneid=");
      out.print(phone.getPhoneid());
      out.write("\">放入购物车</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div></td>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");

			}else{

      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<td width=\"50%\"></td>\r\n");

			}
		count--;
		}

      out.write("\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");

			}
		}	

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t\r\n");
      out.write("\t\t    \t\t\t\t</table>\r\n");
      out.write("\t\t    \t\t\t</td>\r\n");
      out.write("\t\t    \t\t\t<td width=\"1\" bgcolor=\"#999999\"></td>\r\n");
      out.write("\t\t    \t\t</tr>\r\n");
      out.write("\t\t    \t\t<tr bgcolor=\"#999999\"><td height=\"1\" colspan=\"3\" nowrap></td>\r\n");
      out.write("\t\t    \t\t</tr>\r\n");
      out.write("\t\t    \t</table>\r\n");
      out.write("\t\t    \t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t    \t\t\t<td height=\"1\" nowrap bgcolor=\"#CCCCCC\"></td>\r\n");
      out.write("\t\t    \t\t</tr>\r\n");
      out.write("\t\t    \t</table>\t\t    \t\r\n");
      out.write("\t\t    \t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t    \t\t<tr bgcolor=\"#999999\"></tr>\r\n");
      out.write("\t\t    \t\t<tr>\r\n");
      out.write("\t\t    \t\t\t<td width=\"0\" nowrap bgcolor=\"#999999\"></td>\r\n");
      out.write("\t\t    \t\t\t<td>\r\n");
      out.write("\t\t    \t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"td\">\r\n");
      out.write("\t\t    \t\t\t\t\t\r\n");
      out.write("\t");

		PhoneInfoDAOImpl phoneInfoDAOImpl2 = new PhoneInfoDAOImpl();
		ArrayList<Phone> ls_ephone2 = phoneInfoDAOImpl2.queryPhoneByType(2);
		if(ls_ephone!=null){
			for(int i=0; i<(ls_ephone2.size()>4?4:ls_ephone2.size()); ){
	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t");

		int count = 2;
		while(count>0){
			if(i<ls_ephone2.size()){
				Phone phone2 = ls_ephone2.get(i);
				i++;					
	
      out.write("\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"50%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"td\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"30%\" rowspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"phonedetail.jsp?phoneid=");
      out.print(phone2.getPhoneid());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"../image/");
      out.print(phone2.getPicture() );
      out.write("\" width=\"230\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"323\" border=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25%\"><div align=\"left\">型号</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(phone2.getPhonename() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25%\"><div align=\"left\">平台</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(phone2.getPlatform() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25%\"><div align=\"left\">公司</div></td>\r\n");

	CompanyDAOImpl companyDAOImpl2 =new CompanyDAOImpl();
	Company company2 = companyDAOImpl2.cQueryById(phone2.getCompanyid());
	if(company2!=null){

      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(company2.getName() );
      out.write("</td>\r\n");

	}

      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25%\"><div align=\"left\">屏幕</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(phone2.getDisplay() );
      out.write("英寸</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25%\"><div align=\"left\">定价</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(phone2.getPrice() );
      out.write("元</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\"><div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/phonemarket/AddtoCartServlet?phoneid=");
      out.print(phone2.getPhoneid());
      out.write("\">放入购物车</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div></td>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");

			}else{

      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<td width=\"50%\"></td>\r\n");

			}
		count--;
		}

      out.write("\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");

			}
		}	

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\t\t\t\t\r\n");
      out.write("\t\t    \t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottom.jsp", out, false);
      out.write("\t\t\t\r\n");
      out.write("</div>\r\n");
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

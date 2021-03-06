package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.runtime.JspRuntimeLibrary;

import cn.huateng.bean.Phone;
import cn.huateng.dao.impl.PhoneInfoDAOImpl;

/**
 * Servlet implementation class InsertPhoneServlet
 */
public class InsertPhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPhoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int line=0;
		Phone phone = new Phone();
		request.setCharacterEncoding("GB18030");
		JspRuntimeLibrary.introspect(phone, request);
		PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
		line=phoneInfoDAOImpl.insertPhone(phone);
		if(line>0){
			response.sendRedirect("/phonemarket/admin/phoneadd.jsp?line="+line);
		}else{
			response.sendRedirect("/phonemarket/admin/phoneadd.jsp?error=add_phone_eorror");
		}
	}

}

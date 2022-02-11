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
 * Servlet implementation class UpdatePhoneServlet
 */
public class UpdatePhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePhoneServlet() {
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
		request.setCharacterEncoding("GB18030");
		Phone phone = new Phone();
		JspRuntimeLibrary.introspect(phone, request);
		int line=0;
		PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
		line=phoneInfoDAOImpl.updatePhone(phone);
		phone = phoneInfoDAOImpl.pQueryById(phone.getPhoneid());
		request.setAttribute("phone", phone);
		if(line>0){
			request.getRequestDispatcher("admin/phoneupdate.jsp?line="+line).forward(request,response);
		}else{
			request.getRequestDispatcher("admin/phoneupdate.jsp?error=update_phone_error").forward(request,response);
		}
	}

}

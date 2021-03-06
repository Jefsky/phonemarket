package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.dao.impl.PhoneInfoDAOImpl;

/**
 * Servlet implementation class PDetelePhoneServlet
 */
public class PDetelePhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PDetelePhoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int line =0;
		request.setCharacterEncoding("GB18030");
		String phoneid =request.getParameter("phoneid");
		PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();

		line = phoneInfoDAOImpl.pDeleteById(phoneid);
		if(line>0){

			response.sendRedirect("/phonemarket/admin/phonelist.jsp?msg=del_success");
		}else{

			response.sendRedirect("/phonemarket/admin/phonelist.jsp?error=del_phone_error");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

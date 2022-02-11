package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.bean.Phone;
import cn.huateng.dao.impl.PhoneInfoDAOImpl;



/**
 * Servlet implementation class PQueryByIdServlet
 */
public class PQueryByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PQueryByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Phone phone=null;
		request.setCharacterEncoding("GB18030");
		String phoneid =request.getParameter("phoneid");

		PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
		phone=phoneInfoDAOImpl.pQueryById(phoneid);
		if(phone!=null){

			request.setAttribute("phone", phone);
			request.getRequestDispatcher("admin/phoneupdate.jsp").forward(request,response);
		}else{
			response.sendRedirect("admin/phoneupdate.jsp?error=update_phone_error");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

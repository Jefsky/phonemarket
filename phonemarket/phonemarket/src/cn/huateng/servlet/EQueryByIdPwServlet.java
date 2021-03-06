package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.dao.impl.EmployeeInfoDAOImpl;

/**
 * Servlet implementation class EQueryByIdPwServlet
 */
public class EQueryByIdPwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EQueryByIdPwServlet() {
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
		boolean bo=false;
		request.setCharacterEncoding("GB18030");
		String employeeid =request.getParameter("employeeid");
		String password =request.getParameter("password");
		EmployeeInfoDAOImpl employeeInfoDAOImpl = new EmployeeInfoDAOImpl();
		bo=employeeInfoDAOImpl.eQueryByIdPw(employeeid, password);
		if(bo){

			request.getSession().setAttribute("employeeid",employeeid);
			response.sendRedirect("/phonemarket/admin/employeelist.jsp");
		}else{
			response.sendRedirect("/phonemarket/admin/index.jsp?error=queryUP_unsuccess");
		}
	}

}

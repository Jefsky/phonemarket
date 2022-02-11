package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.dao.impl.EmployeeInfoDAOImpl;


/**
 * Servlet implementation class EDeteleEmployeeServlet
 */
public class EDeteleEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EDeteleEmployeeServlet() {
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
		String employeeid =request.getParameter("employeeid");
		EmployeeInfoDAOImpl employeeInfoDAOImpl = new EmployeeInfoDAOImpl();

		line = employeeInfoDAOImpl.eDeleteById(employeeid);
		if(line>0){

			response.sendRedirect("/phonemarket/admin/employeelist.jsp?msg=del_success");
		}else{
			response.sendRedirect("/phonemarket/admin/employeelist.jsp?error=del_unsuccess");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

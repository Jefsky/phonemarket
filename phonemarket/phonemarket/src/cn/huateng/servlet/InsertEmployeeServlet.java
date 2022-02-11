package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.runtime.JspRuntimeLibrary;

import cn.huateng.bean.Employee;
import cn.huateng.dao.impl.EmployeeInfoDAOImpl;



/**
 * Servlet implementation class InsertEmployeeServlet
 */
public class InsertEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmployeeServlet() {
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
		Employee employee = new Employee();
		request.setCharacterEncoding("GB18030");
		JspRuntimeLibrary.introspect(employee, request);
		EmployeeInfoDAOImpl employeeInfoDAOImpl = new EmployeeInfoDAOImpl();
		line=employeeInfoDAOImpl.insertEmployee(employee);
		response.sendRedirect("/phonemarket/admin/employeeadd.jsp?line="+line);
	}

}

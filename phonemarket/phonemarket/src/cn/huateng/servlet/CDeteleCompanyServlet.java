package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.dao.impl.CompanyDAOImpl;


/**
 * Servlet implementation class CDeteleCompanyServlet
 */
public class CDeteleCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CDeteleCompanyServlet() {
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
		String companyid =request.getParameter("companyid");
		CompanyDAOImpl companyDAOImpl = new CompanyDAOImpl();

		line = companyDAOImpl.cDeleteById(companyid);
		if(line>0){

			response.sendRedirect("/phonemarket/admin/companylist.jsp?msg=del_success");
		}else{

			response.sendRedirect("/phonemarket/admin/companylist.jsp?error=del_company_error");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

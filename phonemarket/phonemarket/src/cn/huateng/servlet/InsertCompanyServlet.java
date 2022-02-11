package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.runtime.JspRuntimeLibrary;

import cn.huateng.bean.Company;
import cn.huateng.dao.impl.CompanyDAOImpl;

/**
 * Servlet implementation class InsertCompanyServlet
 */
public class InsertCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCompanyServlet() {
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
		Company company = new Company();
		request.setCharacterEncoding("GB18030");
		JspRuntimeLibrary.introspect(company, request);
		CompanyDAOImpl companyDAOImpl = new CompanyDAOImpl();
		line=companyDAOImpl.insertCompany(company);
		if(line>0){
			response.sendRedirect("/phonemarket/admin/companyadd.jsp?line="+line);
		}else{
			response.sendRedirect("/phonemarket/admin/companyadd.jsp?error=add_company_eorror");
		}
	}

}

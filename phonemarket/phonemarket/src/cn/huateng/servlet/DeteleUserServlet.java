package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.dao.impl.UserInfoDAOImpl;


/**
 * Servlet implementation class DeteleUserServlet
 */
public class DeteleUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeteleUserServlet() {
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
		String userid =request.getParameter("userid");
		UserInfoDAOImpl userInfoDAOImpl = new UserInfoDAOImpl();

		line = userInfoDAOImpl.deleteById(userid);
		if(line>0){

			response.sendRedirect("/phonemarket/admin/userStateManage.jsp?msg=del_success");
		}else{

			response.sendRedirect("/phonemarket/admin/userStateManage.jsp?error=del_unsuccess");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.dao.impl.UserInfoDAOImpl;


/**
 * Servlet implementation class QueryByIdPwServlet
 */
public class QueryByIdPwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryByIdPwServlet() {
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
		String userid =request.getParameter("userid");
		String password =request.getParameter("password");
		UserInfoDAOImpl userInfoDAOImpl = new UserInfoDAOImpl();
		bo=userInfoDAOImpl.queryByIdPw(userid, password);
		if(bo){
			request.getSession().setAttribute("userid",userid);
			response.sendRedirect("/phonemarket/user/index.jsp");
		}else{
			response.sendRedirect("/phonemarket/user/index.jsp?error=queryUP_er");
		}
	}

}

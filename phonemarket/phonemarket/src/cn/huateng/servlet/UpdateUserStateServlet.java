package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.dao.impl.UserInfoDAOImpl;


/**
 * Servlet implementation class UpdateUserStateServlet
 */
public class UpdateUserStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserStateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int line =0;
		String userid =request.getParameter("userid");
		String state =request.getParameter("state");
		request.setCharacterEncoding("GB18030");
		int state1=Integer.parseInt(state);

		line = UserInfoDAOImpl.updateUserState(userid, state1);
		if(line>0){

			response.sendRedirect("/phonemarket/admin/userStateManage.jsp?msg=up_success");
		}else{

			response.sendRedirect("/phonemarket/admin/userStateManage.jsp?error=up_unsuccess");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

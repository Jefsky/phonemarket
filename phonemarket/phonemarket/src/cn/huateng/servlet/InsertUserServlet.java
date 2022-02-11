package cn.huateng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.runtime.JspRuntimeLibrary;

import cn.huateng.bean.UserInfo;
import cn.huateng.dao.impl.UserInfoDAOImpl;



/**
 * Servlet implementation class InsertUserServlet
 */
public class InsertUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertUserServlet() {
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
		UserInfo userInfo = new UserInfo();
		request.setCharacterEncoding("GB18030");
		JspRuntimeLibrary.introspect(userInfo, request);
		UserInfoDAOImpl userInfoDAOImpl = new UserInfoDAOImpl();
		line=userInfoDAOImpl.insertUserInfo(userInfo);
		response.sendRedirect("/phonemarket/user/register.jsp?line="+line);
	
	}

}

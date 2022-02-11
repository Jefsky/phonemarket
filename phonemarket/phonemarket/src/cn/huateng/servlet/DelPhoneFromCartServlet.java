package cn.huateng.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.bean.ShopCartUnit;


/**
 * Servlet implementation class DelPhoneFromCartServlet
 */
public class DelPhoneFromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelPhoneFromCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("GB18030");
		String phoneid =request.getParameter("phoneid");
		@SuppressWarnings("unchecked")
		ArrayList<ShopCartUnit> ls_shopCartUnit= (ArrayList<ShopCartUnit>)request.getSession().getAttribute("ls_shopCartUnit");
		for(ShopCartUnit scu :ls_shopCartUnit){
			if(phoneid.equals(scu.getPhoneid())){
					ls_shopCartUnit.remove(scu);
					break;
			}
		}
		response.sendRedirect("user/shoppingcart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

package cn.huateng.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.bean.OrderDetail;
import cn.huateng.dao.impl.OrderDetailDAOImpl;


/**
 * Servlet implementation class ODqueryByOIdServlet
 */
public class ODqueryByOIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ODqueryByOIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String orderid =request.getParameter("orderid");
		OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
		ArrayList<OrderDetail> orderDetailList=orderDetailDAOImpl.queryByOrderId(orderid);
		if(orderDetailList!=null){
			request.getSession().setAttribute("orderDetailList", orderDetailList);
			response.sendRedirect("admin/orderlist.jsp");
		}else{
			response.sendRedirect("admin/orderlist.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

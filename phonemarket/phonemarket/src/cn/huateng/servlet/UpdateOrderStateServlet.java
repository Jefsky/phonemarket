package cn.huateng.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.bean.OrderDetail;
import cn.huateng.dao.impl.OrderDetailDAOImpl;
import cn.huateng.dao.impl.OrderFormDAOImpl;
import cn.huateng.dao.impl.PhoneInfoDAOImpl;


/**
 * Servlet implementation class UpdateOrderStateServlet
 */
public class UpdateOrderStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateOrderStateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("GB18030");
		String orderid = request.getParameter("orderid");
		String state_s = request.getParameter("state");
		int state = 0;
		if(state_s!=null){
			state= Integer.parseInt(state_s);
		}
		int line=0;
		//把订单中的图书寄给买家，即减少此种图书的数量
		if(state==0){   //针对已经发货，但需要把状态从1修改为2，即状态从已发货修改为交易成功
			OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
			ArrayList<OrderDetail> orderDetailList = orderDetailDAOImpl.queryByOrderId(orderid);
			for(OrderDetail orderDetail:orderDetailList){
				String phoneid = orderDetail.getPhoneid();
				int updatenum = -orderDetail.getOrdernum();
				PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
				line = phoneInfoDAOImpl.UpdatePhoneQuantity(phoneid, updatenum);
				if(line<=0){  //如果图书的库存不足，则不能实现修改图书数量的操作，则不能把订单的状态修改为1；
					break;
				}
			}
		}else{
			line=1;
		}
			int line2 = 0;
			if(line>0){
				OrderFormDAOImpl orderFormDAOImpl = new OrderFormDAOImpl();
				line2 = orderFormDAOImpl.UpdateOrderState(orderid, state);
			}
			if(line2>0){
				response.sendRedirect("admin/orderlist.jsp");
			}else{
				response.sendRedirect("admin/orderlist.jsp?error=update_orderstate_error");
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

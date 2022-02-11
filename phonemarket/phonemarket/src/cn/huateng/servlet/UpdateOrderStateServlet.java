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
		//�Ѷ����е�ͼ��ĸ���ң������ٴ���ͼ�������
		if(state==0){   //����Ѿ�����������Ҫ��״̬��1�޸�Ϊ2����״̬���ѷ����޸�Ϊ���׳ɹ�
			OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
			ArrayList<OrderDetail> orderDetailList = orderDetailDAOImpl.queryByOrderId(orderid);
			for(OrderDetail orderDetail:orderDetailList){
				String phoneid = orderDetail.getPhoneid();
				int updatenum = -orderDetail.getOrdernum();
				PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
				line = phoneInfoDAOImpl.UpdatePhoneQuantity(phoneid, updatenum);
				if(line<=0){  //���ͼ��Ŀ�治�㣬����ʵ���޸�ͼ�������Ĳ��������ܰѶ�����״̬�޸�Ϊ1��
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

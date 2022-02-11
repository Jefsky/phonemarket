package cn.huateng.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.runtime.JspRuntimeLibrary;

import cn.huateng.bean.OrderDetail;
import cn.huateng.bean.OrderForm;
import cn.huateng.bean.ShopCartUnit;
import cn.huateng.dao.impl.OrderDetailDAOImpl;
import cn.huateng.dao.impl.OrderFormDAOImpl;



/**
 * Servlet implementation class InsertOrderServlet
 */
public class InsertOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertOrderServlet() {
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
		OrderForm orderForm = new OrderForm();
		int totalnum=0;
		float totalamount=0;
		request.setCharacterEncoding("GB18030");
		//设置orderForm中付费方式、送货方式、收货人、收货地址、联系电话、收件人邮编
		JspRuntimeLibrary.introspect(orderForm, request);
		String userid=(String)request.getSession().getAttribute("userid");
		orderForm.setUserid(userid);
		@SuppressWarnings("unchecked")
		ArrayList<ShopCartUnit> ls_shopCartUnit= (ArrayList<ShopCartUnit>)request.getSession().getAttribute("ls_shopCartUnit");
		for(ShopCartUnit scu :ls_shopCartUnit){
			//如果购物车中已经买了该种书
			totalnum+=scu.getOrdernum();
			totalamount+=scu.getSubamount();
		}
		//设置orderForm中所购图书数量和总金额的属性值
		orderForm.setTotalamount(totalamount);
		orderForm.setTotalnum(totalnum);
		//把下单时刻精确到毫秒作为订单号
		Date date = new Date();
		Long date_l = date.getTime();
		String date_s = String.valueOf(date_l);
		//设置orderForm中订单号的属性值
		orderForm.setOrderid(date_s);
		OrderFormDAOImpl orderFormDAOImpl = new OrderFormDAOImpl();
		int line1 = 0;
		int line2 = 0;
		line1 = orderFormDAOImpl.insertOrderForm(orderForm);
		//把购物车中所有类型的图书保存到orderdetail表的记录
		OrderDetail orderDetail = new OrderDetail();
		OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
		for(ShopCartUnit scu :ls_shopCartUnit){
			//通过遍历购物车把书籍信息保存到ordertail对象中然后调用插入方法
			orderDetail.setOrderid(date_s);
			orderDetail.setPhoneid(scu.getPhoneid());
			orderDetail.setPhonename(scu.getPhonename());
			orderDetail.setName(scu.getName());
			orderDetail.setUnitprice(scu.getUnitprice());
			orderDetail.setOrdernum(scu.getOrdernum());
			line2 = orderDetailDAOImpl.insertOrderDetail(orderDetail);
			if(line2<=0)
				break;
		}
		if(line1>0&&line2>0){
			request.getSession().setAttribute("orderForm",orderForm);
			request.getSession().setAttribute("ls_shopCartUnit",ls_shopCartUnit);
			response.sendRedirect("user/order2.jsp");
		}else{
			response.sendRedirect("user/order1.jsp");
		}
	}

}

package cn.huateng.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.huateng.bean.Company;
import cn.huateng.bean.Phone;
import cn.huateng.bean.ShopCartUnit;
import cn.huateng.dao.impl.CompanyDAOImpl;
import cn.huateng.dao.impl.PhoneInfoDAOImpl;

/**
 * Servlet implementation class AddtoCartServlet
 */
public class AddtoCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddtoCartServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("GB18030");
		String phoneid =request.getParameter("phoneid");
		Phone phone =null;
		Company company =null;
		PhoneInfoDAOImpl phoneInfoDAOImpl = new PhoneInfoDAOImpl();
		CompanyDAOImpl companyDAOImpl = new CompanyDAOImpl();
		ShopCartUnit shopCartUnit = new ShopCartUnit();
		phone =phoneInfoDAOImpl.pQueryById(phoneid);
		company=companyDAOImpl .cQueryById(phone.getCompanyid());
		shopCartUnit.setPhoneid(phone.getPhoneid());
		shopCartUnit.setPhonename(phone.getPhonename());
		shopCartUnit.setName(company.getName());
		shopCartUnit.setUnitprice(phone.getPrice());

		shopCartUnit.setOrdernum(1);
		shopCartUnit.setSubamount(shopCartUnit.getUnitprice()*shopCartUnit.getSubamount());


		@SuppressWarnings("unchecked")
		ArrayList<ShopCartUnit> ls_shopCartUnit= (ArrayList<ShopCartUnit>)request.getSession().getAttribute("ls_shopCartUnit");
		if(ls_shopCartUnit==null){

			ls_shopCartUnit = new ArrayList<ShopCartUnit>();

			ls_shopCartUnit.add(shopCartUnit);
		}else{

			boolean flag = false;
			for(ShopCartUnit scu :ls_shopCartUnit){

				if(phoneid.equals(scu.getPhoneid())){

					scu.setOrdernum(scu.getOrdernum()+1);
					scu.setSubamount(scu.getUnitprice()*scu.getOrdernum());
					flag = true;
				}
			}

			if(flag==false){
				ls_shopCartUnit.add(shopCartUnit);
			}
		}
		

		request.getSession().setAttribute("ls_shopCartUnit", ls_shopCartUnit);
		response.sendRedirect("/phonemarket/user/shoppingcart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

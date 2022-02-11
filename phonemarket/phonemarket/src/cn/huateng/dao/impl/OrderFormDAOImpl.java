package cn.huateng.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.huateng.bean.OrderForm;
import cn.huateng.dbc.DBConnection;



public class OrderFormDAOImpl {

	public int insertOrderForm(OrderForm orderForm){
		int line=0;
		Connection conn=null;
		PreparedStatement ppsm=null;
		DBConnection dbconn=new DBConnection();
		if(dbconn!=null){
			conn=dbconn.getConn();
			if(conn!=null){
				String sql="insert into orderform(orderid,orderdate,userid,totalnum,totalamount,payment,deliver,receiver,address,phone,postcode,state) values(?,getdate(),?,?,?,?,?,?,?,?,?,0)";
				try{
					ppsm =conn.prepareStatement(sql);
					ppsm.setString(1, orderForm.getOrderid());
					ppsm.setString(2, orderForm.getUserid());
					ppsm.setInt(3, orderForm.getTotalnum());
					ppsm.setFloat(4, orderForm.getTotalamount());
					ppsm.setString(5, orderForm.getPayment());
					ppsm.setString(6, orderForm.getDeliver());
					ppsm.setString(7, orderForm.getReceiver());
					ppsm.setString(8, orderForm.getAddress());
					ppsm.setString(9, orderForm.getPhone());
					ppsm.setString(10, orderForm.getPostcode());
					line= ppsm.executeUpdate();
					}catch(SQLException e){
					e.printStackTrace();
					}finally{
						try {
							if(ppsm!=null){
									ppsm.close();
								} 
							conn.close();}
						catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
			}
		}
	return line;
		
	}
	public ArrayList<OrderForm> queryOrderForm(){
		ArrayList<OrderForm> orderFormList=new ArrayList<OrderForm>();
		Connection conn=null;
		OrderForm orderForm;
		PreparedStatement ppsm=null;
		ResultSet rs = null;
		DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="select * from orderform";
					try {
						ppsm=conn.prepareStatement(sql);
						rs=ppsm.executeQuery();
						while (rs.next()){
							orderForm =new OrderForm();
							orderForm.setOrderid(rs.getString(1));
							orderForm.setOrderdate(rs.getString(2));
							orderForm.setUserid(rs.getString(3));
							orderForm.setTotalnum(rs.getInt(4));
							orderForm.setTotalamount(rs.getFloat(5));
							orderForm.setPayment(rs.getString(6));
							orderForm.setDeliver(rs.getString(7));
							orderForm.setReceiver(rs.getString(8));
							orderForm.setAddress(rs.getString(9));
							orderForm.setPhone(rs.getString(10));
							orderForm.setPostcode(rs.getString(11));
							orderForm.setState(rs.getInt(12));
							orderFormList.add(orderForm);
						}
						
					}catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						if(rs!=null){
							try {
								rs.close();
								if(ppsm!=null){
								ppsm.close();
								}
								if(conn!=null){
									conn.close();
								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					
					}
			}
		}
		return orderFormList;	
	}
	
	public int UpdateOrderState(String orderid,int state){
		int line = 0;
		//1）首先判断state值是否为0
		//2）如果订单状态为0则修改订单状态为1；如果订单状态为1则修改订单状态为2；
		Connection conn=null;
		PreparedStatement ppsm=null;
		DBConnection dbconn=new DBConnection();
		if(dbconn!=null){
			conn=dbconn.getConn();
			if(conn!=null){
				String sql="update orderform set state = ? where orderid = ?";
				try {
					ppsm =conn.prepareStatement(sql);
					if(state==0){
						ppsm.setInt(1, 1);
					}else if(state==1||state==2){
						ppsm.setInt(1, 2);
					}
					ppsm.setString(2, orderid);
					line=ppsm.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
					if(ppsm!=null){
							ppsm.close();
						} 
						conn.close();}
					catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
		}
		return line;
	}
	}
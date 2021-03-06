package cn.huateng.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.huateng.bean.OrderDetail;
import cn.huateng.dbc.DBConnection;



public class OrderDetailDAOImpl {

	 public int insertOrderDetail(OrderDetail orderDetail){
			int line=0;
			Connection conn=null;
			PreparedStatement ppsm=null;
			DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="insert into orderdetail(orderid,phoneid,phonename,name,unitprice,ordernum) values(?,?,?,?,?,?)";
					try{
						ppsm =conn.prepareStatement(sql);
						ppsm.setString(1, orderDetail.getOrderid());
						ppsm.setString(2, orderDetail.getPhoneid());
						ppsm.setString(3, orderDetail.getPhonename());
						ppsm.setString(4, orderDetail.getName());
						ppsm.setFloat(5, orderDetail.getUnitprice());
						ppsm.setInt(6, orderDetail.getOrdernum());						
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

	 public ArrayList<OrderDetail> queryByOrderId(String orderid){
			ArrayList<OrderDetail> orderDetailList=new ArrayList<OrderDetail>();
			Connection conn=null;
			PreparedStatement ppsm=null;
			ResultSet rs = null;
			OrderDetail orderDetail = null;
			DBConnection dbconn=new DBConnection();
				if(dbconn!=null){
					conn=dbconn.getConn();
					if(conn!=null){
						String sql="select * from orderdetail where orderid =?";
						try {
							ppsm=conn.prepareStatement(sql);
							ppsm.setString(1,orderid);
							rs=ppsm.executeQuery();
							if (rs.next()){
								orderDetail = new OrderDetail();
								orderDetail.setId(rs.getInt(1));
								orderDetail.setOrderid(rs.getString(2));
								orderDetail.setPhoneid(rs.getString(3));
								orderDetail.setPhonename(rs.getString(4));
								orderDetail.setName(rs.getString(5));
								orderDetail.setUnitprice(rs.getFloat(6));
								orderDetail.setOrdernum(rs.getInt(7));
								orderDetailList.add(orderDetail);
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
			return orderDetailList;	
		}
}

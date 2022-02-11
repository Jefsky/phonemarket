package cn.huateng.dao.impl;

	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
	


import cn.huateng.bean.Phone;
import cn.huateng.dbc.DBConnection;

	public class PhoneInfoDAOImpl {
		public int insertPhone(Phone phone){
			int line=0;
			Connection conn=null;
			PreparedStatement ppsm=null;
			DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="insert into phone(phoneid,phonename,platform,weight,display,camera,ram,massmenory,companyid,price,quantity,picture,type) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
					try{
						ppsm =conn.prepareStatement(sql);
						ppsm.setString(1,phone.getPhoneid());	
						ppsm.setString(2,phone.getPhonename());	
						ppsm.setString(3,phone.getPlatform());	
						ppsm.setString(4,phone.getWeight());	
						ppsm.setString(5,phone.getDisplay());	
						ppsm.setString(6,phone.getCamera());	
						ppsm.setString(7,phone.getRam());	
						ppsm.setString(8,phone.getMassmenory());	
						ppsm.setInt(9,phone.getCompanyid());	
						ppsm.setFloat(10,phone.getPrice());	
						ppsm.setInt(11,phone.getQuantity());	
						ppsm.setString(12,phone.getPicture());	
						ppsm.setInt(13,phone.getType());
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
		public ArrayList<Phone> queryPhone(){
			ArrayList<Phone> phoneList=new ArrayList<Phone>();
			Connection conn=null;
			Phone phone;
			PreparedStatement ppsm=null;
			ResultSet rs = null;
			DBConnection dbconn=new DBConnection();
				if(dbconn!=null){
					conn=dbconn.getConn();
				//���Ž��в�ѯ����ResultSet
					if(conn!=null){
						String sql="select * from phone";
						try {
							ppsm=conn.prepareStatement(sql);
							rs=ppsm.executeQuery();
							//���Ѳ�ѯ�����ת��ΪArrayList<UserInfo>���ͷ���.
							while (rs.next()){
								phone =new Phone();
								phone.setPhoneid(rs.getString(1));
								phone.setPhonename(rs.getString(2));
								phone.setPlatform(rs.getString(3));
								phone.setWeight(rs.getString(4));
								phone.setDisplay(rs.getString(5));
								phone.setCamera(rs.getString(6));
								phone.setRam(rs.getString(7));
								phone.setMassmenory(rs.getString(8));
								phone.setCompanyid(rs.getInt(9));
								phone.setPrice(rs.getFloat(10));
								phone.setQuantity(rs.getInt(11));
								phone.setPicture(rs.getString(12));
								phone.setType(rs.getInt(13));
								phoneList.add(phone);
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
			return phoneList;	
		}
		public int pDeleteById(String phoneid){
			int line = 0;
			Connection conn=null;
			PreparedStatement ppsm=null;
			DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="delete from phone where phoneid=?";
					try {
						ppsm =conn.prepareStatement(sql);
						ppsm.setString(1,phoneid);	
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
		//�޸Ĳ������Ƚ���һ�β�ѯ����bQueryById()��
		//UpdatePhoneServlet�޸Ĳ���������UpdatePhone()
		public Phone pQueryById(String phoneid){
			Phone phone = new Phone();
			Connection conn=null;
			PreparedStatement ppsm=null;
			ResultSet rs = null;
			DBConnection dbconn=new DBConnection();
				if(dbconn!=null){
					conn=dbconn.getConn();
					if(conn!=null){
						String sql="select * from phone where phoneid =?";
						try {
							ppsm=conn.prepareStatement(sql);
							ppsm.setString(1,phoneid);
							rs=ppsm.executeQuery();
							if (rs.next()){
								phone.setPhoneid(rs.getString(1));
								phone.setPhonename(rs.getString(2));
								phone.setPlatform(rs.getString(3));
								phone.setWeight(rs.getString(4));
								phone.setDisplay(rs.getString(5));
								phone.setCamera(rs.getString(6));
								phone.setRam(rs.getString(7));
								phone.setMassmenory(rs.getString(8));
								phone.setCompanyid(rs.getInt(9));
								phone.setPrice(rs.getFloat(10));
								phone.setQuantity(rs.getInt(11));
								phone.setPicture(rs.getString(12));
								phone.setType(rs.getInt(13));
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
			return phone;	
		}
		//Ȼ������ת���޸�ҳ��updatePhone.jsp[�۸���������־����ŵط�����Ϣ]
		public int updatePhone(Phone phone){
			int line=0;
			Connection conn=null;
			PreparedStatement ppsm=null;
			DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="update phone set price = ?,quantity = ? where phoneid = ?";
					try {
						ppsm =conn.prepareStatement(sql);
						ppsm.setFloat(1, phone.getPrice());
						ppsm.setInt(2, phone.getQuantity());
						ppsm.setString(3,phone.getPhoneid());
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
		public ArrayList<Phone> queryPhoneByType(int type){
			ArrayList<Phone> phoneList=new ArrayList<Phone>();
			Connection conn=null;
			Phone phone;
			PreparedStatement ppsm=null;
			ResultSet rs = null;
			DBConnection dbconn=new DBConnection();
				if(dbconn!=null){
					conn=dbconn.getConn();
					if(conn!=null){
						String sql="select * from phone where type=?";
						try {
							ppsm=conn.prepareStatement(sql);
							ppsm.setInt(1,type);
							rs=ppsm.executeQuery();
							while (rs.next()){
								phone =new Phone();
								phone.setPhoneid(rs.getString(1));
								phone.setPhonename(rs.getString(2));
								phone.setPlatform(rs.getString(3));
								phone.setWeight(rs.getString(4));
								phone.setDisplay(rs.getString(5));
								phone.setCamera(rs.getString(6));
								phone.setRam(rs.getString(7));
								phone.setMassmenory(rs.getString(8));
								phone.setCompanyid(rs.getInt(9));
								phone.setPrice(rs.getFloat(10));
								phone.setQuantity(rs.getInt(11));
								phone.setPicture(rs.getString(12));
								phone.setType(rs.getInt(13));
								phoneList.add(phone);
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
			return phoneList;	
		}
		public int UpdatePhoneQuantity(String phoneid, int updatenum){
			int line = 0;
			Phone phone=pQueryById(phoneid);
			int phonenum = phone.getQuantity()+updatenum;
			if(phonenum>=0){
				phone.setQuantity(phonenum);
				line = updatePhone(phone);
			}
			return line;
		}
	}


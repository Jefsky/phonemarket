package cn.huateng.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.huateng.bean.UserInfo;
import cn.huateng.dbc.DBConnection;


public class UserInfoDAOImpl {
	public int insertUserInfo(UserInfo userInfo){
		int line=0;
		Connection conn=null;
		PreparedStatement ppsm=null;
		DBConnection dbconn=new DBConnection();
		if(dbconn!=null){
			conn=dbconn.getConn();
			if(conn!=null){
				String sql="insert into userinfo(userid,username,password,gender,address,email,phone,postcode,state) values(?,?,?,?,?,?,?,?,?)";
				try{
					ppsm =conn.prepareStatement(sql);
					ppsm.setInt(1,userInfo.getUserid());	
					ppsm.setString(2,userInfo.getUsername());	
					ppsm.setString(3,userInfo.getPassword());	
					ppsm.setString(4,userInfo.getGender());	
					ppsm.setString(5,userInfo.getAddress());	
					ppsm.setString(6,userInfo.getEmail());	
					ppsm.setString(7,userInfo.getPhone());	
					ppsm.setString(8,userInfo.getPostcode());	
					ppsm.setInt(9,userInfo.getState());
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
	

	public ArrayList<UserInfo> queryByState(int state){
		
		ArrayList<UserInfo> userList=new ArrayList<UserInfo>();

		Connection conn=null;
		UserInfo info;
		PreparedStatement ppsm=null;
		ResultSet rs = null;
		DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();

				if(conn!=null){
					String sql="select * from userinfo where state=?";
					try {
						ppsm=conn.prepareStatement(sql);
						ppsm.setInt(1,state);
						rs=ppsm.executeQuery();

						while (rs.next()){
							info =new UserInfo();
							info.setUserid(rs.getInt(1));
							info.setUsername(rs.getString(2));
							info.setPassword(rs.getString(3));
							info.setGender(rs.getString(4));
							info.setAddress(rs.getString(5));
							info.setEmail(rs.getString(6));
							info.setPhone(rs.getString(7));
							info.setPostcode(rs.getString(8));
							info.setState(rs.getInt(9));
							userList.add(info);
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
		return userList;	
	}

	public int deleteById(String userid){
		int line = 0;
		Connection conn=null;
		PreparedStatement ppsm=null;
		DBConnection dbconn=new DBConnection();
		if(dbconn!=null){
			conn=dbconn.getConn();
			if(conn!=null){
				String sql="delete from userInfo where userid=?";
				try {
					ppsm =conn.prepareStatement(sql);
					ppsm.setString(1,userid);	
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

	public static int updateUserState(String userid,int state){
		int line = 0;
		Connection conn=null;
		PreparedStatement ppsm=null;
		DBConnection dbconn=new DBConnection();
		if(dbconn!=null){
			conn=dbconn.getConn();
			if(conn!=null){
				String sql="UPDATE userinfo SET state = ? WHERE userid = ? ";
				try {
					ppsm =conn.prepareStatement(sql);
					ppsm.setInt(1, state);
					ppsm.setString(2,userid);
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
	public Boolean queryByIdPw(String userid,String password){
		boolean bo = false;
		Connection conn=null;
		PreparedStatement ppsm=null;
		ResultSet rs = null;
		DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="select * from userinfo where userid=? and password=? and state=1";
					try {
						ppsm=conn.prepareStatement(sql);
						ppsm.setString(1, userid);
						ppsm.setString(2, password);
						rs=ppsm.executeQuery();
						if(rs.next()){
							bo=true;
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
		return bo;
	}
	public UserInfo queryById(String userid){
		Connection conn=null;
		UserInfo info=null;
		PreparedStatement ppsm=null;
		ResultSet rs = null;
		DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="select * from userinfo where userid=?";
					try {
						ppsm=conn.prepareStatement(sql);
						ppsm.setString(1,userid);
						rs=ppsm.executeQuery();
						if (rs.next()){
							info =new UserInfo();
							info.setUserid(rs.getInt(1));
							info.setUsername(rs.getString(2));
							info.setPassword(rs.getString(3));
							info.setGender(rs.getString(4));
							info.setAddress(rs.getString(5));
							info.setEmail(rs.getString(6));
							info.setPhone(rs.getString(7));
							info.setPostcode(rs.getString(8));
							info.setState(rs.getInt(9));
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
		return info;	
	}
}

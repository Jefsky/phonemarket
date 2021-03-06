package cn.huateng.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.huateng.bean.Company;
import cn.huateng.dbc.DBConnection;




public class CompanyDAOImpl {
		public int insertCompany(Company company){
			int line=0;
			Connection conn=null;
			PreparedStatement ppsm=null;
			DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="insert into company(name,address,website) values(?,?,?)";
					try{
						ppsm =conn.prepareStatement(sql);
						ppsm.setString(1,company.getName());	
						ppsm.setString(2,company.getAddress());	
						ppsm.setString(3,company.getWebsite());	
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
		public ArrayList<Company> queryCompany(){
			ArrayList<Company> companyList=new ArrayList<Company>();
			Connection conn=null;
			Company company;
			PreparedStatement ppsm=null;
			ResultSet rs = null;
			DBConnection dbconn=new DBConnection();
				if(dbconn!=null){
					conn=dbconn.getConn();
					if(conn!=null){
						String sql="select * from company";
						try {
							ppsm=conn.prepareStatement(sql);
							rs=ppsm.executeQuery();
							while (rs.next()){
								company =new Company();
								company.setCompanyid(rs.getInt(1));
								company.setName(rs.getString(2));
								company.setAddress(rs.getString(3));
								company.setWebsite(rs.getString(4));
								companyList.add(company);
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
			return companyList;	
		}
		public int cDeleteById(String companyid){
			int line = 0;
			Connection conn=null;
			PreparedStatement ppsm=null;
			DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="delete from company where companyid=?";
					try {
						ppsm =conn.prepareStatement(sql);
						ppsm.setString(1,companyid);	
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
	
		public Company cQueryById(int companyid){
			Connection conn=null;
			Company company=null;
			PreparedStatement ppsm=null;
			ResultSet rs = null;
			DBConnection dbconn=new DBConnection();
				if(dbconn!=null){
					conn=dbconn.getConn();
					if(conn!=null){
						String sql="select * from company where companyid=?";
						try {
							ppsm=conn.prepareStatement(sql);
							ppsm.setInt(1, companyid);
							rs=ppsm.executeQuery();
							if (rs.next()){
								company =new Company();
								company.setCompanyid(rs.getInt(1));
								company.setName(rs.getString(2));
								company.setAddress(rs.getString(3));
								company.setWebsite(rs.getString(4));
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
			return company;	
		}
}

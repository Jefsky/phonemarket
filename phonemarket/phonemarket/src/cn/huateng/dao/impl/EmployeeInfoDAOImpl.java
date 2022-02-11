package cn.huateng.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import cn.huateng.bean.Employee;
import cn.huateng.dbc.DBConnection;

public class EmployeeInfoDAOImpl {
	public int insertEmployee(cn.huateng.bean.Employee employee){
		int line=0;
		Connection conn=null;
		PreparedStatement ppsm=null;
		cn.huateng.dbc.DBConnection dbconn=new cn.huateng.dbc.DBConnection();
		if(dbconn!=null){
			conn=dbconn.getConn();
			if(conn!=null){
				String sql="insert into employee(employeeid,name,password,gender,address,email,phone,task) values(?,?,?,?,?,?,?,?)";
				try{
					ppsm =conn.prepareStatement(sql);
					ppsm.setString(1,employee.getEmployeeid());	
					ppsm.setString(2,employee.getName());	
					ppsm.setString(3,employee.getPassword());	
					ppsm.setString(4,employee.getGender());	
					ppsm.setString(5,employee.getAddress());	
					ppsm.setString(6,employee.getEmail());	
					ppsm.setString(7,employee.getPhone());	
					ppsm.setString(8,employee.getTask());	
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
	//ͨ���û�����������в�ѯ�����������һ����¼˵���û�����������ȷ�������棬�����
		public Boolean eQueryByIdPw(String employeeid,String password){
			boolean bo = false;
			Connection conn=null;
			PreparedStatement ppsm=null;
			ResultSet rs = null;
			DBConnection dbconn=new DBConnection();
				if(dbconn!=null){
					conn=dbconn.getConn();
				//���Ž��в�ѯ����ResultSet
					if(conn!=null){
						String sql="select * from employee where employeeid=? and password=?";
						try {
							ppsm=conn.prepareStatement(sql);
							ppsm.setString(1, employeeid);
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
		public ArrayList<Employee> queryEmployee(){
			//���ȶ���һ��ArrayList<UserInfo>���͵Ķ���userList���û������û���Ϣ
			ArrayList<Employee> employeeList=new ArrayList<Employee>();
			//Ȼ��������ݿ�����
			Connection conn=null;
			Employee employee;
			PreparedStatement ppsm=null;
			ResultSet rs = null;
			DBConnection dbconn=new DBConnection();
				if(dbconn!=null){
					conn=dbconn.getConn();
				//���Ž��в�ѯ����ResultSet
					if(conn!=null){
						String sql="select * from employee";
						try {
							ppsm=conn.prepareStatement(sql);
							rs=ppsm.executeQuery();
							//���Ѳ�ѯ�����ת��ΪArrayList<UserInfo>���ͷ���.
							while (rs.next()){
								employee =new Employee();
								employee.setEmployeeid(rs.getString(1));
								employee.setName(rs.getString(2));
								employee.setPassword(rs.getString(3));
								employee.setGender(rs.getString(4));
								employee.setAddress(rs.getString(5));
								employee.setEmail(rs.getString(6));
								employee.setPhone(rs.getString(7));
								employee.setTask(rs.getString(8));
								employeeList.add(employee);
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
			return employeeList;	
		}
		//�����û���ɾ���û�
		public int eDeleteById(String employeeid){
			int line = 0;
			Connection conn=null;
			PreparedStatement ppsm=null;
			DBConnection dbconn=new DBConnection();
			if(dbconn!=null){
				conn=dbconn.getConn();
				if(conn!=null){
					String sql="delete from employee where employeeid=?";
					try {
						ppsm =conn.prepareStatement(sql);
						ppsm.setString(1,employeeid);	
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
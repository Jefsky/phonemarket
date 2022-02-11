package cn.huateng.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection conn;
	private static final String DBDRIVER ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String DBURL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=phonemarket";
	private static final String DBUSER="sa";
	private static final String DBPW="123456";
	public DBConnection(){
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			conn=(DriverManager.getConnection(DBURL,DBUSER,DBPW));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Connection getConn() {
		return conn;
	}

}

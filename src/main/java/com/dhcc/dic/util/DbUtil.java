package com.dhcc.dic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.dhcc.dic.entity.TUser;

public class DbUtil {
	private Connection connection;
	public DbUtil(String url,String username,String password){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.connection=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeAll(Connection con,PreparedStatement st,ResultSet rs){
		try {
			con.close();
			st.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<TUser> getAllUsers(){
		List<TUser> users=null;
		
		return users;
	}
	
}

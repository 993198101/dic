package com.dhcc.dic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

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
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
//	public Object getColByType(int type){
//		Object o;
//	}
	public static void main(String ...args){
//		DbUtil d=new DbUtil("jdbc:oracle:thin:@127.0.0.1:1521:ORCL","DIC0620","123456");
//		System.out.println(d.getConnection());
//		d.closeAll(d.getConnection(), null, null);
		List a=new ArrayList ();
		a.add("ss");
		a.add(new Date());
		System.out.println(a);
	}
	
}

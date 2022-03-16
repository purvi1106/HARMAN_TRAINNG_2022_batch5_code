package com.jdbc.crud2;
import java.sql.*;
import java.util.Properties;
public class DemoCreatingConnection {

	public static void main(String[] args) {
		//
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded..");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		//connnectoin
		try {
			Properties info=new Properties();
			info.setProperty("user", "root");
			info.setProperty("password", "root");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yms21", info);
			
			
//			Connection connection=DriverManager.getConnection
//					("jdbc:mysql://127.0.0.1:3306/yms21?"+"user=root&password=root");
			
//			Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yms21", 
//					"root", "root");
			System.out.println("conn is done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

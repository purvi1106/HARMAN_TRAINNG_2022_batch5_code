package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class DeleteEmp {
	
	public static void main(String[] args) {
		//1. u need to load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded..");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		PreparedStatement stmt=null;
		Connection connection=null;
		
		try {
			 connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/harman5", "root", "root");
			
			stmt=connection.
					prepareStatement("delete from emp where id=?");
			
			stmt.setInt(1, 345);
		
			int noOfRowsEffected= stmt.executeUpdate();
			System.out.println(noOfRowsEffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}

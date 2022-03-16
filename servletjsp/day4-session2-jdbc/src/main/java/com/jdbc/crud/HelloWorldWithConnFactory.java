package com.jdbc.crud;

import java.sql.*;

public class HelloWorldWithConnFactory {

	public static void main(String[] args) {
		Connection  connection=ConnectionFactory.getConnection();
		try {
		
			Statement stmt=connection.createStatement();
		
			ResultSet rs=stmt.executeQuery("select * FROM emp1");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+":"+rs.getString("name")+":"+rs.getDouble("salary")
				+":"+rs.getString("dept"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

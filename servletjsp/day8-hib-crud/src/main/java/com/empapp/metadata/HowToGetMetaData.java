package com.empapp.metadata;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.empapp.factory.ConnectionFactory;
public class HowToGetMetaData {

	public static void main(String[] args) {
		Connection connection=ConnectionFactory.getConnection();
		//ResultSetMetaData
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from emp3");
			
//			DatabaseMetaData dbMetaData=connection.getMetaData();
//			System.out.println("getDriverMajorVersion:"+ dbMetaData.getDriverMajorVersion());
//			System.out.println("getDatabaseMinorVersion:"+ dbMetaData.getDatabaseMinorVersion());
//		
			
			
			ResultSetMetaData rsMetaData=rs.getMetaData();
			System.out.println("colums: "+ rsMetaData.getColumnCount());
			
			for(int i=1;i<=rsMetaData.getColumnCount(); i++) {
				System.out.println(rsMetaData.getColumnClassName(i));
				System.out.println(rsMetaData.getColumnName(i));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

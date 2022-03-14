package com.jdbc.perforance;

import java.sql.*;

import com.jdbc.crud.ConnectionFactory;

public class PrintHugeRecWrong {
	//time taken : 481(default fetch size)
	//time taken : 498(10000)
	//time taken : 481 (100)
	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		long start = System.currentTimeMillis();
		System.out.println("----");
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from mytable");

			ResultSet rs=pstmt.executeQuery();
			rs.setFetchSize(10000);
			///System.out.println(rs.getFetchSize());
			while(rs.next()) {
				rs.getString(1);
			}
			
			long end = System.currentTimeMillis();

			System.out.println("time taken : " + (end - start));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}

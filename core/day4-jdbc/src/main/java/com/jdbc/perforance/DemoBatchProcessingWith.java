package com.jdbc.perforance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.factory.ConnectionFactory;

public class DemoBatchProcessingWith {
	// with batch time taken : 11958ms: 12 sec

	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		long start = System.currentTimeMillis();
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into mytable(name) values(?)");

			// i want to controll tx
			 connection.setAutoCommit(false);

			for (long i = 0; i < 50000; i++) {
				pstmt.setString(1, "foo" + i);
				pstmt.addBatch();
				if(i%10000==0) {
					pstmt.executeBatch();
				}
			}

			connection.commit();
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

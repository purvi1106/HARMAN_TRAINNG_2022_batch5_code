package com.bookapp.model.dao;
import java.util.*;
import java.sql.*;

public class BookDaoImpl implements BookDao {

	public Connection connection;
	
	public BookDaoImpl() {
		connection=ConnectionFactory.getConnection();
	}

	@Override
	public List<Book> getAll() {
		//what i want to do? i want to get all rec from db and put into a array list and return that
		List<Book> books=new ArrayList<Book>();
		Book tempBook=null;
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from books");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				tempBook=new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				books.add(tempBook);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public void addBook(Book book) {
		try {
			PreparedStatement pstmt=connection.
					prepareStatement("insert into books(title, price) values(?,?)");
			pstmt.setString(1, book.getTitle());
			pstmt.setDouble(2, book.getPrice());
			pstmt.executeUpdate();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}

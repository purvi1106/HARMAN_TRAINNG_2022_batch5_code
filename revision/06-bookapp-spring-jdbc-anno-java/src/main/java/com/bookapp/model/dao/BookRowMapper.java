package com.bookapp.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// i need to write the code to convert rs to object
		Book book = new Book();
		book.setId(rs.getInt(1));
		book.setTitle(rs.getString(2));
		book.setPrice(rs.getDouble(3));
		return book;
	}

}

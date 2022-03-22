package com.bookapp.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class BookDaoImplJdbcTemplate implements BookDao {

	private JdbcTemplate jdbcTemplate;
	@Autowired
	public BookDaoImplJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public List<Book> getAll() {
		//RowMapper: it convert your rs --> to object
		return jdbcTemplate.query("select * from books", new BookRowMapper());
	}

	@Override
	public void addBook(Book book) {
		String INSERT_QUERY="insert into books(title, price) values(?,?)";
		jdbcTemplate.update(INSERT_QUERY, new Object[] {book.getTitle(), book.getPrice()});
	}
}

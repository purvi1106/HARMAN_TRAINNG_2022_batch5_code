package com.revision;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foo_table_temp")
public class Foo {

	@Column(name = "stud_id", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "stud_ename", nullable = false, length = 100)
	private String name;

	@Column(name = "stud_city", nullable = true, length = 100)
	private String city;

	public Foo(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public Foo() {

	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

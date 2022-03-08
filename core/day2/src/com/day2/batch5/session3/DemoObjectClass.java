package com.day2.batch5.session3;
//Object : java? ctr+shift+ T

class Emp {
	private int id;
	private String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// @Override //what is annotation : aka meta data
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	//u have to override equals method...

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class DemoObjectClass {

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "raj");
		Emp e2 = new Emp(1, "raj");

		// == must be used for primitive data
		// for object u should use equals methods
//		if(e1==e2) {
//			System.out.println("Are same");
//		}else
//			System.out.println("not eq");

		if (e1.equals(e2)) {
			System.out.println("Are same");
		} else
			System.out.println("not eq");

	}
}

package com.demo;

//OCP
public class Passanger {

	private String name;
	private Vehical vehical;

	public void setName(String name) {
		this.name = name;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	public void travel() {
		System.out.println("passanger : " + name);
		vehical.move();
	}
}

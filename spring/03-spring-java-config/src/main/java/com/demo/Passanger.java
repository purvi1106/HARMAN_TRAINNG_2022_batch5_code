package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value = "passanger")
public class Passanger {

	@Value(value = "raj")
	private String name;

	@Autowired
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

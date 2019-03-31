package com.jspiders.app;

public class Mobile {
	String model;
	void call(){
		System.out.println("Calling by using "+this.model);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.call();
		m.model="Samsungz4";
		m.call();
	}
}

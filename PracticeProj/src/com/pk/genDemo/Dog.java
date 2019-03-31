package com.pk.genDemo;

public class Dog extends Animal{
	Dog(String name, int legs, int tails) {
		super(name, legs, tails);
	}
	Animal playFetch(){
		System.out.println("i d rather lay on the caoch");
		return null;
	}

}

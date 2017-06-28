package com;

public class Person extends God {
	@Override
	public void doAction() {
		System.out.println("--- Persons Action");
	}

}

class Human extends Person {
	public void getHuman() {

	}

}

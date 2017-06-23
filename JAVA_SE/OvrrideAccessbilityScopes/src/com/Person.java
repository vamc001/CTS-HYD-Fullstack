package com;
class Animal{
	
	public Object getObject() {
		return new God();
		// Object obj=new God();
	}
}

class God {

	void human() {
		System.out.println("--- Human Operations");
	}
}

public class Person extends God {

	void robot() {
		System.out.println("-- Robot operations");
	}

	public static void main(String[] args) {

		//God g = new Person();
		//g.human();
		//Person pp = (Person)new God();
		//pp.human();
		//pp.robot();
		
		Animal a=new Animal();
		God g= (God)a.getObject();
		g.human();
		
		
		
		
		
		
		
		
		

	}
}

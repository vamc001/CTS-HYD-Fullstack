package com;

class C1 {

	public void f1() {

	}
	
	void f2() {
		
	}
	
	protected void f3() {
		
	}
	private void f4() {
		
	}

}

class C2 extends C1 {
	
	
	@Override
	public void f3() {
	
	}
	
	
	@Override
	public void f1() {

	}
	
	@Override
	 void f2() {
	
	}
}

public class Test {
	/*
	 * Overridden Method notes
	 *  -------------------------- 
	 * 1. If super class method
	 * is public, then overrideen method must be public and must not com down its
	 * accessibility
	 * 
	 * 2. if the super class method is default, then sub class over rideen method can be
	 *    default, public and protected. it cannot be private and default
	 *    
	 * 3. If the super class method is protected, then sub class over ridden method can be
	 *    public and protected. 
	 * 
	 * 4. private methods from super class cannot be overrrideen in the sub class.
	 */

	public static void main(String[] args) {
		

	}

}

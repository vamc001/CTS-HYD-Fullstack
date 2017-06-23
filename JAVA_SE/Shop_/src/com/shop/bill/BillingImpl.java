package com.shop.bill;

import com.shop.price.PriceMatrix;
import com.shop.price.PriceMatrixImpl;

//Dependent
public class BillingImpl {
	
	/*
	 * Design Issues
	 * --------------
	 * 
	 * 1. Too many Dependency Obj Creations ---> Per of app goes down
	 * 
	 * Why this issue?
	 * ----------------
	 * 1. Creating a dependency obj in the Dependent class
	 * 
	 * Solution
	 * ----------
	 * --> Do not create Dependency obj in the Dependent class
	 * --> Insted ask sone sone--> JNDI --> Loc binding issues
	 * 
	 * --> Create a inteface to Dependency, and Inject interfcae object from test class
	 * 
	 * --->  IOC --> Inversion of Control
	 * 
	 *  
	 * 
	 */
	private PriceMatrix price;
	

	public void setPrice(PriceMatrix price) {
		this.price = price;
	}


	public double findCartTotal(String[] cart) {

		double tot = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl();
		for (String itemCode : cart) {
			tot = tot + price.getItemPrice(itemCode);

		}

		return tot;

	}

}

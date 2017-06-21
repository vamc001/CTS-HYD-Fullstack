package com.cust;

import com.sale.SalesPerson;

public class Customer {

	int custID;
	String custName;
	double custBudget;

	public void purchase() {

		// Create Sales Person Object.

		/*
		 * 2 steps: 
		 * 
		 * a. Perform Memory Allocation --> 'new'
		 * b. Fill that Memory with Object var Values --> Constructor.
		 * 
		 */
		
		
		SalesPerson sp1 = new SalesPerson("Sean");

		String msg = sp1.takeOrder("Benjamin", "5 seat black sofa", "Dubai",
				"25 June");

		System.out.println("Message :" + msg);
	}

}

package com.shop;

import com.shop.bill.BillingImpl;
import com.shop.price.PriceMatrix;
import com.shop.price.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String cart1[] = { "P001", "P002", "P003" };
		String cart2[] = { "P001", "P002", "P003", "P004" };

		PriceMatrix price = new PriceMatrixImpl();

		// -----------------------------------------------
		BillingImpl bill = new BillingImpl();
		bill.setPrice(price); // DI --> Dependency Injection
		// -----------------------------------------------
		double total = bill.findCartTotal(cart1);

		System.out.println("Total of Cart 1 is " + total);

		total = bill.findCartTotal(cart2);

		System.out.println("Total of Cart 2 is " + total);

	}

}

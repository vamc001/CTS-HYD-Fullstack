package com.shop.price;

//Dependency
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrixImpl obj created...");
	}
	@Override
	public double getItemPrice(String itemCode) {
		// code to fetch price of an item from DB
		return 100.00;
	}

}

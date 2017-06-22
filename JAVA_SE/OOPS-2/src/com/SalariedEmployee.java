package com;

public class SalariedEmployee extends Employee {

	private int noOfDaysWorked;

	public SalariedEmployee(int noOfDaysWorked) {
		this.noOfDaysWorked = noOfDaysWorked;
	}

	public void f1() {

	}

	@Override
	public void computeSalary() {
		this.setSalary(noOfDaysWorked * this.getSalary());

	}

}

package com;

public class ContractEmployee extends Employee {
	private int noOfHoursWorked;

	public ContractEmployee(int noOfHoursWorked) {
		this.noOfHoursWorked = noOfHoursWorked;
	}

	@Override
	public void computeSalary() {
		this.setSalary(noOfHoursWorked * this.getSalary());

	}

}

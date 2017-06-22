package com;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	
	public void f2() {
		
	}
	
	public void computeSalary() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		// 
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displayEmpInfo() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employeee Name: "+empName);
		System.out.println("Salary: "+salary);
	}

}

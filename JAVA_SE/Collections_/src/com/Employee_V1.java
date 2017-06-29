package com;

import java.util.List;

public class Employee_V1 {

	private int empId;
	private String empName;
	private double salary;

	private List<Address> addrs;

	public List<Address> getAddrs() {
		return addrs;
	}

	public void setAddrs(List<Address> addrs) {
		this.addrs = addrs;
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
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Emp Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		//System.out.println("Addr Type: " + addr.getAddrType());
		//System.out.println("Address: " + addr.getAddress());
		System.out.println("-------------------------------------------");

	}

}

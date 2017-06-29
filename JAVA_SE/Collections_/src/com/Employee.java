package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	private Address addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
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
		System.out.println("Emp Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		//System.out.println("Addr Type: "+addr.getAddrType());
		//System.out.println("Address: "+addr.getAddress());
		System.out.println("-------------------------------------------");
		
	}
	
	
	
	
	
	

}

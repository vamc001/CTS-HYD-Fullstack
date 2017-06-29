package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
	private int empId;
	private String empName;
	private double salary;
	private Calendar dob;

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return empId - emp.getEmpId();
	}

	public Employee(int empId, String empName, double salary,Calendar dob) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dob=dob;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar dob) {
		this.dob = dob;
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

	public static void display(List<Employee> emps) {
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
		
		// System.out.println();
		System.out.println("EmpId\t\tName\t\tSalary\t\tDOB");
		System.out.println("---------------------------------------------");
		for (Employee emp : emps) {
			System.out.print(emp.getEmpId() + "\t\t" + emp.getEmpName() + "\t\t" + emp.getSalary()+"\t\t"+sf.format(emp.getDob().getTime()));
			System.out.println();
		}
		System.out.println("---------------------------------------------");

	}

}

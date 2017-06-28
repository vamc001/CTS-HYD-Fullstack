package com;

import java.io.Serializable;
import java.util.ArrayList;

import org.omg.IOP.TransactionService;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	private int empId;
	private String empName;
	private double salary;
	private transient String info = "Info about Emp";

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void f1() {
	}

	public void f2() {
	}

	public void f3() {
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

}

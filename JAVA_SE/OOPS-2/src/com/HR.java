package com;

public class HR {
	
	
	/*
	 * Notes
	 * ------
1. A reference of superclass object can store/hold all
   its sub class objects

2. The referece of super class can be used to access
   all the methods in the super class and over ridden 
   methods of sub class(a method which is there in    super and sub class).
3. The reference of super class obj cannot be used to
   access the invividual methods of sub class( a    method which is there only in sub class not not      present in super class)
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		/*SalariedEmployee se=new SalariedEmployee(23);
		se.setEmpId(1024);
		se.setEmpName("Ozvitha");
		se.setSalary(15000);*/
		
		/*ContractEmployee ce=new ContractEmployee(24);
		ce.setEmpId(10);
		ce.setEmpName("Praveen");
		ce.setSalary(80000);*/
		
	//--------------------------------
		//se.computeSalary(se);
		//ce.computeSalary(ce);
		
	//--------------------------------	
		

	Employee emp;
	emp=new SalariedEmployee(22);
	
	emp.setEmpId(1024);
	emp.setEmpName("Ozvitha");
	emp.setSalary(384738);
	emp.computeSalary();
	emp.displayEmpInfo();
	
	emp.f2();
	//emp.f1();
	
	
	emp=new ContractEmployee(18);
	emp.setEmpId(10);
	emp.setEmpName("Praveen");
	emp.setSalary(3434);
	emp.computeSalary();
	emp.displayEmpInfo();
		
		
		//se.displayEmpInfo();
		//ce.displayEmpInfo();
		
		
		
		
	}

}

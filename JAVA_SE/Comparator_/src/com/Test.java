package com;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary()-emp2.getSalary());
	}
	
}

class SortByDob implements Comparator<Employee>{
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getDob().compareTo(emp2.getDob());
	}
	
}
public class Test {

	public static void main(String[] args) {
		
		
		
		Calendar cl=Calendar.getInstance();
		cl.set(2011, 1-1, 11);
		
		Calendar c2=Calendar.getInstance();
		c2.set(1987, 4-1, 18);
		
		Calendar c3=Calendar.getInstance();
		c3.set(1965, 8-1, 12);
		
		
		Calendar c4=Calendar.getInstance();
		c4.set(1987, 5-1, 23);
		
		Calendar c5=Calendar.getInstance();
		c5.set(2011, 1-1, 23);
		
		Employee e1=new Employee(34, "Kud", 12000,cl);
		Employee e2=new Employee(23, "Ndf", 20000,c2);
		Employee e3=new Employee(14, "Gds", 19000,c3);
		Employee e4=new Employee(19, "Igf", 15000,c4);
		Employee e5=new Employee(12, "Bhj", 11000,c5);
		
		List<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		System.out.println("========================================");
		System.out.println("ORIGINAL EMPLOYEE DATA");
		System.out.println("========================================");
		
		Employee.display(emps);
		
		System.out.println("========================================");
		System.out.println("SORT BY ID EMPLOYEE DATA");
		System.out.println("========================================");
		
		Collections.sort(emps);
		
		Employee.display(emps);
		
		//--------------------------------------------------------------------
		
		System.out.println("========================================");
		System.out.println("SORT BY NAME EMPLOYEE DATA");
		System.out.println("========================================");
		
		Collections.sort(emps,new Employee());
		
		Employee.display(emps);
		
		//--------------------------------------------------------------------
		
				System.out.println("========================================");
				System.out.println("SORT BY SALARY EMPLOYEE DATA");
				System.out.println("========================================");
				
				Collections.sort(emps,new SortBySalary());
				
				Employee.display(emps);
			
				//--------------------------------------------------------------------
				
				System.out.println("========================================");
				System.out.println("SORT BY DOB EMPLOYEE DATA");
				System.out.println("========================================");
				
				Collections.sort(emps,new SortByDob());
				
				Employee.display(emps);
		
		
		
		
		
		
		
	}
}

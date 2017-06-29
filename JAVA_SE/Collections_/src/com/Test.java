package com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Employee_V1 emp = new Employee_V1();
		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(35566);

		Address present = new Address();
		Address per = new Address();
		present.setAddrType("Present Address");
		present.setAddress("#873,Hyderabad");

		per.setAddrType("Permanent Address");
		per.setAddress("#949,Chennai");
		
		
		List<Address> addrs=new ArrayList<>();
		addrs.add(present);
		addrs.add(per);
		
		emp.setAddrs(addrs);
		
		
		emp.display();
		
		for(Address addr:emp.getAddrs()) {
			addr.dispAddr();
		}
		

	}

}

package com.bank;

import com.bank.dao.BankDaoImpl;
import com.bank.dao.BankEmployee;
import com.bank.dao.Customer;
import com.bank.dao.Manager;

public class Test {
	
	public static void main(String[] args) {
		
		Customer cust=new BankDaoImpl();
		//cust.deposit(1222);
		//cust.withDraw(48);
		
		BankEmployee be=new BankDaoImpl();
		//be.openAccount();
		//be.closeAccount();
		
		Manager m=new BankDaoImpl();
		m.lockerAccess();
		
		
		
		
		
		
	}

}

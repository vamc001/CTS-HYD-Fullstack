package com.bank.dao;

public class BankDaoImpl implements Customer, BankEmployee, Manager {

	public void openAccount() {
		System.out.println("--- Account Opned");
	}

	public void closeAccount() {
		System.out.println("-- Account closed");
	}

	public double withDraw(double amt) {
		System.out.println("--- " + amt + " withdrawn");
		return amt;
	}

	public void deposit(int amt) {
		System.out.println("--- " + amt + " Deposited");
	}

	public void lockerAccess() {
		System.out.println("---- Locker acess given");
	}

}

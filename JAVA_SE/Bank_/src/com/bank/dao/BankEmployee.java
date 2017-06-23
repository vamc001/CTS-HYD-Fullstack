package com.bank.dao;

public interface BankEmployee {

	void openAccount();

	void closeAccount();

	double withDraw(double amt);

	void deposit(int amt);

}
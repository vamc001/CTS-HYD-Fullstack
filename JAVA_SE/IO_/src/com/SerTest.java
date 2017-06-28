package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(474434);

		try {

			FileOutputStream fos = new FileOutputStream("d:/cts.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);

			System.out.println("--- writing is done ");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}

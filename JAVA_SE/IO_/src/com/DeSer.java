package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSer {
	
	public static void main(String[] args) {
		
		try {
			File fileLoc=new File("d:/txt");
			FileInputStream fis=null;
			ObjectInputStream ois=null;
			
			if(!(fileLoc.exists())) {
			fis=new FileInputStream("d:/cts.txt");	
			ois=new ObjectInputStream(fis);
			}
			
			Employee e= (Employee) ois.readObject();
			
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getSalary());
			System.out.println("Info: "+e.getInfo());
			
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
	}

}

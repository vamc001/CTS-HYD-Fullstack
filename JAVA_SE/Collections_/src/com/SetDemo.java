package com;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> s=new TreeSet<>();
		s.add("bbb");
		s.add("ddd");
		s.add("aaa");
		s.add("ccc");
	
		s.add("aaa");
		
		System.out.println(s);
	}
}

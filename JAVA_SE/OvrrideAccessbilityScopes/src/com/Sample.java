package com;

import javax.swing.plaf.synth.SynthScrollBarUI;

class S1 {

	short f1() {
		return 0;
	}
}

class S2 extends S1 {

	@Override
	short f1() {

		return 0;
	}
}

public class Sample {

	void f1(int x) {
		System.out.println("X: " + x);
	}

	int f1(int y,float x) {
		return 1000;
	}

	void f1(short s) {
		System.out.println("S: " + s);
	}

	void f1(byte b) {
		System.out.println("B: " + b);
	}

	void f1(long l) {
		System.out.println("--- L: " + l);
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		//s.f1((long) 100);
		System.out.println(s.f1(100,100.65f));
	}

}

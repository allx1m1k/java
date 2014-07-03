package com.lux.classes;

public class StackTraceDemo {


	public static void methodA() {
		methodB();
	}

	public static void methodB() {
		methodC();
	}

	public static void methodC() {
		methodD();
	}

	public static void methodD() {
		int i = 10/0;
	}
	
	
	public static void main(String[] args) {
		methodA();
	}

}

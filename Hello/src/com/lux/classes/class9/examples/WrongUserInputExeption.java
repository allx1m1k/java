package com.lux.classes.class9.examples;

public class WrongUserInputExeption extends Exception {

	public WrongUserInputExeption() {
		super("Received wrong data!");
	}

	public WrongUserInputExeption(String arg0) {
		super(arg0);
	}

}

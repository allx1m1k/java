package com.lux.training.class19.version0;

public class Fork {
	
	int number;

	public Fork(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return Integer.toString(number);
	}
}

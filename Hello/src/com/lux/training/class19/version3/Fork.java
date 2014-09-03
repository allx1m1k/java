package com.lux.training.class19.version3;

public class Fork {
	
	private int number;
	private boolean avaliable = true;

	public Fork(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	public boolean isAvaliable() {
		return avaliable;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}

	@Override
	public String toString() {
		return Integer.toString(number);
	}
}

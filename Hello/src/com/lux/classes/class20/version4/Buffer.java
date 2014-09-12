package com.lux.classes.class20.version4;

public interface Buffer {
	
	public void put(String line) throws InterruptedException;
	public String get() throws InterruptedException;
	public int size();

}

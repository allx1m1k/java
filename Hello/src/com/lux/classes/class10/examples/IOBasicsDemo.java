package com.lux.classes.class10.examples;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class IOBasicsDemo {

	
	public static void main(String[] args) throws MalformedURLException, IOException {
		InputStream is = new FileInputStream("test.txt");
		//InputStream is = new ByteArrayInputStream(new byte[] {104, 101, 108, 108, 111});
		//InputStream is = new URL("http://oracle.com").openStream(); 
		
		print(is);
		is.close();
	}
	
	public static void print(InputStream is) throws IOException {		
		int value = is.read();
		while (value != -1) {
			System.out.print((char) value);
			value = is.read();
		}
	}

}

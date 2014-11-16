package com.lux.classes.class10.examples;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DecoratorDemo {

    public static void blockCopy(InputStream is, OutputStream ous) throws IOException {
        byte[] b = new byte[1024];
        int count = 0;
        while ((count = is.read(b)) != -1) {
            ous.write(b, 0, count);
        }
    }
	
    public static void simpleCopy(InputStream is, OutputStream ous) throws IOException {
    	int value = 0;
        while ((value = is.read()) != -1) {
            ous.write(value);
        }
    }
    
    public static void main(String[] args) {
		
		try (
				InputStream is = new FileInputStream("String.html");
				OutputStream ous = new ByteArrayOutputStream();
			) {
				simpleCopy(is,ous);
				System.out.println(ous);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		
	}

}

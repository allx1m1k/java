package com.lux.classes.class9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TryWithDemo {

	public static String getTextFromFile(String path) throws FileNotFoundException, IOException {

        try(
			FileReader fs = new FileReader(path);
				TestResource ts = new TestResource();
		)	
		{
			char[] content = new char[1000]; 
			//fs.read(content);
			ts.test();
			return Arrays.toString(content);
		}
        //return null;
	}

	
	public static void main(String[] args) {
        try {
            System.out.println(getTextFromFile("e:/test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}

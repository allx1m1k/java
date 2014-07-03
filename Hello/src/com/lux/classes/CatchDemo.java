package com.lux.classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CatchDemo {

	//Checked exceptions without throws
	public static String getTextFromFile1(String path) {
		FileReader fs = null;
		char[] content = new char[1000]; 
		try {
			fs = new FileReader(path);
			fs.read(content);
			return Arrays.toString(content);
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} 
		catch (IOException e) {
			System.out.println("I/O Error");;
		}		
		finally {
			try {
				fs.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	//Checked exceptions with throws
	public static String getTextFromFile2(String path) throws FileNotFoundException, IOException {
		FileReader fs = null;
		char[] content = new char[1000]; 

		fs = new FileReader(path);
		fs.read(content);
		return Arrays.toString(content);

	}

	public static void main(String[] args) 
	{
		System.out.println(getTextFromFile1("e:/test.txt"));
	}
}

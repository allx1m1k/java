package com.lux.classes.class10.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharsetDemo {

	public static void main(String[] args) throws IOException {
		try (
				BufferedReader br = new BufferedReader(new FileReader("hello_utf8.txt")); 
				) {
			String line;
			while ((line = br.readLine()) != null) {				
				System.out.println(line);
			}
		}
	}

}


//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("hello_cp866.txt"), "cp866"));
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("testcp.txt"), "utf-8"));
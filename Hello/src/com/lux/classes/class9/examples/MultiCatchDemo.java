package com.lux.classes.class9.examples;

import java.io.FileInputStream;
import java.io.IOException;

public class MultiCatchDemo {

	public static void main(String[] args) {

		//Method 1
		try { 
			Class<?> stringClass = Class.forName("java.lang.String"); 
			FileInputStream in = new FileInputStream("test.log") ;  
			in.read(); 

		} catch (IOException e) { 
			System.out.println("There was an IOException "+e); 
		} catch (ClassNotFoundException e) { 
			System.out.println("There was a ClassCastException "+e); 
		}
		
		
		//Method 2 (Java 7 and later)
		try { 
			Class<?> stringClass = Class.forName("java.lang.String"); 
			FileInputStream in = new FileInputStream("test.log") ;  
			in.read(); 
        } catch (IOException | ClassNotFoundException e) { 
            System.out.println("An exception of type "+e.getClass()+" was thrown! "+e); 
        }		

	}

}

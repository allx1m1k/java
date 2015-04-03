package com.lux.classes.class10.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.lux.classes.class4.examples.Rectangle;

public class SerializationDemo {
	
	public static void serializeRectangle(Rectangle obj) throws IOException {
		ObjectOutputStream ous = null;
		try {
			ous = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("sertest.dat")));			
			ous.writeObject(obj);
			ous.flush();
		} catch (IOException e) {
			throw new IOException("Serialization error", e);
		}
		finally {
			if (ous != null) {
				ous.close();
			}
		}
	}
	
	public static Rectangle deserializeRectangle() throws IOException {
		ObjectInputStream is = null;
		Rectangle rect = null;
		try {
			is = new ObjectInputStream(new BufferedInputStream(new FileInputStream("sertest.dat")));			
			rect = (Rectangle) is.readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw new IOException("Deserialization error", e);
		}
		finally {
			if (is != null) {
				is.close();
			}
		}
		return rect;
	}	

	public static void main(String[] args) throws IOException {
		Rectangle rect = new Rectangle(new Point(0,1), 10, 11);
		serializeRectangle(rect);
		System.out.println(rect);
		
		Rectangle rect2 = deserializeRectangle();
		System.out.println(rect2);
		
	}

}

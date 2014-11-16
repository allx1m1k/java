package com.lux.classes.class10;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class IOBasicsDemo {

	
	public static void main(String[] args) throws MalformedURLException, IOException {
		//пример чтения из файла
        //InputStream is = new FileInputStream("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\test.txt");


        InputStream is = new FileInputStream("D:\\eclipse\\newworkspace\\java\\trunk\\Hello\\bin\\com\\lux\\classes\\testcp.txt");
		//InputStream is = new ByteArrayInputStream(new byte[] {104, 101, 108, 108, 111});
        //ПОЧЕМУ НЕ РАБОТАЕТ ОТКРЫТИЕ ПОТОКА???
		//URL urlIs = new URL("http://oracle.com");
        //InputStream is = urlIs.openStream();
		
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

package com.lux.classes;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dima on 6/23/2014.
 */
public class Class10 {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\PUB\\GoogleDrive\\JAVA\\test.txt");

        int val =  is.read();
        while (val != -1) {
            System.out.print((char) val);
            val = is.read();
        }

    }

}

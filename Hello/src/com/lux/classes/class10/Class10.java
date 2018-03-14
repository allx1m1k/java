package com.lux.classes.class10;

//https://examples.javacodegeeks.com/java-basics/exceptions/java-io-filenotfoundexception-how-to-solve-file-not-found-exception/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dima on 6/23/2014.
 */
public class Class10 {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("./test.txt");

        int val =  is.read();
        while (val != -1) {
            System.out.print((char) val);
            val = is.read();
        }

    }

}

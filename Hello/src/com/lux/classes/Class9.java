package com.lux.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dima on 27.06.2014.
 */
public class Class9 {
    private InputStream is;

    /**
     * Пример throws
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\PUB\\GoogleDrive\\JAVA\\test.txt");
    }



}

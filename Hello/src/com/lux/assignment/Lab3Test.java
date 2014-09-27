package com.lux.assignment;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3Test {

    public static void main(String[] args) throws Exception {
        String[][] names = readNames();
        sort2(names);
        searchName(names);
        writeNames(names[1]);
    }

    private static String[][] readNames() throws IOException {
        BufferedReader in = null;
        String[][] names = new String[2][1000];
        try  {
            in = new BufferedReader(new FileReader("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt"));
            for (int i = 0; i < 4; i++) {
                String[] line = in.readLine().split(" ");
                names[0][i] = line[0];
                names[1][i] = line[1];
            }
        }
        finally {
            close(in);
        }
        return names;
    }

    private static void writeNames(String[] name) throws IOException {
        BufferedOutputStream out = null;
        try {
            out = new BufferedOutputStream(new FileOutputStream("test.dat"));
            for (String value: name){
                out.write(Integer.parseInt(value));
            }
            out.flush();
        } finally {
            close(out);
        }
    }

    private static void searchName(String[][] names) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя:");
        boolean isContinue;
        do {
            String name = input.next();
            isContinue = !name.equals("-1");
            if (isContinue) {
                int position = Arrays.binarySearch(names[0], name);
                if (position >=0) {
                    System.out.println("Имя " + name + " было зарегистрировано " + names[1][position] + "раз");
                }
                else {
                    System.out.println("Имя не найдено.");
                }
            }
        } while (isContinue);
    }

    private static void close(Closeable resource) {
        try {
            resource.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sort2(String[][] array) {
        for (int j = array[0].length-1; j >= 0 ; j--) {
            for (int i = 0; i < j; i++) {
                if (array[0][i].compareTo(array[0][i+1])>0) {
                    swap(array[0], i, i+1);
                    swap(array[1], i, i+1);
                }
            }
        }
    }

    private static void swap(String[] array, int pos1, int pos2) {
        String tmp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = tmp;
    }

}
package com.lux.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by dima on 7/8/2014.
 * How to split string http://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
 */
public class BoyNamesDemo {

    public static void main(String[] args)  {
        String[] names = new String[4];
        String line = null; //строка из файла
        int i = 0;
        int j = 0;

        //try - this block
        try (
                BufferedReader br = new BufferedReader(new FileReader("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt"));

        ) {
            //String line;
            //считываем построчно пока не достигли последней строки
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                //names[i] = line.split("[ \t]");
                names = line.split(" ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        System.out.println(names[1]);


        /*Scanner in = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("hello_utf8.txt"), "UTF-8")));
        in.useDelimiter("[\\.\\s\\!]+");
        while (in.hasNext()) {
            System.out.println(in.next());
        }
    */
    }

}

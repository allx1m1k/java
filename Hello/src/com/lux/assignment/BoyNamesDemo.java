package com.lux.assignment;


import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dima on 7/9/2014.
 * How to split string http://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
 */
public class BoyNamesDemo {

    /**
     * метод ввода имени с клавиатуры
     * @return
     * @throws BoyNameNotFoundException
     */
    public static BoyName inputBoyName () throws BoyNameNotFoundException {
        //создадим объект потока ввода
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter a number from 1 to 3:");
        System.out.println("Input boy name:");
        //int number = s.nextInt();
        //считаем строку
        String aName = s.nextLine();
        //имя не было введено
        if (aName.equals("")) {
            throw new BoyNameNotFoundException("SOS!");
        }
        //создадим экземпляр BoyName с именем введенным с клавиатуры
        BoyName newBoy = new BoyName(aName, "0");
        return newBoy;

    }
    public static void main(String[] args) throws BoyNameNotFoundException {
        Object[]names = new Object[5];
        String line = null; //строка из файла


        BoyNameList aBoys;
        aBoys = new BoyNameList(5);
        aBoys.readNamesFromFile("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");

        System.out.println(aBoys.toPrint());

        BoyName newBoyName = BoyNamesDemo.inputBoyName();
        System.out.println("");
        System.out.println("New boy name has been entered by user is: " + newBoyName.getBoyName());



/*
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

*/
        /*Scanner in = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("hello_utf8.txt"), "UTF-8")));
        in.useDelimiter("[\\.\\s\\!]+");
        while (in.hasNext()) {
            System.out.println(in.next());
        }
    */
    }

}

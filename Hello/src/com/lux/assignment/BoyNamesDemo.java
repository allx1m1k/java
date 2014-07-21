package com.lux.assignment;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dima on 7/9/2014.
 * How to split string http://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
 */
public class BoyNamesDemo {

    /**
     * метод ввода имени с клавиатуры
     * @return экземпляр BoyName
     * @throws BoyNameNotFoundException
     */
    public static String inputBoyName () throws BoyNameNotFoundException {
        //создадим объект потока ввода
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter a number from 1 to 3:");
        System.out.println("Input boy name:");
        //int number = s.nextInt();
        //считаем строку
        String aName = s.nextLine();
        //имя не было введено
        if (aName.equals("")) {
            throw new BoyNameNotFoundException("User has interrupted process!");
        }
        //создадим экземпляр BoyName с именем введенным с клавиатуры
        return aName;

    }
    public static void main(String[] args) throws BoyNameNotFoundException {
        Object[]names = new Object[8];
        String line = null; //строка из файла
        BoyNameList aBoys; //список имен
        aBoys = new BoyNameList(8);
        //aBoys.readNamesFromFile("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");
        aBoys.readNamesFromFileTo2DArray("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");
        //выведем список aBoys
        System.out.println(aBoys.toPrintFrom2DArray());
        //сортировка по имени
        aBoys.sortByNames();
        System.out.println("Sorting...");
        System.out.println(aBoys.toPrintFrom2DArray());
        //запросим ввод имени
        String newBoyName = BoyNamesDemo.inputBoyName();
        //ВЫПОЛНЯЕМ ВВОД ИМЕНИ ПОКА НЕ ВВЕДУТ "!"
        while (!newBoyName.equals("!")) {
            //создадим экземпляр BoyName из введенной строки
            BoyName newBoy = new BoyName(newBoyName, "0");
            System.out.println("");
            System.out.println("New boy name has been entered by user is: " + newBoy.getBoyName());
            System.out.println("");
            //выполним поиск в списке aBoys введенного имени из экземпляра newBoy
            //System.out.println(aBoys.searchBoyName(newBoy.getBoyName()));

            //выполним поиск используя статический метод Arrays.binarySearch(Object[] a, Object key)
            //работает корректно за счет того что метод getNewNames() возвращает коллекцию String которую приводим к массиву методом toArray()
            System.out.println("Size: " + aBoys.getNewNames().size());
            System.out.println("Index of name " + newBoy.getBoyName() +" entered by user in 2D Array is: " + Arrays.binarySearch(aBoys.getNewNames().toArray(), newBoy.getBoyName()));
            //если имя найдено, то выведем кол-во регистраций - частотность
            if (Arrays.binarySearch(aBoys.getNewNames().toArray(), newBoy.getBoyName()) >= 0) {
                System.out.println("Freq of Name " + newBoy.getBoyName() + " is " + aBoys.getFreqFrom2DArrayAtIndex(Arrays.binarySearch(aBoys.getNewNames().toArray(), newBoy.getBoyName())));
            }
            //снова выведем в консоль отсортированный список имен
            System.out.println(aBoys.toPrintFrom2DArray());
            //после поиска введенного имени снова запросим ввод имени
            newBoyName = BoyNamesDemo.inputBoyName();
        }
    }
}

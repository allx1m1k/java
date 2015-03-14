package com.lux.classes.class12;

/**
 * Created by dima on 23.07.2014.
 */
public class Util {

    /**
     * Параметризированный метод, демонстрирующий работу generics (дженериков): тип аргумента метода передаем методу в кач-ве параметра
     * Цель: создать один метод, который бы выводил в консоль массив формальных аргументов вне зависимости от их типа, т.е. тип формального аргумента передаем методу
     * @param inputArray массив типа T в качестве формального параметра метода
     * @param <T> тип массива формального аргумента передаем в качестве параметра самому методу
     */
    public static <T> void printArray(T [] inputArray) {
        //для каждого элемента element типа T находящихся в формальном параметре метода inputArray выводить значение в консоль
        for (T element: inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        System.out.println("Demo of printing Integers");
        Util.<Integer>printArray(new Integer[] {1,2,3,4,5});

        System.out.println("");
        System.out.println("Demo of printing Strings");
        Util.<String>printArray(new String[] {"1","2","3","4","5"});

        System.out.println("");
        System.out.println("Demo of printing Characters");
        Util.<Character>printArray(new Character[] {'1','2','3','4','5'});
    }
}

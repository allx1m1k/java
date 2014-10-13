package com.lux.assignment.class8;
import com.lux.assignment.class5.Date1;

/**
 * Created by dima on 19.06.2014.
 * http://echuprina.blogspot.com/2012/02/comparable-comparator.html - Сортировка и упорядочивание: Comparable
 */
public class MyQuickSortObjects {

    public static Date1[] objectsQuickSort(Date1[] massiv, int start, int end) {
        if (start >= end) return massiv; //прекратим выполнение если индекс с левой стороны больше либо равен индексу с правой стороны
        int i = start;
        int j = end;

        int middle = (i + j)/2;

        while (i < j) {
            while ((i < middle) && (massiv[i].compareTo(massiv[middle]) < 0 )) i++; //перемещаем бегунок с левого края до середины проверяя значения элементов и индекс бегунка
            while ((j > middle) && (massiv[j].compareTo(massiv[middle]) > 0 )) j--; //перемещаем бегунок с правого края до середины проверяя значения элементов и индекс бегунка

        if (i < j) {
            Date1 temp = massiv[i];
            massiv[i] = massiv[j];
            massiv[j] = temp;
            if (i == middle) middle = j;
            else if (j == middle) middle = i;

        }
    }

    objectsQuickSort(massiv, start, middle);
    objectsQuickSort(massiv, middle + 1, end);

    return massiv;

    }

    public static void main(String[] args) {
        //создадим массив с объектами типа Date1
        Date1[] myDates = new Date1[]{
        		new Date1(2, 10, 1991),
        		new Date1(17, 12, 1957),
        		new Date1(7, 8, 1976),
                new Date1(31, 12, 2013),
                new Date1(4, 9, 2010),
                new Date1(29, 1, 1980),
                new Date1(12, 6, 1999),
                new Date1(1, 6, 2014)
        };

        int lowIndex = 0; //индекс первого элемента
        int highIndex = myDates.length - 1; //индекс последнего эл-та        

        /**
        System.out.println("Unsorted array is " + Arrays.toString(myDates));
        System.out.print("Date1: ");
        myDates[0].printDate();
        */

        System.out.println("Unsorted array below: ");
        for (Date1 dates: myDates) {
            dates.printDate();
        };
        
        MyQuickSortObjects.objectsQuickSort(myDates, lowIndex, highIndex);

        System.out.println("Sorted within Day array below: ");
        for (Date1 dates: myDates) {
            dates.printDate();
        };
        //System.out.println("Sorted array is " + Arrays.toString(quickSort(values, lowIndex, highIndex)));
    }

}

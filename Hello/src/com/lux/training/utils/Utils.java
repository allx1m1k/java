package com.lux.training.utils;

import com.lux.training.lab2.employees.Person;

/**
 * Created by dima on 10.06.2014.
 */
public class Utils {

    public static Person[] sort (Person[] employees, int start, int end) {
        if (start >= end) return employees; //прекратим выполнение если индекс с левой стороны больше либо равен индексу с правой стороны
        int i = start;
        int j = end;

        int middle = (i + j)/2;

        while (i < j) {
            while ((i < middle) && (employees[i].getSurName().charAt(0) <= employees[middle].getSurName().charAt(0))) i++; //перемещаем бегунок с левого края до середины проверяя значения элементов и индекс бегунка
            while ((j > middle) && (employees[j].getSurName().charAt(0) >= employees[middle].getSurName().charAt(0))) j--; //перемещаем бегунок с правого края до середины проверяя значения элементов и индекс бегунка

            if (i < j) {
                Person tempEmpolyee = employees[i];
                employees[i] = employees[j];
                employees[j] = tempEmpolyee;
                if (i == middle) middle = j;
                else if (j == middle) middle = i;

            }
        }

        sort(employees, start, middle);
        sort(employees, middle + 1, end);

        return employees;
    }
}

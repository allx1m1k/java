package com.lux.assignment;

import java.util.LinkedList;

/**
 * Created by dima on 7/26/2014.
 */
public class SortedArrayListDemo {

    public static void main(String[] args) {
        /*
         List<Student> students = new ArrayList<>(); //хорошее правило считается что объявлять надо на высшем уровне иерархии - работа с
        //абстракцией чтобы можно было потом менять реализации
        students.add(new Student(1, "Ivan", "Ivanov", new BigDecimal(100)));
        students.add(new Student(2, "Petr", "Petrov", new BigDecimal(30)));
        students.add(new Student(2, "Sidr", "Sidorov", new BigDecimal(30)));

        for (Student s: students) {
            System.out.println(s);
        }
         */

        SortedArrayList<LinkedList> aList = new SortedArrayList<LinkedList>();
        aList.add(new LinkedList());

        SortedArrayList<LinkedList> anotherList = new SortedArrayList<LinkedList>();
        anotherList.add(new LinkedList());

        //создадим коллекцию-контрейнер объектов типа SortedArrayList
        //List<SortedArrayList> newList = new ArrayList<>();
        //newList.add("A");

    }
}

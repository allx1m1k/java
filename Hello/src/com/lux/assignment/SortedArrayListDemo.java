package com.lux.assignment;

import java.util.List;

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

        SortedArrayList<Number> aList = new SortedArrayList<Number>();
        aList.add(new Integer(1));
        aList.add(new Integer(2));
        aList.add(new Integer(3));
        aList.add(new Double(4));

        //aList.add(new LinkedList());


        //создадим коллекцию-контрейнер объектов типа SortedArrayList
        //List<SortedArrayList> newList = new ArrayList<>();
        //newList.add("A");

    }
}

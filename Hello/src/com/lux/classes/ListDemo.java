package com.lux.classes;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by dima on 7/21/2014.
 */
public class ListDemo {

    StudentsGroup group = new StudentsGroup("АТ-921");

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(); //хорошее правило считается что объявлять надо на высшем уровне иерархии - работа с
        //абстракцией чтобы можно было потом менять реализации
        students.add(new Student(1, "Ivan", "Ivanov", new BigDecimal(100)));
        students.add(new Student(2, "Petr", "Petrov", new BigDecimal(30)));
        students.add(new Student(2, "Sidr", "Sidorov", new BigDecimal(30)));

        for (Student s: students) {
            System.out.println(s);
        }

        /* в цикле for-each нельзя менть Коллекцию - надо использовать Iterator
           for (Student s: students) {
            students.remove(s);
        }
         */
        System.out.println("");
        Iterator<Student> iterator = students.iterator(); //похож на курсор в БД, этот курсор однонапрвленный
        while (iterator.hasNext()){ //выполняем пока есть следующий элемент
            Student s = iterator.next(); //с помощью этого метода вытаскиваем следующий эл-т К
            System.out.println(s);
            iterator.remove();
            //Student s = iterator.next();
            //System.out.println(s);
        }

        System.out.println(students.size());

        //ListIterator<Student> iterator = students.iterator(); //похож на двунаправленный курсор в БД есть previous
        //students.previous()

        //получение коллекции из массива, метод asList возвращает немодифицируемую коллекцию
        //Делаем из массива коллекцию
        List<Student> sss = new ArrayList<>(Arrays.asList(
                new Student (1, "aaaa", "bbbb", new BigDecimal(100))
        ));

        for (Student s: sss) {
            System.out.println(s);
        }

        // демонстрация работы интерфейса Iterable
        //после этого можно использовать цикл for-each
        StudentsGroup group = new StudentsGroup("АА-999");
        for (Student s: group) {
            System.out.println(s);
        }
    }

    /* демонстрация работы интерфейса Iterable
    StudentsGroup group = new StudentsGroup("АА-999");
    for (Student s: group) {
        System.out.println(s);
    }
    */

    //анонимный Класс
    LinkedHashMap<Integer, String> lru = new LinkedHashMap<Integer, String>(16, 0.75f, true) {

        //фармашлепский проект - пишем код не задумываясь

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
            return size() > 100;
        }
    };

}

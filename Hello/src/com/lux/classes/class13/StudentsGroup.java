package com.lux.classes.class13;

import com.lux.classes.class13.Student;

import java.util.Iterator;
import java.util.List;

/**
 * Цикл for-each состоит на самом деле в синтаксическом сахаре, т.е. эта конструкция
 * имплементирует интерфейс Iterable
 * Java может итерироваться по всему что реализует интерфейс Iterable - у него только один метод iterator()
 * Т.е. мы делигировали исполнение этого метода типу String см.  private String groupName;
 * Created by dima on 7/21/2014.
 */
public class StudentsGroup implements Iterable<Student> {

    private List<Student> students;
    private String groupName;

    public StudentsGroup(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator(); //делегирование выполнение метода классу List
    }

    public void add(Student s) {
        students.add(s);
    }
}

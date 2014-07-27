package com.lux.assignment;

import java.util.AbstractList;

/** Реализуем класс на основе праметризированного типа данных, который наследует AbstractList
 * Created by dima on 7/26/2014.
 */
public class SortedArrayList<T extends AbstractList >  {
    //в данной переменной храним структуру данных типа T
    private T sortedList;

    /**
     * Default Constructor
     */
    public SortedArrayList() {

    }
    /**
     * Constructor
     * @param anList в качестве аршумента конструктора передаеи тип T - путукшс, т.е. тип как пераметр
     */
    public SortedArrayList(T anList) {
        this.sortedList = anList;
    }

    public T getSortedList() {
        return sortedList;
    }

    public void setSortedList(T sortedList) {
        this.sortedList = sortedList;
    }

    public boolean add(T anObject){
        this.sortedList.add(anObject);
        return true;
    }
    /*
    public boolean add(E e) {
        add(this.size(), e);
        return true;
    }
    */
}

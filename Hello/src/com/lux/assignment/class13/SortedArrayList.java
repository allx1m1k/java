package com.lux.assignment.class13;

import java.util.AbstractList;

/** Реализуем класс на основе праметризированного типа данных, который наследует AbstractList
 * Created by dima on 7/26/2014.
 */
public class SortedArrayList<T extends Number > extends AbstractList {
    //в данной переменной храним структуру данных типа T
    private Number[] sortedList; //массив для хранения данных
    private int length; //размер структуры данных
    private int index; //текущий индекс ячейки

    /**
     * Default Constructor
     */
    public SortedArrayList() {
        //размер по умолчанию
        this.length = 10;
        this.sortedList = new Number[10];
        this.index = 0;
    }
    /**
     * Constructor
     * @param anList в качестве аршумента конструктора передаеи тип T - путукшс, т.е. тип как пераметр
     */
    public SortedArrayList(T[] anList) {
        this.sortedList = anList;
        this.length = 0;
    }

    public Number[] getSortedList() {
        return sortedList;
    }

    public void setSortedList(T[] sortedList) {
        this.sortedList = sortedList;
    }

    public int getLength() {
        return this.sortedList.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Метод добавления элемента с типом T
     * @param e
     * @return
     */
    public int add(T e) {
        sortedList[index] = e;
        index++;
        return index;
    }

    /*
    public boolean add(E e) {
        add(this.size(), e);
        return true;
    }
    */
    @Override
    public int size() {
        return length;
    }

    @Override
    public Object get(int index) {
        return null;
    }


}

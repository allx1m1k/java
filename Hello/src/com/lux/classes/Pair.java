package com.lux.classes;

/**
 * Created by dima on 23.07.2014.
 */
public class Pair<K extends Number, V extends String>{
        private K key;
        private V value;

        //конструктор
        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }

    public static void main(String[] args) {
        //Pair<Number, String> aPair = new Pair<>(1.00, "Abc"); ограничение - тут получаем raw type т.к. при создании new Pair<> мы не указали типы в <>
        Pair<Number, String> aPair = new Pair<Number, String>(1, "Abc"); //работает т.к. Integer - 1 является наследником от Number
        Pair<Number, String> anotherPair = new Pair<Number, String>(10.0, "The A"); //также работает т.к. Double - 10.0 является наследником от Number

    }

}

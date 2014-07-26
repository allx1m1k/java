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
        //Pair<Number, String> aPair = new Pair<>(1.00, "Abc"); тут получаем raw type т.к. при создании new Pair<> мы не указали типы в <>
        Pair<Integer, String> aPair = new Pair<Integer, String>(1, "Abc"); //работает т.к. Integer является наследником от Number
        Pair<Double, String> anotherPair = new Pair<>(10.0, "The A");

    }

}

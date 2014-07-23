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
        //Pair<Number, String> aPair = new Pair<>(1.00, "Abc");
        Pair<Integer, String> aaPair = new Pair<>(1, "Abc");

    }

}

package com.lux.classes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dima on 7/24/2014.
 */
public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "mmm");
        map.put(1, "mmm");

        for(Integer key: map.keySet()){ //этот вариант плохой лучше использова ть map.entrySet() - возвращает коллекцию ячеек
            System.out.println(map.get(key));
        }

        //в первый раз мы на каждом шаге по ключу искали
        //


        for(Map.Entry<Integer, String> entry:  map.entrySet()){  //map.entrySet() - так правильно итерироваться по Map
            System.out.println(entry.getValue());
        }
        //тут получаем коллекцию ячеек и не надо по ключу получать значения


    }
}

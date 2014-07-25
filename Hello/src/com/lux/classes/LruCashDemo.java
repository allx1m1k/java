package com.lux.classes;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by dima on 7/24/2014.
 */
public class LruCashDemo extends LinkedHashMap<Integer, String> { //надо указаыть значения этих параметров т.к. этот класс указан как п

        public LruCashDemo(){
            super(16, 0.75f, true);
        }

            //true - храним элементы этой коллекции в порядке доступа

            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 100;
            }
    }


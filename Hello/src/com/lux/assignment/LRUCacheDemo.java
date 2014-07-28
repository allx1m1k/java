package com.lux.assignment;

/**
 * Created by dima on 7/28/2014.
 */
public class LRUCacheDemo {

    public static void main(String[] args) {
        // Cache aCache = new LRUCacheImpl<>(5);  тут будет raw type
        Cache<Integer, String> aCache = new LRUCacheImpl<>(5); //можем не дублировать передачу параметров типа
        aCache.put(1, "dddd");
        aCache.get(1);
        aCache.put(2, "dssssddd");
        aCache.put(3, "ddfdgfssssddd");

        System.out.println(aCache.get(1));
        System.out.println(aCache.get(2));
        System.out.println(aCache.get(3));
    }
}

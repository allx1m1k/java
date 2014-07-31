package com.lux.assignment;

/**
 * Created by dima on 7/28/2014.
 */
public class LRUCacheDemo {

    public static void main(String[] args) {
        // Cache aCache = new LRUCacheImpl<>(5);  тут будет raw type
        Cache<Integer, String> aCache = new LRUCacheImpl<>(5); //можем не дублировать передачу параметров типа
        aCache.put(1, "mmm1");
        aCache.put(2, "mmm2");
        aCache.put(3, "mmm3");
        aCache.get(1);
        aCache.get(3);
        aCache.get(1);
        aCache.put(4, "mmm4");
        aCache.put(5, "mmm5");
        aCache.put(6, "mmm6");
        aCache.put(7, "mmm7");

        System.out.println(aCache.get(1));
        System.out.println(aCache.get(2));
        System.out.println(aCache.get(3));
    }
}

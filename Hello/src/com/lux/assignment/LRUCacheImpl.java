package com.lux.assignment;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Created by dima on 7/28/2014.
 */
public class LRUCacheImpl<K,V> implements Cache<K,V> {
    private int capacity; //объем кеша
    private MyLinkedHashMap<K,V> cache; //структура даненых для хра-ия кеша LinkedHashMap дает нам

    public LRUCacheImpl(int capacity){
        this.capacity = capacity;
        cache = new MyLinkedHashMap<>();
    }

    //внутренний класс используем отнаследовавшись от LinkedHashMap - т.к. она умеет хранить э-ты в упорядоченном виде
    private class MyLinkedHashMap<K,V> extends LinkedHashMap<K,V> {

        private static final float LOAD_F=0.75f;  //отношение размеров кол-ва бакетов к количеству занятых бакетов - степень сжатия 0,75-фактор п.у.

        private MyLinkedHashMap() {
            super(10, LOAD_F, true); //параметр true будем хранить э-ты в порядке доступа , чем чаще делался get э-та тем выше он будет
        }

        /**
         * Этот метод аозращает true если мы хотим удалить самый старый э-т коллекции
         * В нашем случае в кач-ве условия - мы достигли размерности
         * Если этот метод не переопределим то кеш будет расти бесконечно
         * @param eldest
         * @return
         */
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return this.size() > capacity;
        }
    }

    @Override
    public void put(K k, V v) {
        cache.put(k, v);

    }

    @Override
    public V get(K k) {
        return cache.get(k);
    }

    @Override
    public void clear() {
        cache.clear();
    }
}

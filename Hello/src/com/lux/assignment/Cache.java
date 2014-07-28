package com.lux.assignment;

/**
 * Параметризируемый интерфейс
 * добавляем э-ыты ключ - значение
 * Created by dima on 7/28/2014.
 */
public interface Cache<K,V> {

    void put(K k, V v);

    V get(K k);

    void clear();
}

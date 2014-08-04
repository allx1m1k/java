package com.lux.classes;

/**
 * Создание кастомной аннотции Log
 * один параметр file
 * Created by dima on 8/4/2014.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//2 МЕТА АННОТАЦИИ
@Target(value = ElementType.METHOD) // К ЧЕМУ МОЖЕТ БЫТЬ ПРИВЯЗАНА НАША МЕТА АННОТАЦИЯ
@Retention(value = RetentionPolicy.RUNTIME) // 3 ТИПА
//SOURCE - аннтоция доступная только компилятору и не доступна во время runtime
//CLASS - аннотация попадет в байт-код но не будет доступна в runtime средствами reflection чтобы различные tools что-то деллали сбайт-кодом
//см. AspectJ - реализация сквозной функциональности - одноипная функ-ть кот, нельзя выделить в отдельный класс
//RUNTIME- эта аннтоция доступна в runtime, можем с помощью reflection использовать
public @interface Log {
    String file() default "test.log"; //если не передан путь к файлу в качестве параметра, используем default
}

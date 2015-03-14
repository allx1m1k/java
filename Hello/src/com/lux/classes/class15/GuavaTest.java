package com.lux.classes.class15;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/** Мы хотим отфильтровать коллекцию
 * В стандартном Java API метода который бы фильтровала коолл-ию - нет
 * в Guava есть такой метод - filter
 * Predicate - объект которое задает условие фильтрации
 * Created by dima on 7/28/2014.
 */
public class GuavaTest {
    private String test = "External class";

    public static void main(String[] args) {
        List<String> list = Arrays.asList("test1", "mmm", "mmm2");

        System.out.println(Arrays.toString(list.toArray()));
        /**
         * Ниже пример анонимного внутреннего классса
         * в java нельза передать функцию как параметр
         * через паттерн func object мы передаем объект анаонимного класса,
         * синтатксис
         * с помощью new создаем объект анонимного класса, а за ним тело класса
         *
         * тут сразу определяем класс и создаем объект filteredList в результате вызова статического метода Collection2.filter (Guava бибилиотека) с 2 параметрами
         * объект к которому применить фильтр, объект класса фильтра который реализует интерфейс Predicate
         * Мы использовали тут анонимный внутренний класс
         * Collection<String> filteredList = Collections2.filter(list, new Predicate<String>()
         * тут мы создаем объект ананомниного класса, которые либо наследуется от Predicate / либо имплементит Predicate если это Interface
         */
        Collection<String> filteredList = Collections2.filter(list, new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                //обращение к атрибуту экземпляра внешнего класса - в данному случае не будет работать
                // т.к. из статического метода main нельзя обращаться к:
                // не статическим атрибутам класса
                //
                //System.out.println(GuavaTest.this.test);
                //
                //Ниже пример работы фильтра: в результате в отфильтрованной коллекции
                //остануться элементы длиной более 3 символов
                //чтобы избежать NPE exception всегда проверяем ссыллку на null
                return input != null && input.length()>3;
            }
        });

        System.out.println();
        System.out.println(Arrays.toString(filteredList.toArray()));

        /**
         * Статический внутренний класс может быть объявлен так, он еще называется вложенным
         * private static class MyPredicate implements Predicate<String> {
         */


    }

    /**
     * Внутренний класс enum
     * Ни что не мешает созадть тело класса, методы, т.к. enum - это класс - получим rich enum
     * Но это не применятся
     * В 99% работает так
     */
    enum Category { VIDEO, BOOK, TOY}


    private static void testCategory(Category category) {
        //enums можно сравнвать как примитивные типы
        if (category == Category.BOOK) {
            System.out.println();
        }
    }
}

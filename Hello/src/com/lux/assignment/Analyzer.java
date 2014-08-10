package com.lux.assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Класс-анализатор.
 * Выполняет функции по анализу источника и поиска в источнике слов-ключей и их частотностей
 * Как правильно использовать разделители delimeters в классе Scanner см.https://www.youtube.com/watch?v=3RSXHVyzdmg
 * Created by dima on 8/2/2014.
 */
public class Analyzer {

    Source source; //иcточник текста
    Map<String, Integer> data; //данные в виде слово-клю, частота слова в тексте

    //Конструкторы
    //инжектим объект источника в конструктор анализатора
    public Analyzer(Source source) {
        this.source = source;
        this.data = new LinkedHashMap<String, Integer>();
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Map<String, Integer> getData() {
        return data;
    }

    public void setData(LinkedHashMap<String, Integer> data) {
        this.data = data;
    }

    /**
     * Метод по разбору строки
     */
    public LinkedHashMap<String, Integer> parseSource() {
        //заполним в source массив байтов is контентом из файла
        source.getText();
        //преобразуем контент из массива байтов в Строку
        //String aString = new String(source.getIs());
        //создадим Поток из преобразованной Строки чтобы отбросить разделители
        Scanner stringScan = new Scanner(new String(source.getIs()));
        //бьет по предложениям
        //stringScan.useDelimiter("[^a-zA-Z]");
        //бьет по словам и словам с точкой
        //stringScan.useDelimiter(" ");
        stringScan = stringScan.useDelimiter("[^a-zA-Z]+");
        System.out.println("1");
        //цикл
        while (stringScan.hasNext()) {
            String word = stringScan.next();
            System.out.println(word);
        }
        return null;
    }
}

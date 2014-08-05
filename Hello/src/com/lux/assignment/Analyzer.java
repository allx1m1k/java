package com.lux.assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Класс-анализатор.
 * Выполняет функции по анализу источника и поиска в источнике слов-ключей и их частотностей
 * Created by dima on 8/2/2014.
 */
public class Analyzer {

    Source source; //иcточник текста
    Map<String, Integer> data; //данные в виде слово-клю, частота слова в тексте

    //Конструкторы
    //инжектим объект источника в конструктор анализатора
    public Analyzer(Source source) {
        this.source = source;
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

    public void setData(Map<String, Integer> data) {
        this.data = data;
    }

    /**
     * Метод по разбору строки
     */
    public Map<String, Integer> parseSource() {
        //заполним в source массив байтов is контентом из файла
        source.getText();
        //преобразуем контент из массива байтов в Строку
        String aString = new String(source.getIs());
        //создадим Поток из преобразованной Строки чтобы отбросить разделители
        Scanner stringScan = new Scanner(aString);
        System.out.println("1");
        //бьет по предложениям
        //stringScan.useDelimiter("[^a-zA-Z]");
        //бьет по словам и словам с точкой
        stringScan.useDelimiter(" ");
        //цикл
        while (stringScan.hasNext()) {
            String word = stringScan.next();
            System.out.println(word);
        }
        return null;
    }
}

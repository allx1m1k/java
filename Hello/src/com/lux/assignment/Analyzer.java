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
    LinkedHashMap<String, Integer> data; //данные в виде слово-клю, частота слова в тексте

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
        String word;
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
        //цикл 
        while (stringScan.hasNext()) {
            word = stringScan.next();
            System.out.println(word);
            //http://stackoverflow.com/questions/4363665/hashmap-implementation-to-count-the-occurences-of-each-character
            int count = data.containsKey(word) ? data.get(word) : 0;
            data.put(word, count +1);
        }
        return data;
    }
}

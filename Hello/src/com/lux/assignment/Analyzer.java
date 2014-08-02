package com.lux.assignment;

import java.util.Map;

/**
 * Класс-анализатор.
 * Выполняет функции по анализу источника и поиска в источнике слов-ключей и их частотностей
 * Created by dima on 8/2/2014.
 */
public class Analyzer {

    Source source; //иcточник текста
    Map<String, Integer> data; //данные в виде слово-клю, частота слова в тексте

    //Конструктор
    //инжектим объект источника в конструктор анализатора
    public Analyzer(Source source) {
        this.source = source;
    }
}

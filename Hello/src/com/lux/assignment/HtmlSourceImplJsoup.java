package com.lux.assignment;

import org.jsoup.Jsoup;
import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * Класс реализует абстракцию источника в виде источника-html документа
 * Created by dima on 13.08.2014.
 */
public class HtmlSourceImplJsoup implements Source {
    private String path; //входной url
    private byte[] is; //массив байтов текста из входного url

    /**
     * Конструктор
     *
     * @param pathToSource путь к файлу
     */
    public HtmlSourceImplJsoup(String pathToSource) {
        this.path = pathToSource;
    }

    @Override
    public void getText() {
        //объявление
        Document doc = null;
        Element aElement = null;
        String plainText = null;
        try {
            doc = Jsoup.connect(path).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //инициализация и заполнение массива
        /* при такой реализации попадают только html тэги
        is = doc.html().getBytes();
        is = doc.body().data().getBytes();
        */
        //создание екземпляра типа Element
        aElement = doc.body();
        //создание екземпляра типа HtmltoPlainText
        HtmlToPlainText aHtml = new HtmlToPlainText();
        //установим значение ссылки
        plainText = aHtml.getPlainText(aElement);
        //заполним массив байтов is
        //этот массив используется как хранилище
        is = plainText.getBytes();
    }
    @Override
    public byte[] getIs() {
        return this.is;
    }
}

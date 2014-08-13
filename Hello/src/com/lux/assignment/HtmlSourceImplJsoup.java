package com.lux.assignment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
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
        try {
            doc = Jsoup.connect(path).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //инициализация и заполнение массива
        is = doc.html().getBytes();
    }
    @Override
    public byte[] getIs() {
        return this.is;
    }
}

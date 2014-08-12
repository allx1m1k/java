package com.lux.assignment;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by dima on 12.08.2014.
 * http://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
 * http://www.helloworld.ru/texts/comp/lang/java/java5/vol12/ch4.html
 */
public class HtmlSourceImpl implements Source {
    private String path; //входной url
    private byte[] is; //массив байтов текста из входного url

    /**
     * Конструктор
     *
     * @param pathToSource путь к файлу
     */
    public HtmlSourceImpl(String pathToSource) {
        this.path = pathToSource;
    }


    @Override
    public void getText() {
/*
        try {
            InputStream in = new BufferedInputStream(new FileInputStream (path));
            try {
                //инициализируем массив байтов
                is = new byte[in.available()];
                //заполним массив байтов из потока InputStream сразу за один проход
                in.read(is);
                //закроем поток во избежание утечек памяти
                in.close();
*/
        //объявление переменной типа URL
        URL aUrl = null;
        try {
            //путь передан в конструкторе в качестве Строки, теперь сформируем из него объект URL
            aUrl = new URL(this.path);
            System.out.println("a URL obj created");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //объявление переменной типа URLConnection
        //BufferedReader in = null;
        try {
            //in = new InputStreamReader(aUrl.openStream();
            //откроем поток
            BufferedReader in = new BufferedReader(new InputStreamReader(aUrl.openStream()));
            //чтение из потока
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
            //инициализируем массив байтов
            //is = new byte[in.getContentLength()];
            //is = new byte[(byte) in.getContent()];
            //System.out.println(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public byte[] getIs() {
        return new byte[0];
    }
}

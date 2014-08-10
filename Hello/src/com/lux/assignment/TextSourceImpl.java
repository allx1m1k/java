package com.lux.assignment;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Класс-реализация интерфейса Source
 * Моделирует в качестве источника текстовый файл
 * http://www.javaportal.ru/java/articles/regexp.html
 * http://www.javaprobooks.ru/java-%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/java-%D1%80%D0%B5%D0%B3%D1%83%D0%BB%D1%8F%D1%80%D0%BD%D1%8B%D0%B5-%D0%B2%D1%8B%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F.html
 * http://pro-java.ru/java-dlya-nachinayushhix/regulyarnye-vyrazheniya-java/
 * Created by dima on 8/2/2014.
 */
public class TextSourceImpl implements Source {
    private String path; //входной файл
    private byte[] is; //массив байтов текста из входного файла

    /**
     * Конструктор
     *
     * @param pathToSource путь к файлу
     */
    public TextSourceImpl(String pathToSource) {
        this.path = pathToSource;
    }

    //инкапсулируем доступ к массиву байтов is
    @Override
    public byte[] getIs(){
        return this.is;
    }
    /**
     * Метод заполнит массив байтов is для экземпляра класса TextSourceImpl
     */
    @Override
    public void getText() {
        try {
            InputStream in = new BufferedInputStream(new FileInputStream (path));
            try {
                //инициализируем массив байтов
                is = new byte[in.available()];
                //заполним массив байтов из потока InputStream
                in.read(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        //System.out.println(Arrays.toString(is));
    }
}

/*
    @Override
    public void getText() {
        String line = null; //строка из файла
        String[] temp = new String[1000];
        int i = 0;
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));
        ) {
            while ((line = br.readLine()) != null) {
                //while ( i < 1000) {
                temp = line.split("[ \t]");
                //сохраняем имена temp[0] и частотности temp[1] в массиве BoyName
                //names[i] = new BoyName(temp[0],temp[1]);
                //сохраняем имена temp[0] в каждом элементе нулевой строки 2D массива - элемент имен
                System.out.printf("%s ", temp[0]);
                //сохраняем частотности temp[1] в каждом элементе первой строки 2D массива - элемент частотностей
                System.out.printf("%s ", temp[1] );
                System.out.println();
                //увеличиваем счетчик массива BoyName на 1 - двигаемся по ячейкам
                i++;
                //this.cnt ++;
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
*/


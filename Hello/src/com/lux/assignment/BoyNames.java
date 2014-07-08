package com.lux.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * В качестве 2d Array можно использовать Map http://stackoverflow.com/questions/10063354/two-dimensional-array-of-different-types
 * Created by dima on 7/8/2014.
 */
public class BoyNames {
    //чтобы хранить список имен
    private String names[];
    //счетчик кол-ва имен в списке
    private int cnt; //количество имен в списке

    //конструктор передаем кол-во имен в списке
    public BoyNames(int numCount) {
        names = new String[numCount];
        cnt = 0;
    }

    //метод добавления персоны
    public void addBoy(String aName){
        //numbers[cnt++] = instrument;
        names[cnt++] = aName;
    }

    public Object[] getNames() {
        return names;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void readNamesFromFile(String path){
        String line = null; //строка из файла
        int i = 0;

        //try - this block
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));

        ) {
            //String line;
            //считываем построчно пока не достигли последней строки
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                //names[i] = line.split("[ \t]");
                names = line.split(" ");
                i++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


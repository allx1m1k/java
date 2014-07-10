package com.lux.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * dima
 */
public class BoyNameList {
    //чтобы хранить список имен
    private BoyName names[]; //массив типа BoyName
    private Object newNames[][] = new String[5][5]; //двумерный массив как описано в задаче lab3.pdf
    //счетчик кол-ва имен в списке
    private int cnt; //количество имен в списке

    //конструктор передаем кол-во имен в списке
    public BoyNameList(int numCount) {
        names = new BoyName[numCount];
        cnt = 0;
    }

    //метод добавления имени
    public void addBoy(BoyName aBoyName){
        //numbers[cnt++] = instrument;
        names[cnt++] = aBoyName;
    }

    //метод получения массива ссылок на типы BoyNAme
    public BoyName[] getNames() {
        return names;
    }

    //метод получения кол-ва имен в экземпляре
    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    /**
     * метод генерации строки для печати
     * @return
     */
    public BoyName getNameAt(int i) {
        return names[i];
    }

    public String toPrint() {
        int i = 0;
        String result = "";
        while (i < names.length){
            result += "Boy name: " + names[i].getBoyName() + "   " + " Name frequency: " + names[i].getNameFreq() + "\r\n";
            i++;
        }
        return result;
        }

    /**
     * метод поиска имени String boyName в списке
     * возвращает int >= 0 если имя String boyName есть в списке
     * в противном случае - возвращает отрицательное значение
     * @param boyName
     * @return
     */
    public int searchBoyName(String boyName) {
        /*boolean result = false;
        if (Arrays.binarySearch((BoyName[])this.getNames(), (String)boyName) >= 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
        */
        //return Arrays.binarySearch(this.getNames(), boyName);
        return Arrays.binarySearch(this.getNames(), (String) boyName);
    }

    /**
     * метод чтения имен и частотностей из файла
      * @param path
     */
    public void readNamesFromFile(String path){
        String line = null; //строка из файла
        //String[][] temp = new String[5][5];
        Object[][] temp = new Object[5][5];
        int i = 0;

        //try - this block
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));

        ) {
            //String line;
            //считываем построчно пока не достигли последней строки
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                //names[i] = new BoyName(line, 0);
                temp[i] = line.split("[ \t]");
                names[i] = new BoyName((String) temp[i][0], (String) temp[i][1]);
                //System.out.println("Temp0 Name: " + temp[i][0] + "  " + " Temp0 Freq: " + temp[i][1]);
                //сохраним в массив имя
                newNames[i][0] = temp[i][0];
                //сохраним в массив частотность
                newNames[i][1] = temp[i][1];
                //names = line.split(" ");
                System.out.println("newName0 Name: " + newNames[i][0] + "  " + " NewName0 Freq: " + newNames[i][1]);
                i++;
                this.cnt ++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(temp));

    }



}

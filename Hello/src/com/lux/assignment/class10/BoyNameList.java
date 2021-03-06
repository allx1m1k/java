package com.lux.assignment.class10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * dima
 */
public class BoyNameList {
    //чтобы хранить список имен
    private BoyName names[]; //массив типа BoyName
    private String newNames[][] = new String[2][1000]; //двумерный массив как описано в задаче lab3.pdf
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
    /**
     * метод получения Коллекции имен длиной только до заполненных ячеек из 2D массива newNames длиной 1000
     * @return
     */
    public List<String> getNewNames() {
        int i = 0;
        List<String> newArray = new ArrayList<>();
        while (newNames[0][i] != null) {
            //добавляем в коллекцию имена пока не встретим строку null
            newArray.add(newNames[0][i]);
            i++;
        }
        return newArray;
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

    /**
     * вывод кол-ва регистраций имени по индексу
     * @param aIndex
     * @return кол-во регистраций (частотность) из 2D массива newNames[1][aIndex]
     */
    public String getFreqFrom2DArrayAtIndex (int aIndex) {
        return newNames[1][aIndex];
    }

    /**
     * Метод печати имен и частотностей из массива типов BoyName names
     * пробегает не по массиву String[][] newNames, а по массиву Boyname[] names
     * @return
     */
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
     * Метод печати имен и частотностей из 2D массива newNames
     * пробегает по массиву String[][] newNames
     * @return
     */
    public String toPrintFrom2DArray() {
        int i = 0;
        String result = "";
        while (newNames[0][i] != null) {
            result += "Boy name: " + newNames[0][i] + "   " + " Name frequency: " + newNames[1][i] + "\r\n";
            i++;
        }
        return result;
    }
    public void sortByNames(){
        String [][] result = new String [2][1000];
        String tempName = "";
        String tempFreq;
        //цикл по i-му элементу массива с которым будем сравнивать
        for (int index = 0 ; index <= this.newNames[0].length - 1; index++) {
            //цикл по i + 1 элементу массива который будем сравнивать с i-ым элементом
            for (int next = index + 1; next <= this.newNames[0].length - 1; next++) {
                //выполняем сортировку только если значение текущей ячейки и значение следующей ячейки не равно null
                if ((newNames[0][index] != null) & (newNames[0][next] != null)) {
                    //если i-ый элемент больше либо равен с i-ым + 1 (следующим) за ним, поменяем их местами
                    // (this.newNames[0][index].compareTo(this.newNames[0][next]) < 0) Fred , Elton, Dennis, Can, Allan в обратном порядке
                    // (this.newNames[0][index].compareTo(this.newNames[0][next]) > 0) Allan, Can, Dennis, Elton, Fred в прямом порядке
                    if (this.newNames[0][index].compareTo(this.newNames[0][next]) > 0) {
                        //if (this.newNames[0][index] >= this.newNames[0][next]) {
                        //сохраним имя и частотность во временные переменные
                        tempName = new String(this.newNames[0][next]);
                        tempFreq = new String(this.newNames[1][next]);
                        //
                        this.newNames[0][next] = this.newNames[0][index];
                        this.newNames[1][next] = this.newNames[1][index];
                        //
                        this.newNames[0][index] = tempName;
                        this.newNames[1][index] = tempFreq;
                    }
                }
            }
        }
        result = this.newNames.clone();
        this.newNames = result;
        }
    /**
     * НЕ РАБОТАЕТ КОРРЕКТНО - НАДО ЕЩЕ ДУМАТЬ
     * метод поиска имени String boyName в списке
     * возвращает int >= 0 если имя String boyName есть в списке
     * в противном случае - возвращает отрицательное значение
     * @param boyName
     * @return
     */
    public int searchBoyName(String boyName) {
        return Arrays.binarySearch(this.getNames(), (String) boyName);
    }

    /**
     * Метод чтения имен и частотностей из файла в 2D массив
     * @param path
     */
    public void readNamesFromFileTo2DArray(String path) {
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
                newNames[0][i] = temp[0];
                //сохраняем частотности temp[1] в каждом элементе первой строки 2D массива - элемент частотностей
                newNames[1][i] = temp[1];
                //увеличиваем счетчик массива BoyName на 1 - двигаемся по ячейкам
                i++;
                this.cnt ++;
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    /**
     * метод записи имен в новый файл
     * @param path
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void writeNamesFrom2DArrayToFile(String path) throws IOException {
        int i = 0;
        try (
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "utf-8"));
        )   {
            //String line;
            while (this.newNames[0][i] != null) {
                System.out.println(this.newNames[0][i]);
                //запишем строку в выходной поток
                System.out.println(this.newNames[0][i] + "  " + this.newNames[1][i]);
                System.out.println();
                bw.write(this.newNames[0][i] + " " + this.newNames[1][i] + "\r\n");

                i++;
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
    /**
     * метод чтения имен и частотностей из файла
      * @param path
     */
    public void readNamesFromFile(String path){
        String line = null; //строка из файла
        String[][] temp = new String[2][1000];
        int i = 0;
        //try - this block
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));
        ) {
            //String line;
            //считываем построчно пока не достигли последней строки
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                //names[i] = new BoyName(line, 0);
                temp[i] = line.split("[ \t]");
                //сохраняем имена и частотности в массиве BoyName
                names[i] = new BoyName((String) temp[i][0], (String) temp[i][1]);
                //System.out.println("Temp0 Name: " + temp[i][0] + "  " + " Temp0 Freq: " + temp[i][1]);
                //сохраним в массив имя
                newNames[i][0] = temp[i][0];
                //сохраним в массив частотность
                newNames[i][1] = temp[i][1];
                //names = line.split(" ");
                //System.out.println("newName0 Name: " + newNames[i][0] + "  " + " NewName0 Freq: " + newNames[i][1]);
                i++;
                this.cnt ++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(Arrays.toString(temp));
    }
}

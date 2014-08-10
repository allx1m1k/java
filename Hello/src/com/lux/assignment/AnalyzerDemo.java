package com.lux.assignment;

import java.util.HashMap;

/**
 * Created by dima on 04.08.2014.
 */
public class AnalyzerDemo {

    public static void main(String[] args) {
        String content; //контент из файла
        Source aText; //текст из txt
        Analyzer analyzer;
        //aBoys = new BoyNameList(8);
        //aText = new TextSourceImpl("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\text.txt");
        //aBoys.readNamesFromFile("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");
        //aBoys.readNamesFromFileTo2DArray("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");
        //aText.getText();

        //создадим экземпляр TextSourceImpl
        aText = new TextSourceImpl("D:\\eclipse\\text.txt");

        //создадим экз-р Analyzer с исчтонком
        analyzer = new Analyzer(aText);
        //analyzer = new Analyzer(new TextSourceImpl("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\text.txt"));

        //заполним массив
        //analyzer.getSource().getText();
        //парсинг
        analyzer.parseSource();
    }
}

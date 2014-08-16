package com.lux.assignment;

import java.util.HashMap;

/**
 * Created by dima on 04.08.2014.
 */
public class AnalyzerDemo {

    public static void main(String[] args) {
        String content; //контент из файла
        Source aText; //текст из txt
        Source aUrlText; //текст из URL
        Analyzer analyzer;
        Analyzer analyzerUrl;
        //aBoys = new BoyNameList(8);
        //aText = new TextSourceImpl("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\text.txt");
        //aBoys.readNamesFromFile("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");
        //aBoys.readNamesFromFileTo2DArray("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");
        //aText.getText();

        //создадим экземпляр TextSourceImpl
        //aText = new TextSourceImpl("D:\\eclipse\\text.txt");
        aText = new TextSourceImpl("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\text.txt");
        //aUrlText = new HtmlSourceImpl("https://home.luxoft.com/index.htm");
        aUrlText = new HtmlSourceImplJsoup("http://ua2012.org.ua");

        //создадим экз-р Analyzer с исчтонком
        analyzer = new Analyzer(aText);
        analyzerUrl = new Analyzer(aUrlText);
        //analyzer = new Analyzer(new TextSourceImpl("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\text.txt"));

        //заполним массив
        //analyzer.getSource().getText();
        //парсинг
        System.out.println("=== TEXT SOURCE ===");
        System.out.println(analyzer.parseSource().toString());
        System.out.println("=== HTML SOURCE ===");
        System.out.println(analyzerUrl.parseSource().toString());
    }
}

package com.lux.assignment;

import java.util.HashMap;

/**
 * Created by dima on 04.08.2014.
 */
public class AnalyzerDemo {

    public static void main(String[] args) {
        String line = null; //строка из файла
        TextSourceImpl aText; //текст из txt
        //aBoys = new BoyNameList(8);
        //aText = new TextSourceImpl("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\text.txt");
        //aBoys.readNamesFromFile("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");
        //aBoys.readNamesFromFileTo2DArray("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\boynames.txt");
        //aText.getText();

        Analyzer analyzer;
        analyzer = new Analyzer(new TextSourceImpl("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\text.txt"));
        analyzer.getSource().getText();
    }
}

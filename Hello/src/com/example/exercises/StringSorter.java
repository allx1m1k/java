package com.example.exercises;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: allx1m1k
 * Date: 25.04.12
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 */
public class StringSorter {

    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Invalid params length, expected 2 at least...");
            return;
        }
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(args[0]));
            writer = new BufferedWriter(new FileWriter(args[1]));
            String lines[] = new String[3];
            int index = 0;
            TreeSet<DistinctStringGetter.ParamContainer> set = new TreeSet<DistinctStringGetter.ParamContainer>(new ParamContainerComparator());
            while((lines[index] = reader.readLine()) != null){
                if(index == 2){
                    DistinctStringGetter.ParamContainer paramContainer = new DistinctStringGetter.ParamContainer(
                            lines[0],
                            lines[1],
                            lines[2]
                    );
                    if(!set.contains(paramContainer)){
                        set.add(paramContainer);
                    }
                    index = 0;
                } else {
                    index++;
                }
            }
            for(DistinctStringGetter.ParamContainer container : set){
                writer.write(container._firstParam + "\r\n");
                writer.write(container._secondParam + "\r\n");
                writer.write(container._thirdParam + "\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class ParamContainerComparator implements Comparator<DistinctStringGetter.ParamContainer> {

        @Override
        public int compare(DistinctStringGetter.ParamContainer o1, DistinctStringGetter.ParamContainer o2) {
            return o1._secondParam.substring(o1._secondParam.indexOf("=")).compareTo(
                    o2._secondParam.substring(o2._secondParam.indexOf("="))
            );
        }
    }
}

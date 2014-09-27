package com.lux.classes.class7;

import java.util.Arrays;

/**
 * Created by dima on 6/5/2014.
 */
public class OrchestraDemo {
    public static void main(String[] args) {
        MusciInstrument instrument1;
        MusciInstrument instrument2;

        //создадим эк-р орестра
        Orchestra orchestra = new Orchestra(6);

        orchestra.addInstrument(new Violine("n1","red"));
        orchestra.addInstrument(new Drum("n2","green"));
        orchestra.addInstrument(new Drum("n12","blue"));
        orchestra.addInstrument(new Violine("viola","red"));
        orchestra.addInstrument(new Singer("Ivan","dddd", false));
        orchestra.addInstrument(new Singer("Petr","Petrov", false));
        //orchestra.addInstrument(new Singer("Petr","Petrov", false));
        //orchestra.addInstrument(new Drum("n3","green"));
        //как MusicInstrum так и People умеют играть
        orchestra.play();

        //получим массив members из нашего Orchestra
        System.out.println(Arrays.toString(orchestra.getMembers()));

        instrument1 = (MusciInstrument) orchestra.getMembers()[0]; //явно приведем к типу музыкальный инструмент т.к. работаем с типом оркестр
        instrument2 = (MusciInstrument) orchestra.getMembers()[2];
        System.out.println("instrument1 color is " + instrument1.getColor());
        System.out.println("instrument2 color is " + instrument2.getColor());
        System.out.println("result of comparing colors is " + instrument1.compareTo(instrument2));
        //[com.lux.classes.class7.Violine@e5855a, com.lux.classes.class7.Drum@95fd19, com.lux.classes.class7.Drum@11b9fb1, com.lux.classes.class7.Violine@913fe2, com.lux.classes.class7.Singer@1f934ad, com.lux.classes.class7.Singer@1f14ceb]


    }

}

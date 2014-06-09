package com.lux.classes;

/**
 * Created by dima on 6/5/2014.
 */
public class OrchestraDemo {
    public static void main(String[] args) {
        //создадим эк-р орестра
        Orchestra orchestra = new Orchestra(4);
        
        orchestra.addInstrument(new Singer("Petr","Petrov", false));
        orchestra.addInstrument(new Violine("n1","red"));
        orchestra.addInstrument(new Drum("n2","green"));
        //orchestra.addInstrument(new Singer("Ivan","dddd", false));
        orchestra.addInstrument(new Drum("n24","gggg"));
        //orchestra.addInstrument(new Singer("Petr","Petrov", false));
        //orchestra.addInstrument(new Drum("n3","green"));
        //как MusicInstrum так и People умеют играть
        orchestra.play();
    }

}

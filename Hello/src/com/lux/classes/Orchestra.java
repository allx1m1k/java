package com.lux.classes;

/**
 * Created by dima on 6/5/2014.
 */
public class Orchestra {
    //чтобы хранить муз.инструменты сосздадим массив
    private Playable[] members;
    //счетчик кол-ва интсрументов в орекстре
    private int cnt;

    //конструктор
    public Orchestra(int numCount){
        members = new Playable[numCount];
        cnt = 0;
    }
    //метод для добавления инструметов в оркестра
    //public void addInstrument(MusciInstrument instrument){
    //    numbers[cnt++] = instrument;
    //}

    public void addInstrument(Playable instrument){

        //numbers[cnt++] = instrument;
        members[cnt++] = instrument;
     }
    //метод играть
    public void play(){
        for (Playable instrument: members) {
            instrument.play();
        }
    }
}

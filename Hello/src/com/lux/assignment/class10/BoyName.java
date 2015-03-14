package com.lux.assignment.class10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * В качестве 2d Array можно использовать Map http://stackoverflow.com/questions/10063354/two-dimensional-array-of-different-types
 * Created by dima on 7/8/2014.
 */
public class BoyName implements Comparable  {
    //чтобы хранить имя
    private String boyName;
    //частотность
    private String nameFreq;

    public BoyName(String boyName, String nameFreq) {
        this.boyName = boyName;
        this.nameFreq = nameFreq;
    }


    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public String getNameFreq() {
        return nameFreq;
    }

    public void setNameFreq(String nameFreq) {
        this.nameFreq = nameFreq;
    }

    public String toPrint(){
        String result = "";
        result = "Boy name: " + this.getBoyName() + "   " + " frequency per year: " + this.getNameFreq();
        return result;
    }

    @Override
    public int compareTo(Object o) {
        //return this.color.compareTo(((MusciInstrument) o1).getColor() );
        return  this.getBoyName().compareTo((String) o);
    }



    /*
    @Override
    public int compareTo(Object o) {
        /*
        if (this.getBoyName() == (String) o) {
            return 1;
        } else {
            return -1;
        }
        */

        /*if (this.getBoyName().equals((o))){
            return 1;
        } else return -1;

        }
        */





}


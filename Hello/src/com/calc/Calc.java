package com.calc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 06.04.2015.
 */
public class Calc {
    //list of operations
    private List<Oper> opers = null;
    //rezult of operations
    private Number rezult = 0;

    public List<Oper> getOpers() {
        return opers;
    }

    public void setOpers(List<Oper> opers) {
        this.opers = opers;
    }

    public Number getRezult() {
        return rezult;
    }

    public void setRezult(Number rezult) {
        this.rezult = rezult;
    }

    public Number go() {
        for (Oper item : opers){
            rezult =+ item.compute();
        }
        return getRezult();
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        //initialize list of operations
        c.setOpers(new ArrayList<Oper>());
        c.opers.add(new Addition(11331,1212));
        System.out.println("Quantity of Opers is " + c.getOpers().size());
        System.out.println(c.getOpers().toString());
        System.out.println("\n" + "Result of opers is " + c.go() );
    }
}

package com.calc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 06.04.2015.
 */
public class Calc {
    //list of operations
    private List<Oper> opers = null;

    public List<Oper> getOpers() {
        return opers;
    }

    public void setOpers(List<Oper> opers) {
        this.opers = opers;
    }

    public double go() {
        double totalRezult = 0.0;
        for (Oper item : opers){
            //setRezult(getVar1() + getVar2());
            item.setRezult(item.compute());
            //item.; =+ item.compute();
            totalRezult = totalRezult + item.getRezult();
        }
        return totalRezult;
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        //initialize list of operations
        c.setOpers(new ArrayList<Oper>());
        //c.opers.add(new Addition(1,100));
        //c.opers.add(new Addition(0,100));
        c.opers.add(new Substraction(101,100));
        System.out.println("Quantity of Opers is " + c.getOpers().size());
        System.out.println(c.getOpers().toString());
        System.out.println("\n" + "Result of opers is " + c.go());
        //c.go();
        //System.out.println(c.getOpers().toArray());

    }
}

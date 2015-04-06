package com.calc;

/**
 * Created by dima on 4/4/2015.
 */
public abstract class Oper {
    private int var1;
    private int var2;
    private Character operac;

    public Oper (int aFirstOperand, int aSecondOperand, Character aOperation) {
        this.var1 = aFirstOperand;
        this.var2 = aSecondOperand;
        this.operac = aOperation;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public abstract double compute();
}

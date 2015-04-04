package com.calc;

/**
 * Created by dima on 4/4/2015.
 */
public abstract class Oper implements Operation {
    private int var1;
    private int var2;

    public Oper (int operandFirst, int operandSecond) {
        this.var1 = operandFirst;
        this.var2 = operandSecond;
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

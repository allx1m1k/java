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

    protected Oper(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
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

    public Character getOperac() {
        return operac;
    }

    public void setOperac(Character operac) {
        this.operac = operac;
    }

    @Override
    public String toString() {
        //return super.toString();
        StringBuilder stringBuilder = new StringBuilder("\n" + "1st var = " + getVar1() +"\n" + "2nd var = " + getVar2() + "\n" + "operation is " + getOperac() + "\n");
        return String.valueOf(stringBuilder);
    }

    public abstract double compute();

}

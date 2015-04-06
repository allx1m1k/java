package com.calc;

/**
 * Created by dima on 4/4/2015.
 */
public class Addition extends Oper {

    public Addition(int aFirstOperand, int aSecondOperand, Character aOperation) {
        super(aFirstOperand, aSecondOperand, aOperation);
    }

    @Override
    public double compute() {
        return getVar1() + getVar2();
    }
}

package com.calc;

/**
 * Created by dima on 4/4/2015.
 */
public class Addition extends Oper {

    public Addition(int aFirstOperand, int aSecondOperand, Character aOperation) {
        super(aFirstOperand, aSecondOperand, aOperation);
    }

    public Addition(int aFirstOperand, int aSecondOperand) {
        super(aFirstOperand, aSecondOperand);
        super.setOperac('+');
    }

    @Override
    public double compute() {
        setRezult(getVar1() + getVar2());
        return getRezult();
    }
}

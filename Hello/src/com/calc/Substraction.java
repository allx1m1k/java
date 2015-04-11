package com.calc;

/**
 * Created by dima on 4/11/2015.
 */
public class Substraction extends Oper {

    public Substraction(int aFirstOperand, int aSecondOperand, Character aOperation) {
        super(aFirstOperand, aSecondOperand, aOperation);
    }

    public Substraction (int aFirstOperand, int aSecondOperand) {
        super(aFirstOperand, aSecondOperand);
        super.setOperac('+');
    }

    @Override
    public double compute() {
        setRezult(getVar1() - getVar2());
        return getRezult();
    }
}

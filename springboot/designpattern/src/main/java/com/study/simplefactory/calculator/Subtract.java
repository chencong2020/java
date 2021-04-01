package com.study.simplefactory.calculator;

/**
 * 减法运算
 *
 * @author chencong
 */
public class Subtract extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}

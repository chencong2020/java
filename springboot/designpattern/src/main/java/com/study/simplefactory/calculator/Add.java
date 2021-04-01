package com.study.simplefactory.calculator;

/**
 * 加法运算
 *
 * @author chencong
 */
public class Add extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
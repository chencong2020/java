package com.study.simplefactory.calculator;

/**
 * 乘法运算
 *
 * @author chencong
 */
public class Multiple extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
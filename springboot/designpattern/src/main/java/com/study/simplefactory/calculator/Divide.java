package com.study.simplefactory.calculator;

/**
 * 除法运算
 *
 * @author chencong
 */
public class Divide extends Operation {
    @Override
    public double getResult() throws Exception {
        if (getNumberB() == 0) {
            throw new Exception("除数不能为零");
        }
        return getNumberA() / getNumberB();
    }
}
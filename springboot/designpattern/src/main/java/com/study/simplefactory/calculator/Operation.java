package com.study.simplefactory.calculator;


/**
 * 运算基类
 *
 * @author chencong
 */
public class Operation {
    private double numberA = 0;
    private double numberB = 0;

    /**
     * Gets number a.
     *
     * @return the number a
     */
    public double getNumberA() {
        return numberA;
    }

    /**
     * Sets number a.
     *
     * @param numberA the number a
     */
    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    /**
     * Gets number b.
     *
     * @return the number b
     */
    public double getNumberB() {
        return numberB;
    }

    /**
     * Sets number b.
     *
     * @param numberB the number b
     */
    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * Gets result.
     *
     * @return the result
     * @throws Exception the exception
     */
    public double getResult() throws Exception {
        return 0;
    }
}

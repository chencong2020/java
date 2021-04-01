package com.study.simplefactory.calculator;

/**
 * 运算工厂
 *
 * @author chencong
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Subtract();
                break;
            case "*":
                operation = new Multiple();
                break;
            case "/":
                operation = new Divide();
                break;
            default:
                break;
        }
        return operation;
    }
}

package com.study.simplefactory;

/**
 * @ClassName：OperationFactory
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2019/12/31 11:36
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
        }
        return operation;
    }
}

package com.study.simplefactory;

/**
 * @ClassName：Subtract
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2019/12/31 11:33
 */
public class Subtract extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}

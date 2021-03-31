package com.study.simplefactory;

/**
 * @ClassName：Multiple
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2019/12/31 11:34
 */
public class Multiple extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
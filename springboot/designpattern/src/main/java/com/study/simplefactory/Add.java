package com.study.simplefactory;

/**
 * @ClassName：Add
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2019/12/31 11:33
 */
public class Add extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
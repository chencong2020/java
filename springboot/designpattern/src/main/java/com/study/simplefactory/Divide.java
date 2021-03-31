package com.study.simplefactory;

/**
 * @ClassName：Divide
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2019/12/31 11:34
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
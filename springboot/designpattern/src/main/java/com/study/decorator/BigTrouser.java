package com.study.decorator;

/**
 * @author chencong
 * @date 2021/4/6
 */
public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
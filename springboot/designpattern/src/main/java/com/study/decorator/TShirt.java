package com.study.decorator;

/**
 * 具体服饰类(ConcreteDecorator)
 *
 * @author chencong
 * @date 2021/4/6
 */
public class TShirt extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
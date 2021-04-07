package com.study.decorator.demo;

/**
 * 具体装饰类A
 *
 * @author chencong
 * @date 2021/4/6
 */
public class ConcreteDecoratorA extends Decorator {

    /**
     * 首先运行原Component的operation(),再执行本类的功能
     * 如addedState，相当于对原Component进行了装饰
     */
    @Override
    public void operation() {
        super.operation();
        /**
         * 本来独有的功能，以区别于ConcreteDecoratorB
         */
        String addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
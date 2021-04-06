package com.study.decorator;

/**
 * 具体装饰类B
 *
 * @author chencong
 * @date 2021/4/6
 */
public class ConcreteComponentB extends Decorator {
    /**
     * 首先执行原Component的operation(),再执行本类的功能
     * 如addedBehavior(),相当于对原Component进行了装饰
     */
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    /**
     * 本类独有的方法，以区别于ConcreteDecoratorA
     */
    void addedBehavior() {
    }
}
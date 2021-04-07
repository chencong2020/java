package com.study.decorator.demo;

/**
 * 定义了一个具体的对象，也可以给这个对象添加一些职责
 *
 * @author chencong
 * @date 2021/4/6
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
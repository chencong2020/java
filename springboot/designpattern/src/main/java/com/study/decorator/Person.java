package com.study.decorator;

import java.text.MessageFormat;

/**
 * ConcreteComponent
 *
 * @author chencong
 * @date 2021/4/6
 */
public class Person {
    public Person() {
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(MessageFormat.format("装扮的{0}", name));
    }
}
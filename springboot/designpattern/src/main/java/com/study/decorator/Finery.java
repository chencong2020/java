package com.study.decorator;

/**
 * Decorator
 *
 * @author chencong
 * @date 2021 /4/6
 */
public class Finery extends Person {
    /**
     * The Component.
     */
    Person component;

    /**
     * 打扮
     *
     * @param component the component
     */
    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
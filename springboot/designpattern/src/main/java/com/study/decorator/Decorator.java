package com.study.decorator;

/**
 * 装饰抽象类
 *
 * @author chencong
 * @date 2021 /4/6
 */
public abstract class Decorator extends Component {
    /**
     * The Component.
     */
    Component component;

    /**
     * Sets component.
     *
     * @param component the component
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写operation()方法，实际执行的是Component中的operation()
     */
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
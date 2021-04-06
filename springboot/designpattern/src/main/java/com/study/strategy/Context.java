package com.study.strategy;

/**
 * 具体上下文
 *
 * @author chencong
 * @date 2021/4/2
 */
public class Context {
    Strategy strategy;

    /**
     * 初始化时，传入具体的策略对象
     *
     * @param strategy 策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据具体的策略对象，调用其对应的算法
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}

package com.study.strategy.demo;

/**
 * 具体算法A
 *
 * @author chencong
 * @date 2021/4/2
 */
public class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("具体算法A");
    }
}
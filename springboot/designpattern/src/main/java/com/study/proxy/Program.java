package com.study.proxy;

/**
 * @author chencong
 * @date 2021/4/7
 */
public class Program {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("test");

        Proxy proxy = new Proxy(girl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}

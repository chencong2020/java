package com.study.proxy;

/**
 * 代理类
 *
 * @author chencong
 * @date 2021/4/7
 */
public class Proxy implements GiveGift {
    Boy boy;

    public Proxy(Girl girl) {
        boy = new Boy(girl);
    }

    @Override
    public void giveDolls() {
        boy.giveDolls();
    }

    @Override
    public void giveFlowers() {
        boy.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        boy.giveChocolate();
    }
}
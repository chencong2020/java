package com.study.proxy;

/**
 * 男孩(真实主体)，实现送礼物接口
 *
 * @author chencong
 * @date 2021/4/7
 */
public class Boy implements GiveGift {
    Girl girl;

    public Boy(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + "送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + "送你巧克力");
    }
}
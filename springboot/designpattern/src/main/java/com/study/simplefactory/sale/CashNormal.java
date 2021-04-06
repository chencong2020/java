package com.study.simplefactory.sale;

/**
 * 正常收费子类
 *
 * @author chencong
 * @date 2021/4/1
 */
public class CashNormal extends CashSuper {
    /**
     * 正常收费，返回原价
     *
     * @param money 原价
     * @return 原价
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}

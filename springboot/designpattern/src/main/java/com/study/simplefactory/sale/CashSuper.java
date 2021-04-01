package com.study.simplefactory.sale;

/**
 * 现金收费抽象类
 *
 * @author chencong
 * @date 2021/4/1
 */
public abstract class CashSuper {
    /**
     * 收取现金
     *
     * @param money 原价
     * @return 返回价
     */
    abstract double acceptCash(double money);
}

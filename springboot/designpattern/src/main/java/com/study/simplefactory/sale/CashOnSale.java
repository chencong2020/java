package com.study.simplefactory.sale;

/**
 * 打折收费子类
 *
 * @author chencong
 * @date 2021/4/1
 */
public class CashOnSale extends CashSuper {
    /**
     * 折扣率，默认为原价
     */
    private final Double moneyRebate;

    /**
     * 初始化时必须输入折扣率，如八折，就是0.8
     *
     * @param moneyRebate 折扣率
     */
    public CashOnSale(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}

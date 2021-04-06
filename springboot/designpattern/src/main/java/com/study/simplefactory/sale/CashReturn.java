package com.study.simplefactory.sale;

/**
 * 返利收费子类
 *
 * @author chencong
 * @date 2021/4/1
 */
public class CashReturn extends CashSuper {
    private final Double moneyCondition;
    private final Double moneyReturn;

    /**
     * 返利收费，初始化时必须输入返利条件和返利值，比如满300返100
     *
     * @param moneyCondition 返利条件
     * @param moneyReturn    返利值
     */
    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        // 若支付费用满足返利条件，则需要减去返利值
        if (money > moneyCondition) {
            // 原价- 向下取整（折扣次数）* 折扣值
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}

package com.study.strategy;

import com.study.simplefactory.sale.CashNormal;
import com.study.simplefactory.sale.CashOnSale;
import com.study.simplefactory.sale.CashReturn;
import com.study.simplefactory.sale.CashSuper;

/**
 * @author chencong
 * @date 2021/4/2
 */
public class CashContext {

    /**
     * 现金收费基类
     */
    private CashSuper cashSuper;

    /**
     * 通过构造方法，传入具体的收费策略
     *
     * @param cashSuper 现金收费基类
     */
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 策略模式与简单工厂结合
     *
     * @param type 收费类型
     */
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn("300", "100");
                break;
            case "打8折":
                cashSuper = new CashOnSale("0.8");
                break;
            default:
                cashSuper = null;
                break;
        }
    }

    /**
     * 根据收费策略的不同，获取计算结果
     *
     * @param money 收费金额
     * @return 应付金额
     */
    public Double getResult(double money) {
        if (cashSuper == null) {
            return null;
        }
        return cashSuper.acceptCash(money);
    }
}
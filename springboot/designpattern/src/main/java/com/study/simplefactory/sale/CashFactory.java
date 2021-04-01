package com.study.simplefactory.sale;

/**
 * 现金工厂
 *
 * @author chencong
 * @date 2021/4/1
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
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
                break;
        }
        return cashSuper;
    }
}

package com.study.strategy;

import java.util.Scanner;

/**
 * @author chencong
 * @date 2021/4/2
 */
public class Program {
    public static void main(String[] args) {
        // 支付总费用
        Double total = 0d;
        Scanner scanner = new Scanner(System.in);
        String price = "";
        String number = "";
        String type = "";
        System.out.println("please enter the price:");
        // 输入商品单价
        if (scanner.hasNextLine()) {
            price = scanner.nextLine();
        }
        System.out.println("please enter the number:");
        // 输入商品数量
        if (scanner.hasNextLine()) {
            number = scanner.nextLine();
        }
        System.out.println("please enter the pay type:");
        // 输入付款方式
        if (scanner.hasNextLine()) {
            type = scanner.nextLine();
        }
        CashContext cashSuper = new CashContext(type);
        try {
            total = cashSuper.getResult(Double.parseDouble(price) * Double.parseDouble(number));
            if (total == null) {
                System.out.println("请输入正确的付款方式");
            } else {
                System.out.println("商品单价：" + price + "\n数量：" + number + "\n付款方式：" + type + "\n总计：" + total);
            }
        } catch (NumberFormatException e) {
            System.out.println("请输入正确的价格和数量：" + e.getMessage());
        }
    }
}

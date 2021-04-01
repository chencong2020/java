package com.study.simplefactory.sale;

import java.util.Scanner;

/**
 * 程序入口
 *
 * @author chencong
 * @date 2021/4/1
 */
public class Program {
    public static void main(String[] args) {
        // 支付总费用
        double total = 0d;
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
        CashSuper cashSuper = CashFactory.createCashAccept(type);
        if (cashSuper == null) {
            System.out.println("请输入正确的付款方式");
        } else {
            try {
                total = cashSuper.acceptCash(Double.parseDouble(price) * Double.parseDouble(number));
                System.out.println("商品单价：" + price + "\n数量：" + number + "\n付款方式：" + type + "\n总计：" + total);
            } catch (NumberFormatException e) {
                System.out.println("请输入正确的价格和数量：" + e.getMessage());
            }
        }
    }
}

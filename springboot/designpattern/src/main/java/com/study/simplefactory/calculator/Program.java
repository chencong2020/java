package com.study.simplefactory.calculator;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * 计算器入口
 *
 * @author chencong
 */
public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String numberA = "";
        String numberB = "";
        String operate = "";
        Operation operation;
        System.out.println("please enter the first number:");
        if (scanner.hasNextLine()) {
            numberA = scanner.nextLine();
        }
        System.out.println("请选择运算符号(+、-、*、/)");
        if (scanner.hasNextLine()) {
            operate = scanner.nextLine();
        }
        System.out.println("please enter the second number:");
        if (scanner.hasNextLine()) {
            numberB = scanner.nextLine();
        }
        operation = OperationFactory.createOperation(operate);
        if (operation == null) {
            System.out.println("请输入正确的运算符");
        } else {
            double result;
            try {
                operation.setNumberA(Double.parseDouble(numberA));
                operation.setNumberB(Double.parseDouble(numberB));
                result = operation.getResult();
                System.out.println("the result is:" + result);
            } catch (NumberFormatException e) {
                System.out.println("您的输入有错：" + e);
            }
            System.out.println(MessageFormat.format(LogMsg.ERROR, "谢谢"));
        }
    }
    // public static void main(String[] args) {
    //     try {
    //         Scanner scanner = new Scanner(System.in);
    //         String numberA = "";
    //         String operation = "";
    //         String numberB = "";
    //         System.out.println("请输入数字A:");
    //         if (scanner.hasNextLine()) {
    //             numberA = scanner.nextLine();
    //         }
    //         System.out.println("请选择运算符号(+、-、*、/)");
    //         if (scanner.hasNextLine()) {
    //             operation = scanner.nextLine();
    //         }
    //         System.out.println("请输入数字B:");
    //         if (scanner.hasNextLine()) {
    //             numberB = scanner.nextLine();
    //         }
    //         String result = "";
    //         switch (operation) {
    //             case "+":
    //                 result = String.valueOf((Double.parseDouble(numberA) + Double.parseDouble(numberB)));
    //                 break;
    //             case "-":
    //                 result = String.valueOf((Double.parseDouble(numberA) - Double.parseDouble(numberB)));
    //                 break;
    //             case "*":
    //                 result = String.valueOf(Double.parseDouble(numberA) * Double.parseDouble(numberB));
    //                 break;
    //             case "/":
    //                 if (numberB != "0") {
    //                     result = String.valueOf(Double.parseDouble(numberA) / Double.parseDouble(numberB));
    //                 } else {
    //                     result = "除数不能为0";
    //                 }
    //                 break;
    //             default:
    //                 result = "请选择正确的运算符号";
    //         }
    //         System.out.println("结果是：" + result);
    //     } catch (NumberFormatException e) {
    //         System.out.println("您的输入有错：" + e);
    //     }
    // }

}

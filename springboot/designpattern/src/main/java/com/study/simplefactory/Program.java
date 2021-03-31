package com.study.simplefactory;

import java.text.MessageFormat;

/**
 * @ClassName：Program
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2019/12/26 15:29
 */
public class Program {
    public static void main(String[] args) throws Exception {
        Operation operation;
        operation = OperationFactory.createOperation("*");
        operation.setNumberA(4);
        operation.setNumberB(2);

        double result = operation.getResult();
        System.out.println(result);
        System.out.println(MessageFormat.format(LogMsg.Error, "你好"));
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

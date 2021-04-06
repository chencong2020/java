package com.study.decorator;

/**
 * @author chencong
 * @date 2021/4/6
 */
public class Program {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteComponentB d2 = new ConcreteComponentB();

        /*
        装饰的方法是：
            1.首先用ConcreteComponent实例化对象c
            2.然后用ConcreteDecoratorA的实例化对象d1来包装c
            3.再用ConcreteDecoratorB的对象d2包装d1
            4.最终执行d2的operation()
         */
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
        System.out.println(d2);

        Person person = new Person("测试");
        System.out.println("装扮：\n");

        TShirt tShirt = new TShirt();
        BigTrouser bigTrouser = new BigTrouser();

        // 装饰过程
        tShirt.decorate(person);
        bigTrouser.decorate(tShirt);
        bigTrouser.show();
    }
}
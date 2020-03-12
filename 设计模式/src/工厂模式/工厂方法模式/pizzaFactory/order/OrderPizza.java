package 工厂模式.工厂方法模式.pizzaFactory.order;

import 工厂模式.简单工厂模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class OrderPizza {

    // 定义一个抽象方法,让各个工厂自己实现
    abstract Pizza createPizza(String orderType);

    public void buy() {
        String orderType = ""; // 用户输入的
        Pizza pizza = null;
        do {
            orderType = getType();
            pizza = createPizza(orderType);     // 抽象方法,由工厂子类实现
            //输出pizza
            if (pizza != null) { // 订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }


    // 写一个方法，可以获取客户输入的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

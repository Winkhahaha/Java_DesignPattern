package 工厂模式.抽象工厂模式.order;

import 工厂模式.简单工厂模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        this.factory = factory;
    }

    public void buy() {
        Pizza pizza = null;
        String orderType = ""; // 用户输入的pizza类型
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);     // 抽象方法,由工厂子类实现
            //输出pizza
            if (pizza != null) { // 订购成功
                pizza.prepare();    // 输出pizza名称信息
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

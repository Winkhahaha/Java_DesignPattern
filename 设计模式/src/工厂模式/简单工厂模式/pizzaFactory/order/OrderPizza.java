package 工厂模式.简单工厂模式.pizzaFactory.order;

import 工厂模式.简单工厂模式.pizza.Pizza;
import 工厂模式.简单工厂模式.pizzaFactory.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OrderPizza {

    Pizza pizza = null;

    public void buy() {
        String orderType = ""; //用户输入的
        do {
            orderType = getType();
            pizza = PizzaFactory.createPizza(orderType);

            //输出pizza
            if (pizza != null) { //订购成功
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

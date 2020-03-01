package 工厂模式.简单工厂模式.pizza.order;

import 工厂模式.简单工厂模式.pizza.CheesePizza;
import 工厂模式.简单工厂模式.pizza.GreekPizza;
import 工厂模式.简单工厂模式.pizza.PepperPizza;
import 工厂模式.简单工厂模式.pizza.Pizza;
import 工厂模式.简单工厂模式.pizzaFactory.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }


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

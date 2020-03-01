package 工厂模式.简单工厂模式.pizzaFactory;

import 工厂模式.简单工厂模式.pizza.CheesePizza;
import 工厂模式.简单工厂模式.pizza.GreekPizza;
import 工厂模式.简单工厂模式.pizza.PepperPizza;
import 工厂模式.简单工厂模式.pizza.Pizza;

public class PizzaFactory {
    //更加orderType 返回对应的Pizza 对象
    public static Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}

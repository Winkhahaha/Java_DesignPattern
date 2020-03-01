package 工厂模式.抽象工厂模式.order;

import 工厂模式.抽象工厂模式.LDCheesePizza;
import 工厂模式.抽象工厂模式.LDPepperPizza;
import 工厂模式.简单工厂模式.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chess")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}

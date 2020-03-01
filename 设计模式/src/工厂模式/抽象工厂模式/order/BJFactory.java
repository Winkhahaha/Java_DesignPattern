package 工厂模式.抽象工厂模式.order;

import 工厂模式.抽象工厂模式.BJCheesePizza;
import 工厂模式.抽象工厂模式.BJPepperPizza;
import 工厂模式.简单工厂模式.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chess")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}

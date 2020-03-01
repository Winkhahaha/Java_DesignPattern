package 工厂模式.工厂方法模式.pizzaFactory.order;

import 工厂模式.工厂方法模式.pizzaFactory.LDCheesePizza;
import 工厂模式.工厂方法模式.pizzaFactory.LDPepperPizza;
import 工厂模式.简单工厂模式.pizza.Pizza;

// 伦敦订单只准备伦敦的口味
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chess")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}

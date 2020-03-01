package 工厂模式.工厂方法模式.pizzaFactory.order;

import 工厂模式.工厂方法模式.pizzaFactory.BJCheesePizza;
import 工厂模式.工厂方法模式.pizzaFactory.BJPepperPizza;
import 工厂模式.简单工厂模式.pizza.Pizza;

// 北京订单只准备北京的口味
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chess")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}

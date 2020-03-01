package 工厂模式.抽象工厂模式.order;

import 工厂模式.简单工厂模式.pizza.Pizza;

// 是一个抽象工厂模式的抽象层
public interface AbsFactory {

    // 让工厂子类来具体实现
    public Pizza createPizza(String orderType);
}

package 装饰者模式.装饰者;

import 装饰者模式.被装饰.Drink;

// 具体的装饰物
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("一份巧克力");
        setPrice(5.0f);
    }
}

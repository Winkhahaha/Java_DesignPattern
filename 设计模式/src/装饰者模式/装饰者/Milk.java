package 装饰者模式.装饰者;

import 装饰者模式.被装饰.Drink;

// 具体的装饰物
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("一份牛奶");
        setPrice(2.0f);
    }
}

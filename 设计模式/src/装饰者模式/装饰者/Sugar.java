package 装饰者模式.装饰者;

import 装饰者模式.被装饰.Drink;

// 具体的装饰物
public class Sugar extends Decorator {
    public Sugar(Drink drink) {
        super(drink);
        setDes("一份糖");
        setPrice(1.0f);
    }
}

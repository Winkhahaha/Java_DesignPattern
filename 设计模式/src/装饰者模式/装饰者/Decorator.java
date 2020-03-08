package 装饰者模式.装饰者;

import 装饰者模式.被装饰.Drink;

public class Decorator extends Drink {
    // 被装饰者
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // 小料价格加上单品咖啡价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() + " && " + drink.getDes();
    }
}

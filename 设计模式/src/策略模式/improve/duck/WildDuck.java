package 策略模式.improve.duck;

import 策略模式.improve.GoodFly;

public class WildDuck extends Duck {
    // 构造器传入FlyBehavior的对象

    public WildDuck() {
        setName("野鸭");
        flyBehavior = new GoodFly();    // 野鸭会飞
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}

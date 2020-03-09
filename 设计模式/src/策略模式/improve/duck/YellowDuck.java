package 策略模式.improve.duck;

import 策略模式.improve.BadFly;

public class YellowDuck extends Duck {
    public YellowDuck() {
        setName("小黄鸭");
        flyBehavior = new BadFly(); // 小黄鸭不会飞
    }

    @Override
    public void display() {
        System.out.println("这是小黄鸭");
    }

}

package 策略模式.improve.duck;

import 策略模式.improve.BadFly;

// 玩具鸭
public class ToyDuck extends Duck {

    public ToyDuck() {
        setName("玩具鸭");
        flyBehavior = new BadFly(); // 玩具鸭不会飞
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
    // 玩具鸭需要重写父类所有方法

    public void say() {
        System.out.println("玩具鸭不会叫");
    }

    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

}

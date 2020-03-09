package 策略模式.improve.duck;

import 策略模式.improve.FlyBehavior;

public abstract class Duck {
    // 属性,策略接口
    FlyBehavior flyBehavior;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Duck() {
    }

    public abstract void display();

    public void say() {
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly(this.name);
        }
    }
}

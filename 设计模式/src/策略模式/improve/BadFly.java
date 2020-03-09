package 策略模式.improve;

public class BadFly implements FlyBehavior {
    @Override
    public void fly(String name) {
        System.out.println(name + "不会飞");
    }
}

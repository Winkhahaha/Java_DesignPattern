package 策略模式.improve;

public class GoodFly implements FlyBehavior {
    @Override
    public void fly(String name) {
        System.out.println(name + "会飞");
    }
}

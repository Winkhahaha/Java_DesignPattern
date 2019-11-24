package 工厂模式.简单工厂模式;

public class Cat implements AnimalFood {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

}

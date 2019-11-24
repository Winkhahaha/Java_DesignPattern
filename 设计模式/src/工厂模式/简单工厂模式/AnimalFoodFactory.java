package 工厂模式.简单工厂模式;

public class AnimalFoodFactory {
    // 工厂职责:生产需求的动物食品
    public AnimalFood createFood(String name) {
        if ("dog".equals(name)) {
            return new Dog();
        } else if ("cat".equals(name)) {
            return new Cat();
        } else {
            return null;
        }
    }
}

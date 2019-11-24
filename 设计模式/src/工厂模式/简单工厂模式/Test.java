package 工厂模式.简单工厂模式;


public class Test {
    public static void main(String args[]) {

        // 创建动物食品加工厂
        AnimalFoodFactory factory = new AnimalFoodFactory();

        // 创建动物食品
        AnimalFood pet = null;

        // 给狗做食品
        pet = factory.createFood("dog");
        pet.eat();

        // 给猫做食物
        pet = factory.createFood("cat");
        pet.eat();

    }
}

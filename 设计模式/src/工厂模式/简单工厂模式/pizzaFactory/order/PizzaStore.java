package 工厂模式.简单工厂模式.pizzaFactory.order;

public class PizzaStore {
    public static void main(String[] args) {

        //使用简单工厂模式
        new OrderPizza().buy();
        //System.out.println("~~退出程序~~");

    }
}

package 工厂模式.简单工厂模式.pizza.order;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();

        //使用简单工厂模式
        //new OrderPizza(new SimpleFactory());
        //System.out.println("~~退出程序~~");

    }
}

package 工厂模式.抽象工厂模式.order;

import 工厂模式.工厂方法模式.pizzaFactory.order.BJOrderPizza;
import 工厂模式.工厂方法模式.pizzaFactory.order.LDOrderPizza;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        boolean flag = true;
        while (flag) {
            System.out.println("欢迎来到pizza点单系统!请按照提示输入!");
            System.out.println("北京---->北京地区披萨");
            System.out.println("伦敦---->伦敦地区披萨");
            System.out.println("quit--->退出");
            s = sc.nextLine();
            switch (s) {
                case "北京":
                    new OrderPizza(new BJFactory()).buy();
                    break;
                case "伦敦":
                    new OrderPizza(new LDFactory()).buy();
                    break;
                case "quit":
                    flag = false;
                    break;
                default:
                    break;
            }
        }

    }
}

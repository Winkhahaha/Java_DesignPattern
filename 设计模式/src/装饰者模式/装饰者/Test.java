package 装饰者模式.装饰者;

import 装饰者模式.被装饰.ACoffee;
import 装饰者模式.被装饰.Drink;

public class Test {
    public static void main(String args[]) {
        Drink a = new ACoffee();
        System.out.println("描述:" + a.getDes());
        System.out.println("咖啡单价:" + a.getPrice());
        System.out.println("-----------------------");

        // 两份巧克力,一份牛奶装饰A咖啡
        // 加入小料
        a = new Milk(a);
        // 每次加入小料后,就会变成了一个被修饰的的整体Drink
        System.out.println("描述:" + a.getDes());
        System.out.println("总费用:" + a.cost());
        System.out.println("-----------------------");

        a = new Chocolate(a);
        System.out.println("描述:" + a.getDes());
        System.out.println("总费用:" + a.cost());
        System.out.println("-----------------------");

        a = new Chocolate(a);
        System.out.println("描述:" + a.getDes());
        System.out.println("总费用:" + a.cost());
        System.out.println("-----------------------");
    }
}

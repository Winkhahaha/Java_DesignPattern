package 原型模式.sheep;

public class Test {
    public static void main(String args[]) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("肖恩", "白色");
        sheep.friend = new Sheep("托卡藕丝", "黑色");
        // 传统方法
//      Sheep sheep1 = new Sheep(sheep.getName(), sheep.getColor());
//      Sheep sheep2 = new Sheep(sheep.getName(), sheep.getColor());
        // 浅拷贝
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        sheep.friend = new Sheep("卡藕", "灰色");
        System.out.println(sheep == sheep1);    // false
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}

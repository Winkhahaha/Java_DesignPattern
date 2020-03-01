package 单例模式.饿汉式;

public class Singleton01 {
    public static void main(String args[]) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

// 饿汉式(静态变量)
class Singleton {

    // 私有构造器,外部不能new
    private Singleton() {
//        System.out.println("类加载");
    }

    // 内部创建实例对象
    private final static Singleton instance = new Singleton();

    // 对外提供静态方法,返回实例对象
    public static Singleton getInstance() {
//        System.out.println("静态方法");
        return instance;
    }
}

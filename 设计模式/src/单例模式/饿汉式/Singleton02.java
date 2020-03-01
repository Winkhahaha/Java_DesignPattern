package 单例模式.饿汉式;

public class Singleton02 {
    public static void main(String args[]) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

// 饿汉式(静态代码块)
class Singleton2 {

    // 私有构造器,外部不能new
    private Singleton2() {
    }

    // 内部创建实例对象
    private static Singleton2 instance;

    // 在静态代码块中创建单例对象
    static {
        instance = new Singleton2();
    }

    // 对外提供静态方法,返回实例对象
    public static Singleton2 getInstance() {
        return instance;
    }
}

package 单例模式.静态内部类;

public class StaticSingleton01 {
    public static void main(String args[]) {
        System.out.println("静态内部类线程安全:");
        new Thread(() -> {
            System.out.println(StaticSingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(StaticSingleton.getInstance());
        }).start();
    }
}

// 使用静态内部类完成单例模式
// 利用静态内部类的特点实现延迟加载,效率高
// 推荐使用
class StaticSingleton {
    private StaticSingleton() {

    }

    private static StaticSingleton instance;

    // 写一个静态内部类,该类中有一个静态属性StaticSingleton
    // 主类加载时,该内部类不会加载 --> 实现懒加载
    // 当调用主类的getInstance()方法时,才会加载该内部类
    // JVM中类的加载是线程安全的,所以该方法 --> 懒加载且安全
    private static class StaticSingletonInstance {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return StaticSingletonInstance.INSTANCE;
    }
}

package 单例模式.懒汉式线程安全;

public class LazySingleton03 {
    public static void main(String args[]) {
        System.out.println("懒汉式线程安全之双重检查:");
        new Thread(() -> {
            System.out.println(lazySafe2.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(lazySafe2.getInstance());
        }).start();

    }
}

// 采用双重检查
class lazySafe2 {
    private lazySafe2() {

    }

    // 保证多个线程都从主存中获取共享变量
    private volatile static lazySafe2 instance;

    // 双重检查,解决线程安全问题,解决懒加载问题
    // 保证了效率,推荐使用
    public static synchronized lazySafe2 getInstance() {
        // 当实例为空时,才创建对象
        if (instance == null) {
            synchronized (lazySafe2.class) {
                if (instance == null) {
                    // System.out.println("开始实例化:");
                    instance = new lazySafe2();
                }
            }
        }
        return instance;
    }
}

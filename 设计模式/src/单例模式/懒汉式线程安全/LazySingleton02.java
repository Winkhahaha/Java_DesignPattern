package 单例模式.懒汉式线程安全;

public class LazySingleton02 {
    public static void main(String args[]) {
        System.out.println("懒汉式线程安全:");
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ":" + LazySafe.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ":" + LazySafe.getInstance());
        }).start();

    }
}

// 采用同步方法
// 效率太低,每个线程进来都要先同步
class LazySafe {
    private LazySafe() {

    }

    private static LazySafe instance;

    // 加入synchronize关键字,解决线程安全问题
    public static synchronized LazySafe getInstance() {
        // 当实例为空时,才创建对象
        if (instance == null) {
            // System.out.println("开始实例化:");
            instance = new LazySafe();
        }
        return instance;
    }
}

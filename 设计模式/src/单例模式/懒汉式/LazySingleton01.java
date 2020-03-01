package 单例模式.懒汉式;

public class LazySingleton01 {
    public static void main(String args[]) {
        System.out.println("懒汉式:");
        LazySingleton instance = LazySingleton.getInstance();   // 创建新实例
        LazySingleton instance1 = LazySingleton.getInstance();  // 不需要创建,直接返回上次创建的实例
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

    }
}

class LazySingleton {
    private LazySingleton() {

    }

    private static LazySingleton instance;

    // 提供静态方法,当使用该方法时,才去创建实例对象
    public static LazySingleton getInstance() {
        // 当实例为空时,才创建对象
        if (instance == null) {
            // System.out.println("开始实例化:");
            instance = new LazySingleton();
        }
        return instance;
    }
}

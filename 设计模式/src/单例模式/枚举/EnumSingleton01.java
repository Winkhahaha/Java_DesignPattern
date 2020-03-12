package 单例模式.枚举;

public class EnumSingleton01 {
    public static void main(String args[]) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance == instance2);
        instance.sayOK();
        // 多线程测试
        System.out.println("多线程测试:");
        new Thread(() -> {
            System.out.println("hashCode: " + EnumSingleton.INSTANCE.hashCode());
        }).start();
        new Thread(() -> {
            System.out.println("hashCode: " + EnumSingleton.INSTANCE.hashCode());
        }).start();
    }
}

// 枚举实现单例模式
// 可以避免多线程同步问题
// 防止反序列化重写创建对象
// 推荐使用
enum EnumSingleton {
    INSTANCE;   // 属性

    public void sayOK() {
        System.out.println("ok!");
    }
}

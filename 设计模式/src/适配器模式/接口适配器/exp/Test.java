package 适配器模式.接口适配器.exp;

public class Test {
    public static void main(String args[]) {
        // 抽象类的匿名子类,必须有方法体
        A a = new A() {
            @Override
            public void test1() {
                super.test1();
            }
        };
        a.test1();
    }
}

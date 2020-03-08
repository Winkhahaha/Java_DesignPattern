package 适配器模式.接口适配器.exp;

public class Test {
    public static void main(String args[]){
        // 抽象类的匿名子类
        A a = new A() {
            @Override
            public void test1() {
                System.out.println("使用了test1方法");
            }
        };
        a.test1();
    }
}

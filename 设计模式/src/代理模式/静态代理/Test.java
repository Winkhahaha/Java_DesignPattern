package 代理模式.静态代理;

public class Test {
    public static void main(String args[]) {
        // 通过代理对象,调用到被代理对象的方法
        // 即执行的是代理对象的方法,代理对象的方法中去调用被代理对象的方法
        new TeacherDaoProxy(new TeacherDao()).teach();
    }
}

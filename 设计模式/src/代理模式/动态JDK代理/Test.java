package 代理模式.动态JDK代理;

public class Test {
    public static void main(String args[]) {
        // 创建目标对象
        ITeacherDao target = new TeacherDao();
        // 给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        // 内存中动态生成了代理对象
        proxyInstance.teach();
        // 将有返回值的方法执行结果返回
        System.out.println(proxyInstance.subject("数学课"));
    }
}

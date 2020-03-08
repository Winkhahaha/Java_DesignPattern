package 代理模式.Cglib代理;

public class Test {
    public static void main(String args[]){
        // 获取到代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
        // 执行代理方法,会触发intercept()方法
        String value = proxyInstance.teach("数学课");
        System.out.println(value);
    }
}

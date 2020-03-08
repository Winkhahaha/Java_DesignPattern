package 代理模式.Cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    // 维护一个目标对象
    private Object target;

    // 传入一个被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回一个代理对象,是target的代理对象
    public Object getProxyInstance(){
        // 创建工具类型
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类对象,即代理对象
        return enhancer.create();
    }

    // 会调用目标对象方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始:");
        Object value = method.invoke(target, args);
        System.out.println("Cglib代理结束.");
        return value;   // 如果方法有返回值,可以将其返回
    }
}

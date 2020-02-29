package 七种原则.里氏替换原则.improve;

import java.util.ArrayList;

public class LiskovImprove {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        System.out.println(a.fun(1, 9));
        System.out.println(b.fun(1, 2));
        System.out.println(b.fun3(6, 3));


    }
}

// 创建更加基础的基类
class Base {

}

class A extends Base {
    public int fun(int n1, int n2) {
        System.out.println("A的减法:");
        return n1 - n2;
    }
}

class B extends Base {
    // 如果B需要使用A的方法,采用组合的方式
    private A a = new A();
    ArrayList arrayList;

    public int fun(int n1, int n2) {
        System.out.println("B的加法:");
        return n1 + n2;
    }

    public int fun2(int n1, int n2) {
        System.out.println("B的先减后加9:");
        return this.a.fun(n1, n2) + 9;  // 调用了A的方法
    }

    public int fun3(int n1, int n2) {
        System.out.println("B调用成员变量A的减法:");
        return this.a.fun(n1, n2);
    }
}

package 七种原则.里氏替换原则;

public class Liskov {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        System.out.println(a.fun(1,9));
        System.out.println(b.fun(1, 2));
    }
}

class A {
    public int fun(int n1, int n2) {
        System.out.println("A的减法:");
        return n1 - n2;
    }
}

class B extends A {
    @Override
    public int fun(int n1, int n2) {
        System.out.println("B的加法:");
        return n1 + n2;
    }

    public int fun2(int n1, int n2) {
        System.out.println("B的先减后加9:");
        return fun(n1, n2) + 9;
    }
}

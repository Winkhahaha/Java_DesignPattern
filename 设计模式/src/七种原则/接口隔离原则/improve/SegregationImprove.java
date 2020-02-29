package 七种原则.接口隔离原则.improve;


public class SegregationImprove {
    public static void main(String args[]) {
        A a = new A();      // A通过接口依赖B类
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();      // C通过接口依赖D类
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }
}

/*
接口进行拆分,要用什么方法再去实现哪个接口
 */
interface Inter1 {
    void test1();

}

interface Inter2 {

    void test2();

    void test3();
}

interface Inter3 {
    void test4();

    void test5();
}

// A用哪些方法我就实现包含那个方法的接口
class B implements Inter1, Inter2 {

    @Override
    public void test1() {
        System.out.println("A 通过接口依赖 B 实现 test1");
    }

    @Override
    public void test2() {
        System.out.println("A 通过接口依赖 B 实现 test2");
    }

    @Override
    public void test3() {
        System.out.println("A 通过接口依赖 B 实现 test3");
    }

}

// C用哪些方法我就实现包含那个方法的接口
class D implements Inter1, Inter3 {

    @Override
    public void test1() {
        System.out.println("C 通过接口依赖 D 实现 test1");
    }

    @Override
    public void test4() {
        System.out.println("C 通过接口依赖 D 实现 test4");
    }

    @Override
    public void test5() {
        System.out.println("C 通过接口依赖 D 实现 test5");
    }
}

// A类通过依赖接口inter1,inter2使用B类,只用1,2,3方法
class A {
    public void depend1(Inter1 inter1) {
        inter1.test1();
    }

    public void depend2(Inter2 inter1) {
        inter1.test2();
    }

    public void depend3(Inter2 inter1) {
        inter1.test3();
    }
}

// C类通过依赖接口inter1,inter3使用D类,只用1,4,5方法
class C {
    public void depend1(Inter1 inter1) {
        inter1.test1();
    }

    public void depend4(Inter3 inter1) {
        inter1.test4();
    }

    public void depend5(Inter3 inter1) {
        inter1.test5();
    }
}
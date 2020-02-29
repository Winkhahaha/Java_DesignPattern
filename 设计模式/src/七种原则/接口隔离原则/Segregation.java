package 七种原则.接口隔离原则;

public class Segregation {
    public static void main(String args[]) {
    A a = new A();
    a.depend1(new B());
    }
}

interface Inter1 {
    void test1();

    void test2();

    void test3();

    void test4();

    void test5();
}

class B implements Inter1 {

    @Override
    public void test1() {
        System.out.println("B 实现 test1");
    }

    @Override
    public void test2() {
        System.out.println("B 实现 test2");
    }

    @Override
    public void test3() {
        System.out.println("B 实现 test3");
    }

    @Override
    public void test4() {
        System.out.println("B 实现 test4");
    }

    @Override
    public void test5() {
        System.out.println("B 实现 test5");
    }
}

class D implements Inter1 {

    @Override
    public void test1() {
        System.out.println("D 实现 test1");
    }

    @Override
    public void test2() {
        System.out.println("D 实现 test2");
    }

    @Override
    public void test3() {
        System.out.println("D 实现 test3");
    }

    @Override
    public void test4() {
        System.out.println("D 实现 test4");
    }

    @Override
    public void test5() {
        System.out.println("D 实现 test5");
    }
}

// A类通过依赖接口使用B类,只用1,2,3方法
class A{
    public void depend1(Inter1 inter1){
        inter1.test1();
    }
    public void depend2(Inter1 inter1){
        inter1.test2();
    }
    public void depend3(Inter1 inter1){
        inter1.test3();
    }
}

// A类通过依赖接口使用D类,只用1,4,5方法
class C{
    public void depend1(Inter1 inter1){
        inter1.test1();
    }
    public void depend4(Inter1 inter1){
        inter1.test4();
    }
    public void depend5(Inter1 inter1){
        inter1.test5();
    }
}
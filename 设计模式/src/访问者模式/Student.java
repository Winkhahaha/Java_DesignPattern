package 访问者模式;

public interface Student {
    // 第一步：定义抽象观察者（Observer）：抽象的学生
    // 学生通过实现该接口可以使用方法得到老师发的信息
    void getMessage(String s);
}

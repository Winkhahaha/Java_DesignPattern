package 观察者模式.student;

public interface Student {
    // 第一步：定义抽象观察者（Observer）：抽象的学生
    // 学生通过实现该接口可以使用方法得到老师发的信息
    void getMessage(String s);  // 接收信息
    String getName();       // 学生名称
}

package 七种原则.依赖倒转原则;

public class DI {
    public static void main(String args[]) {
        Person person = new Person();
        person.receive(new Email());
    }
}

// 完成person接收消息的功能
// 方式1
// 问题:扩展性差,类作为依赖,扩展则得创建新类
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "hello";
    }
}

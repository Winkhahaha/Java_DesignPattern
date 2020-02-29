package 七种原则.依赖倒转原则.improve;

public class DIImprove {
    public static void main(String args[]) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

// 定义接口
interface IReceive{
    public String getInfo();
}

// 面向接口
class Email implements IReceive{
    public String getInfo() {
        return "hello";
    }
}

class WeChat implements IReceive{

    @Override
    public String getInfo() {
        return "微信消息";
    }
}


// 完成person接收消息的功能
// 方式2
// 依赖接口,复用性强
class Person {
    public void receive(IReceive receive) {
        System.out.println(receive.getInfo());
    }
}


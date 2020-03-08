package 中介者模式.smarthouse;

import 中介者模式.smarthouse.被控制的机器.AMachine;
import 中介者模式.smarthouse.被控制的机器.BMachine;
import 中介者模式.smarthouse.被控制的机器.CMachine;

public class Test {

    public static void main(String[] args) {
        // 创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        // 创建机器
        AMachine A = new AMachine(mediator, "AMachine");
        BMachine B = new BMachine(mediator, "BMachine");
        CMachine C = new CMachine(mediator, "CMachine");

        // 调用
        A.SendMessage(0);
        A.SendMessage(1);

    }

}

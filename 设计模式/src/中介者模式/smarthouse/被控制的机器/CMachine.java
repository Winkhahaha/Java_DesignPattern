package 中介者模式.smarthouse.被控制的机器;

import 中介者模式.smarthouse.Mediator;

public class CMachine extends Colleague {

    public CMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void startCMachine() {
        System.out.println("C机器启动");
    }

    public void stopCMachine() {
        System.out.println("C机器工作完成");
    }
}

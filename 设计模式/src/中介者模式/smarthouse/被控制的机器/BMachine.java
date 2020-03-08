package 中介者模式.smarthouse.被控制的机器;

import 中介者模式.smarthouse.Mediator;

public class BMachine extends Colleague {

    public BMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void startBMachine() {
        System.out.println("B机器启动");
    }

    public void stopBMachine() {
        System.out.println("B机器工作完成");
        SendMessage(0);
    }
}

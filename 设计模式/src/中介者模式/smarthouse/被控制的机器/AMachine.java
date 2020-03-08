package 中介者模式.smarthouse.被控制的机器;

import 中介者模式.smarthouse.Mediator;

// 发送对应消息,调动其他机器状态
public class AMachine extends Colleague {

	public AMachine(Mediator mediator, String name) {
		super(mediator, name);
	 // 创建这个对象时,放入到该集合中
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	public void startAMachine() {
		System.out.println("A机器启动并发送状态码");
	}

	public void stopAMachine() {
		System.out.println("A机器工作完成");
		//SendMessage(0);
	}

}

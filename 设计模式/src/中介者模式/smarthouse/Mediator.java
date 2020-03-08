package 中介者模式.smarthouse;

import 中介者模式.smarthouse.被控制的机器.Colleague;

public abstract class Mediator {
	// 将受控制的机器注册到中介者的名单中
	public abstract void Register(String colleagueName, Colleague colleague);

	// 接收具体机器的消息
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}

package 命令模式.light;

import 命令模式.Command;

// 电灯打开按钮
public class LightOnCommand implements Command {

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.on(); // 提交命令,电灯打开
    }

    @Override
    public void undo() {    // 撤销命令,电灯关闭
        lightReceiver.off();
    }
}

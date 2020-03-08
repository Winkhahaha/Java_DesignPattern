package 命令模式.light;

import 命令模式.Command;

public class LightOffCommand implements Command {

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.off(); // 提交命令,电灯关闭
    }

    @Override
    public void undo() {
        lightReceiver.on();    // 撤销命令,电灯打开
    }
}

package 命令模式;

import 命令模式.light.LightOffCommand;
import 命令模式.light.LightOnCommand;
import 命令模式.light.LightReceiver;

public class Test {
    public static void main(String args[]) {
        // 创建电灯接收者
        LightReceiver lightReceiver = new LightReceiver();
        // 创建电灯开关
        LightOnCommand onCommand = new LightOnCommand(lightReceiver);
        LightOffCommand offCommand = new LightOffCommand(lightReceiver);
        // 需要一个遥控
        RemoteController controller = new RemoteController();
        // 给遥控器第一行位置设置相关命令
        controller.setCommand(0, onCommand, offCommand);
        System.out.println("--------按下灯开按钮--------:");
        controller.use(0);
        System.out.println("--------按下灯关按钮--------:");
        controller.unuse(0);
        System.out.println("--------撤销上一步操作--------:");
        controller.undo();

    }
}

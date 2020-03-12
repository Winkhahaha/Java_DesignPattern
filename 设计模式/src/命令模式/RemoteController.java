package 命令模式;

import 命令模式.light.Command;
import 命令模式.light.NoCommand;

public class RemoteController {
    // 开,关按钮的数组
    Command[] on;
    Command[] off;

    // 执行撤销的命令
    Command undoCommand;

    public RemoteController(){
        on = new Command[5];
        off = new Command[5];
        for (int i = 0; i < 5; i++) {
            on[i] = new NoCommand();    // 按钮全部初始化为空命令
            off[i] = new NoCommand();
        }
    }

    // 给指定序号的按钮设置命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        on[no] = onCommand;
        off[no] = offCommand;
    }

    // 按下按钮
    public void use(int no){
        // 找到你按下"开"的按钮,并调用对应方法
        on[no].excute();
        // 记录这次的操作便于后序撤销
        undoCommand = on[no];
    }

    // 按下关闭按钮
    public void unuse(int no){
        // 找到你按下"关"的按钮,并调用对应方法
        off[no].excute();
        // 记录这次的操作便于后序撤销
        undoCommand = off[no];
    }

    // 按下撤销按钮
    public void undo(){
        undoCommand.undo();
    }
}

package 命令模式.light;

import 命令模式.light.Command;

// 空操作.没有任何命令
// 可以省掉对空的判断
public class NoCommand implements Command {
    @Override
    public void excute() {

    }

    @Override
    public void undo() {

    }
}

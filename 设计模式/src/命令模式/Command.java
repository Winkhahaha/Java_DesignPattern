package 命令模式;

public interface Command {
    // 提交命令
    public void excute();
    // 撤销命令
    public void undo();
}

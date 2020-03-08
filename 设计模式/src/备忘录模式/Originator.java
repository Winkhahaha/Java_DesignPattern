package 备忘录模式;

// 原始对象
public class Originator {
    private String state;   // 状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 编写一个方法,返回当前状态的备忘录对象
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    // 通过备忘录对象恢复状态
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}

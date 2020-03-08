package 备忘录模式;

// Memento:纪念
// 记录状态的对象
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

package 观察者模式.student;

public class StuB implements Student {
    private String name;

    public StuB() {
    }

    public StuB(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getMessage(String s) {
        System.out.println(name+": 收到了老师发来的作业通知--->"+s);
    }
}

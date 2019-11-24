package 访问者模式;

public class StuB implements Student {
    private String name = "学生乙";

    public StuB() {
    }

    public StuB(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String s) {
        System.out.println(name+": 收到了老师发来的作业通知--->"+s);
    }
}

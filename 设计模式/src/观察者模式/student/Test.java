package 观察者模式.student;

public class Test {
    public static void main(String args[]) {
        //创建老师
        Teacher teacher = new Teacher();

        //创建学生
        StuA stuA = new StuA("学生甲");
        StuB stuB = new StuB("学生乙");

        //将学生注册在老师的教学名单里
        teacher.addStudent(stuA);
        teacher.addStudent(stuB);
        // 测试花名单删除
        // teacher.remove(stuB.getName());

        //老师向已注册的学生通知作业
        teacher.sendMessToStu("这是今天的作业!");
        teacher.sendMessToStu("这是后天的作业!");

    }
}

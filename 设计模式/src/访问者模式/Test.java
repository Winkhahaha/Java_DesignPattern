package 访问者模式;

public class Test {
    public static void main(String args[]) {
        //创建老师
        Teacher teacher = new Teacher();

        //创建学生
        StuA stuA = new StuA();
        StuB stuB = new StuB();

        //将学生注册在老师的教学名单里
        teacher.addStudent(stuA);
        teacher.addStudent(stuB);

        //老师向已注册的学生通知作业
        teacher.sendMessToStu("这是今天的作业!");


    }
}

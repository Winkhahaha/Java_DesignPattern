package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private List<Student> list = new ArrayList<>();

    public Teacher(List<Student> list) {
        this.list = list;
    }

    public Teacher() {
    }

    public void addStudent(Student student){
        // 将学生注册在该老师的教学名单中
        list.add(student);
    }
    public void sendMessToStu(String s){
        //给在自己名单上的学生布置作业
        for (Student student : list) {
            student.getMessage(s);
        }
    }
}

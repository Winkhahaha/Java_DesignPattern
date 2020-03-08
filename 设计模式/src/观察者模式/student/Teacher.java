package 观察者模式.student;

import java.util.*;

public class Teacher {
    // 保证存取顺序
    private LinkedHashMap<String, Student> map = new LinkedHashMap<>();

    public Teacher() {
    }

    public void addStudent(Student student) {
        // 将学生注册在该老师的教学名单中
        map.put(student.getName(), student);
    }

    public void sendMessToStu(String s) {
        //给在自己名单上的学生布置作业
        for (Map.Entry<String, Student> studentEntry : map.entrySet()) {
            Student student = studentEntry.getValue();
            student.getMessage(s);
        }
    }

    // 将某个学生从老师手中的名单移除
    public void remove(String name) {
        map.remove(name);
    }
}

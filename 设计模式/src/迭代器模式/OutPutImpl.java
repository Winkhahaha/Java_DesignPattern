package 迭代器模式;

import 迭代器模式.学院.College;
import 迭代器模式.学院.专业.Department;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    // 学院集合
    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }
    // 遍历所有学院
    public void printCollege(){
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()){
           College c= iterator.next();
           // 获得学院名称
            System.out.println("------"+c.getName()+"------");
            printDepartment(c.myIterator());
        }
    }


    // 输出某个学院的所有系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName() + ":" + d.getDesc());
        }
    }

}

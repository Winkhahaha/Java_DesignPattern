package 迭代器模式.学院;

import 迭代器模式.学院.专业.Department;
import 迭代器模式.InfoCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    List<Department> departments = new ArrayList<>();
    int count = 0;  // 保存当前集合已存放的对象个数

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        if (count < 5) {
            departments.add(department);
            count += 1;
        } else {
            System.out.println("该学院开设专业数量达到上限!");
        }
    }

    @Override
    public Iterator myIterator() {
        return new InfoCollegeIterator(departments);
    }
}

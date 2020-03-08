package 迭代器模式;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments = new Department[5];
    int count = 0;  // 保存当前数组的对象个数

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        if (count < departments.length) {
            departments[count] = department;
            count += 1;
        } else {
            System.out.println("该学院开设专业数量达到上限!");
        }
    }

    @Override
    public Iterator myIterator() {
        return new ComputerCollegeIterator(departments);
    }
}

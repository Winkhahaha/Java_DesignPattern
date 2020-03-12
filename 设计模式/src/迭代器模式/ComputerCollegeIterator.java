package 迭代器模式;

import 迭代器模式.学院.专业.Department;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    // 我们需要指定Department是以怎样的方式存放
    Department[] departments;
    int position = 0;    // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    // 删除的方法,默认空实现
    public void remove() {

    }
}

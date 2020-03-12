package 迭代器模式;

import 迭代器模式.学院.专业.Department;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    // 我们需要指定Department是以怎样的方式存放
    List<Department> departments;
    int position = 0;    // 遍历的位置

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments.get(position);
        position += 1;
        return department;
    }

    // 删除的方法,默认空实现
    public void remove() {

    }
}

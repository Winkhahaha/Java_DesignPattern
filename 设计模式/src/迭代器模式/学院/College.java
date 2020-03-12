package 迭代器模式.学院;

import java.util.Iterator;

public interface College {
    public String getName();
    // 增加专业的方法
    public void addDepartment(String name,String desc);
    // 返回一个迭代器,遍历
    public Iterator myIterator();
}

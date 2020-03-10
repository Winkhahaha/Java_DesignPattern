package 访问者模式;

import 访问者模式.action.AbstractAction;
import 访问者模式.person.AbstractPerson;

import java.util.ArrayList;
import java.util.List;

// 数据结构,管理很多人
public class ObjectStructure {
    // 维护了一个集合
    private List<AbstractPerson> people = new ArrayList<>();

    // 增加到集合
    public void attach(AbstractPerson person) {
        people.add(person);
    }

    // 移除
    public void detach(AbstractPerson person) {
        people.remove(person);
    }

    // 显示测评情况:将某个行为传递给集合中的所有person
    public void display(AbstractAction action) {
        for (AbstractPerson person : people) {
            person.accept(action);
        }
    }
}

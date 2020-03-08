package 备忘录模式;

import java.util.ArrayList;
import java.util.List;

public class AdminMemento {
    // 集合管理各个备忘录对象
    private List<Memento> mementoList = new ArrayList<>();
    public void add(Memento memento){
        mementoList.add(memento);
    }
    // 获取指定的备忘录对象(即原先保存的状态)
    public Memento get(int index){
        return mementoList.get(index);
    }

}

package 访问者模式.person;

import 访问者模式.action.AbstractAction;

// 这里使用到了双分派,即在客户端中,将具体状态参数传递Man中(第一次分派)
// 然后在Man类中调用getManResult(this);将自己作为参数传入,完成第二次分派
public class Man extends AbstractPerson {

    public Man(String name) {
        super(name);
    }

    @Override
    public void accept(AbstractAction action) {
        action.getPersonResult(this);
    }
}

package 访问者模式.action;

import 访问者模式.person.AbstractPerson;

public abstract class AbstractAction {
    // 访问者的行为
    // 继承AbstractPerson的访问者进行测评
    public abstract void getPersonResult(AbstractPerson person);

}

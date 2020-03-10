package 访问者模式.action;

import 访问者模式.person.AbstractPerson;

public class Pass extends AbstractAction {
    @Override
    public void getPersonResult(AbstractPerson person) {
        System.out.println(person.getName() + ":通过");
    }
}

package 访问者模式.action;

import 访问者模式.person.AbstractPerson;
import 访问者模式.person.Man;
import 访问者模式.person.Woman;

public class Out extends AbstractAction {

    @Override
    public void getPersonResult(AbstractPerson person) {
        System.out.println(person.getName() + ":出局");
    }
}

package 访问者模式.person;

import 访问者模式.action.AbstractAction;

public class Woman extends AbstractPerson {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(AbstractAction action) {
        action.getPersonResult(this);
    }
}

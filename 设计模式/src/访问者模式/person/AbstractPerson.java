package 访问者模式.person;


import 访问者模式.action.AbstractAction;

public abstract class AbstractPerson {
    private String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    // 提供方法,让访问者可以访问
    public abstract void accept(AbstractAction action);

    public String getName() {
        return name;
    }


}

package 访问者模式.action;

import 访问者模式.person.Man;
import 访问者模式.person.Woman;

public class Out extends AbstractAction {
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName() + ":出局");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName() + ":出局");
    }
}

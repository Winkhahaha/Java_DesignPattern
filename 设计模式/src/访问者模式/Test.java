package 访问者模式;

import 访问者模式.action.Out;
import 访问者模式.action.Pass;
import 访问者模式.person.Man;
import 访问者模式.person.Woman;

public class Test {
    public static void main(String args[]) {
        ObjectStructure structure = new ObjectStructure();
        // 将Person传入到数据结构中
        structure.attach(new Man("男评委A"));
        structure.attach(new Woman("女评委B"));
        // 第一次分派:将要执行的行为传给数据结构中的Person
        // 第二次分派:Person将自己传入到行为方法
        structure.display(new Pass());
        structure.display(new Out());
    }
}

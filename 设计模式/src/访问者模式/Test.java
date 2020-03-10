package 访问者模式;

import 访问者模式.action.Out;
import 访问者模式.action.Pass;
import 访问者模式.person.Man;
import 访问者模式.person.Woman;

public class Test {
    public static void main(String args[]) {
        ObjectStructure structure = new ObjectStructure();
        // 第一次分派:将Person传入到数据结构中
        structure.attach(new Man("男评委A"));
        structure.attach(new Woman("女评委B"));
        // 第二次分派:将行为传给数据结构中的Person
        structure.display(new Pass());
        structure.display(new Out());
    }
}

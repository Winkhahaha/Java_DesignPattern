package 备忘录模式;

public class Test {
    public static void main(String args[]) {
        Originator originator = new Originator();
        AdminMemento adminMemento = new AdminMemento();

        // 设置原始对象状态
        originator.setState("状态1");
        // 将状态对象保存到状态对象集合中
        adminMemento.add(originator.saveStateMemento());
        originator.setState("状态2");
        adminMemento.add(originator.saveStateMemento());

        System.out.println("原始状态:");
        System.out.println(originator);
        // 希望恢复到状态1
        System.out.println("恢复到状态1:");
        originator.getStateFromMemento(adminMemento.get(0));
        System.out.println(originator);
        // 恢复到状态2
        System.out.println("恢复到状态2:");
        originator.getStateFromMemento(adminMemento.get(1));
        System.out.println(originator);


    }
}

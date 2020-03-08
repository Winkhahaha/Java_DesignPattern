package 备忘录模式.游戏角色备份;

public class Test {
    public static void main(String args[]) {
        System.out.println("初始状态:");
        GameRole gameRole = new GameRole();
        gameRole.setVit(5);
        gameRole.setDef(10);
        gameRole.print();

        // 将当前状态保存到GameMaster
        GameMaster gameMaster = new GameMaster();
        gameMaster.setGameMemento(gameRole.createMemento());

        System.out.println("充钱后:");
        gameRole.setVit(99999999);
        gameRole.setDef(99999999);
        gameRole.print();

        System.out.println("恢复到初始状态:");
        gameRole.recoverGameRole(gameMaster.getGameMemento());
        gameRole.print();
    }
}

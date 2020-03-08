package 备忘录模式.游戏角色备份;

public class GameRole {
    private int vit;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    // 创建Memento,根据当前状态
    public GameMemento createMemento() {
        return new GameMemento(vit, def);
    }

    // 从备忘录对象恢复角色状态
    public void recoverGameRole(GameMemento gameMemento) {
        this.vit = gameMemento.getVit();
        this.def = gameMemento.getDef();
    }

    // 显示
    public void print() {
        System.out.println("游戏角色信息:");
        System.out.println("攻击力:" + this.vit);
        System.out.println("防御力:" + this.def);
    }
}

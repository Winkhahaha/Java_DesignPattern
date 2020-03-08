package 备忘录模式.游戏角色备份;

// 游戏备份
public class GameMemento {
    private int vit;
    private int def;

    public GameMemento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

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
}

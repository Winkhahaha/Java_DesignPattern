package 备忘录模式.游戏角色备份;

// 保存游戏角色的备份
public class GameMaster {
    // 对单个游戏角色进行备份
    private GameMemento gameMemento;

    public GameMemento getGameMemento() {
        return gameMemento;
    }

    public void setGameMemento(GameMemento gameMemento) {
        this.gameMemento = gameMemento;
    }
}

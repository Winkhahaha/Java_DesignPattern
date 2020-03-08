package 建造者模式;

public abstract class AbstractHouse {
    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    // 子类继承
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}

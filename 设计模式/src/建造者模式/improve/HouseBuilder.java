package 建造者模式.improve;

public abstract class HouseBuilder {
    House house = new House();
    // 建造流程
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();


    // 建造房子
    public House buildHouse(){
        return house;
    }

}

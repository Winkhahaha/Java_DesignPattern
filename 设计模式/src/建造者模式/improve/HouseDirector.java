package 建造者模式.improve;

public class HouseDirector {
    HouseBuilder houseBuilder;      // 聚合

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何建造房子,交给指挥者
    public House construct(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}

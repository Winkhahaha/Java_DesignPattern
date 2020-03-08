package 建造者模式.improve;

public class HighHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        house.setName("高楼");
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼房子封顶");
    }
}

package 建造者模式.improve;

public class CommonHouse extends HouseBuilder {


    @Override
    public void buildBasic() {
        house.setName("普通房子");
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}

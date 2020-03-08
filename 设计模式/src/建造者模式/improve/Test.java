package 建造者模式.improve;

public class Test {
    public static void main(String args[]) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director = new HouseDirector(commonHouse);
        House house = director.construct();
        System.out.println(house);

        director = new HouseDirector(new HighHouse());
        House house2 = director.construct();
        System.out.println(house2);

    }
}

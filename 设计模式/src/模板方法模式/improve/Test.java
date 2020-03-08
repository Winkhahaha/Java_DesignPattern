package 模板方法模式.improve;

public class Test {
    public static void main(String args[]){
            // 制作红豆豆浆
        System.out.println("制作红豆豆浆:");
        RedSoya redSoya = new RedSoya();
        redSoya.make();
        System.out.println("制作黑豆豆浆:");
        BlackSoya blackSoya = new BlackSoya();
        blackSoya.make();
        System.out.println("制作纯豆浆:");
        OrdinarySoya ordinarySoya = new OrdinarySoya();
        ordinarySoya.make();
    }
}

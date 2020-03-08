package 外观模式.使用设备;

public class Screen {
    private Screen(){

    }
    private static Screen instance = new Screen();
    public static Screen getInstance(){
        return instance;
    }

    public void up() {
        System.out.println("屏幕up");
    }

    public void down() {
        System.out.println("屏幕down");
    }
}

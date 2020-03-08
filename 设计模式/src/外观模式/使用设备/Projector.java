package 外观模式.使用设备;

public class Projector {
    private Projector(){

    }
    private static Projector instance = new Projector();
    public static Projector getInstance(){
        return instance;
    }

    public void on() {
        System.out.println("投影仪开机");
    }

    public void off() {
        System.out.println("投影仪关机");
    }

    public void play() {
        System.out.println("使用投影仪");
    }
}

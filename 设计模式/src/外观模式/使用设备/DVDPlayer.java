package 外观模式.使用设备;

public class DVDPlayer {
    private DVDPlayer() {
    }

    // 使用单例模式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD开机");
    }

    public void off() {
        System.out.println("DVD关机");
    }

    public void play() {
        System.out.println("开始播放");
    }

    public void pause() {
        System.out.println("暂停播放");
    }
}

package 外观模式;

import 外观模式.使用设备.DVDPlayer;
import 外观模式.使用设备.Projector;
import 外观模式.使用设备.Screen;

// 外观,集成了其他设备的功能
public class CoreTools {
    // 定义子设备的对象
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;

    public CoreTools() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
    }

    // 1.准备工作
    public void ready() {
        screen.down();  // 屏幕降下,投影仪打开,dvd开机
        projector.on();
        dvdPlayer.on();
    }

    // 2.开始播放
    public void play() {
        dvdPlayer.play();
    }

    // 3.暂停播放
    public void pause() {
        dvdPlayer.pause();
    }

    // 4.结束播放
    public void end() {
        dvdPlayer.off();
        projector.off();
        screen.up();
    }
}

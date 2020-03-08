package 适配器模式.类适配器;

// 被适配对象
public class Voltage220V {
    public int output220V() {
        System.out.println("额定电压220V");
        return 220;
    }
}

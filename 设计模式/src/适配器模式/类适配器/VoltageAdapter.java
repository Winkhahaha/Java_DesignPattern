package 适配器模式.类适配器;

// 适配器
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        // 在适配器中调用被适配类的方法
        int charge = output220V() / 44;
        return charge;
    }
}

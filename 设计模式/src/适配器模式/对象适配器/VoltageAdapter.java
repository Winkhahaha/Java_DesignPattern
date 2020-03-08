package 适配器模式.对象适配器;

// 适配器
public class VoltageAdapter implements Voltage5V {
    // 聚合
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int charge = 0;
        if (voltage220V != null) {
            charge = voltage220V.output220V() / 44;
        }
        return charge;
    }
}

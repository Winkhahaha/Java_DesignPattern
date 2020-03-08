package 桥接模式;

public class BBrand implements Brand {
    @Override
    public void call() {
        System.out.println("B手机打电话");
    }
}

package 桥接模式;

public class ABrand implements Brand {
    @Override
    public void call() {
        System.out.println("A手机打电话");
    }
}

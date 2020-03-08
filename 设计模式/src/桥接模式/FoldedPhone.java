package 桥接模式;

// 折叠手机
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式");
    }
}

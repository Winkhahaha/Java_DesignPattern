package 桥接模式;

// 折叠手机
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }
    public void call(){
        super.call();
        System.out.println("直板样式");
    }
}

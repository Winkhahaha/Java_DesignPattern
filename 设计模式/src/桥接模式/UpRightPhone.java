package 桥接模式;

// 直板手机
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }
    public void call(){
        System.out.print("直板样式-->");
        super.call();
    }
}

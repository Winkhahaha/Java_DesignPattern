package 桥接模式;

public abstract class Phone {
    // 聚合
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call(){
        brand.call();
    }
}

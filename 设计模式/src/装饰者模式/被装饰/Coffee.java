package 装饰者模式.被装饰;

public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}

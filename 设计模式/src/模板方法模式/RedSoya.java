package 模板方法模式;

public class RedSoya extends Soya{
    @Override
    void addCondiments() {
        System.out.println("第二步:加红豆");
    }
}

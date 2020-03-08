package 模板方法模式.improve;

public class OrdinarySoya extends Soya {
    @Override
    void addCondiments() {
        // 空实现
    }

    // 重写钩子方法,修改返回值,不加配料
    @Override
    boolean isAdd() {
        return false;
    }
}

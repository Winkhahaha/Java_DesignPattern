package 模板方法模式.improve;

public abstract class Soya {
    // 模板方法,可以做成final,不让子类覆盖
    final void make() {
        select();
        if (isAdd()){       // 需要加配料再加
            addCondiments();
        }
        soak();
        beat();
    }

    // 选材料
    void select() {
        System.out.println("第一步,选择黄豆");
    }

    // 添加不同配料
    abstract void addCondiments();

    // 浸泡
    void soak() {
        System.out.println("第三步,黄豆和配料开始浸泡");
    }

    // 打汁
    void beat() {
        System.out.println("第四步,打汁");
    }

    // 钩子方法:决定是否添加配料
    // 若不需要加配料,在子类中重写该方法,返回false即可
    boolean isAdd() {
        return true;    // 默认加配料
    }
}

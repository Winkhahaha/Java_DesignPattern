package 状态模式;

/**
 * 奖品发放完状态
 * 当成为该状态,则活动结束
 * @author Administrator
 *
 */
public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("活动结束!");
    }

    @Override
    public boolean raffle() {
        System.out.println("活动结束!");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("活动结束!");
    }
}

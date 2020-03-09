package 状态模式;

/**
 * 不能抽奖的状态
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

	 // 初始化引入活动,扣除奖券钱改变状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 当前状态可以扣奖券,扣除后,将状态设置为可以抽奖
    @Override
    public void deductMoney() {
        System.out.println("支付奖券成功,您可以进行一次抽奖");
        activity.setState(activity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("请先支付奖券再进行抽奖!");
        return false;
    }

    // 当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}

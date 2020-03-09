package 状态模式;

/**
 * 发放奖品状态
 * @author Administrator
 *
 */
public class DispenseState extends State {

	 // 聚合活动,发放奖品后改变状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    
    //

    @Override
    public void deductMoney() {
        System.out.println("不能扣除奖券");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    // 发放奖品
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("这是你的奖品:$$$");
            // 改变状态到未支付奖券
            activity.setState(activity.getNoRafflleState());
        }else{
            System.out.println("奖品发放完了,稍等...");
            // 若奖品发送完,将状态设置为不可再抽奖
            //activity.setState(activity.getDispensOutState());
            System.out.println("活动结束!");
            // 直接退出程序
            System.exit(0);
        }

    }
}

package 状态模式;

import java.util.Random;

/**
 * 可以抽奖的状态
 *
 * @author Administrator
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 奖券已经支付
    @Override
    public void deductMoney() {
        System.out.println("奖券支付成功!");
    }

    // 可以抽奖,根据抽奖结果改变状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖...");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%中奖概率
        if (num == 0) {
            // 改变状态为发放奖品,返回中奖true
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("谢谢参与!");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    // 不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖!不能发放!");
    }
}

package 状态模式;

/**
 * @author Administrator
 */
public class ClientTest {

    public static void main(String[] args) {
        // 创建活动
        RaffleActivity activity = new RaffleActivity(1);

        // 连续抽奖30次
        for (int i = 0; i < 10; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖,第一步扣除奖券
            activity.debuctMoney();
            // 第二步抽奖
            activity.raffle();
        }
    }

}

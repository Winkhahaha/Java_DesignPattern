package 状态模式;

/**
 * 抽象状态类
 * @author Administrator
 *
 */
public abstract class State {

	
	// 扣除奖券费用
    public abstract void deductMoney();

    // 是否中奖
    public abstract boolean raffle();

    // 如果中奖,发放奖品
    public abstract  void dispensePrize();

}

package 状态模式;

/**
 * 抽奖活动
 *
 * @author Administrator
 */
public class RaffleActivity {

    // state:表示活动当前的状态,持续变化
    State state = null;
    // 奖品数量
    int count = 0;

    // 活动的四种状态
    State noRafflleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispensOutState = new DispenseOutState(this);

    // 初始化为不能抽奖状态(为支付奖券)
    public RaffleActivity(int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    // 扣除奖券
    public void debuctMoney() {
        state.deductMoney();
    }

    // 抽奖
    public void raffle() {
        // 如果当前状态抽奖成功
        if (state.raffle()) {
            // 领取奖品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // 每领取一次奖品,其数量要减少
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}

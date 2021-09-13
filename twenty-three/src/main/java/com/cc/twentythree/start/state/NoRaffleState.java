package com.cc.twentythree.start.state;

/**
 * @author Administrator
 * 起始状态，不能抽象的状态
 */
public class NoRaffleState extends State {

	 // 其实状态引入活动，在扣除积分后，状态发生改变
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以开始抽奖了");
        //扣除积分成功，将状态更改为可以抽奖的状态
        activity.setState(activity.getCanRaffleState());
    }
    //初始状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣除积分才可以抽价格");
        return false;
    }
    //初始状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("当前状态不能发放奖品");
    }
}

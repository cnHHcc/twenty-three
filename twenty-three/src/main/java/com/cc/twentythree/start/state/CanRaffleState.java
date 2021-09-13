package com.cc.twentythree.start.state;

import java.util.Random;

/**
 * @author Administrator
 * 可以抽奖的状态
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣过积分了");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等");
        Random r = new Random();
        //生成一个随机的0-10的数
        int num = r.nextInt(10);
        // 模拟10%的中奖率
        if(num == 0){
            // 中奖后，将状态改为可以领奖
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("抱歉，未中奖");
            // 没有中奖，状态回到初始状态
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }
    //抽奖状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品");
    }
}

package com.cc.twentythree.start.state;

/**
 * @author Administrator
 * 奖品发放完毕状态
 */
public class DispenseOutState extends State {

	// ��ʼ��ʱ��������
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("奖品发放完毕，欢迎下次再来");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完毕，欢迎下次再来");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完毕，欢迎下次再来");
    }
}

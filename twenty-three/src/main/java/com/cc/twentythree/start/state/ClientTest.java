package com.cc.twentythree.start.state;

/**
 * ״̬ģʽ������
 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创一个奖品只有一个的活动
        RaffleActivity activity = new RaffleActivity(1);

        // �������������ν�
        for (int i = 0; i < 300; i++) {
            System.out.println("第" + (i + 1) + "次抽奖开始");
            // 第一步扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();
        }
	}

}

package com.cc.twentythree.start.state;

import com.cc.twentythree.start.state.CanRaffleState;
import com.cc.twentythree.start.state.DispenseOutState;
import com.cc.twentythree.start.state.DispenseState;
import com.cc.twentythree.start.state.NoRaffleState;
import lombok.Data;

/**
 * 活动类
 * @author Administrator
 */
@Data
public class RaffleActivity {
    //当前状态
    State state = null  ;
    //奖品数量
    int count = 0;
    //初始状态
    State noRafflleState = new NoRaffleState(this);
    //可以抽奖状态
    State canRaffleState = new CanRaffleState(this);
    //奖品发放状态
    State dispenseState =   new DispenseState(this);
    //奖品发完状态
    State dispensOutState = new DispenseOutState(this);
    //构造器
    public RaffleActivity( int count) {
        //设置为初始状态
        this.state = getNoRafflleState();
        //初始化奖品数量，参数传入
        this.count = count;
    }
    //扣分
    public void debuctMoney(){
        state.deductMoney();
    }
    //抽奖
    public void raffle(){
        //调用抽奖方法，并根据返回值判断是否中奖，中奖的话继续调用发放奖品的方法
        if(state.raffle()){
            state.dispensePrize();
        }
    }
    //当走到方法dispensePrize时，就会调用一次获取奖品数量的方法，没调一次，奖品数量减一
    public int getCount() {
    	int curCount = count;
    	count--;
        return curCount;
    }

}

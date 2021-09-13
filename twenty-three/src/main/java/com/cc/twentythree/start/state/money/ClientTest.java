package com.cc.twentythree.start.state.money;

/**������*/
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建上下文对象
		Context context = new Context();
        //将当前状态设置成PublishState
		context.setState(new PublishState());
        System.out.println(context.getCurrentState());
        
//        //publish --> not pay
        context.acceptOrderEvent(context);
//        //not pay --> paid
        context.payOrderEvent(context);
//        // ʧ��, ���ʧ��ʱ�����׳��쳣
//        try {
//        	context.checkFailEvent(context);
//        	System.out.println("��������..");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
        
	}

}

package com.cc.twentythree.start.mediator.smarthouse;

/**
 * 具体的同事嘞（闹钟）
 */
public class Alarm extends Colleague {
	/**
	 * 构造器
	 * @param mediator
	 * @param name
	 */
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//在创建Alarm的同时，将自己放到ConcreteMediator对象中的集合里，进行注册
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		//调用的中介者的getMessage方法
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}

package com.cc.twentythree.start.mediator.smarthouse;

/**
 * 中介者抽象类
 */
public abstract class Mediator {
	//将终结者对象加入到集合中
	public abstract void Register(String colleagueName, Colleague colleague);
	//接收一个具体的同事对象发来的消息
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}

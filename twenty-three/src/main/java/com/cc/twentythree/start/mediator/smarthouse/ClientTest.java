package com.cc.twentythree.start.mediator.smarthouse;

public class ClientTest {

	public static void main(String[] args) {
		//创建一个中介者具体实现对象
		Mediator mediator = new ConcreteMediator();
		//创建一个Alarm，并将Alarm放入ConcreteMediator的集合中，完成注册
		Alarm alarm = new Alarm(mediator, "alarm");
		//创建一个CoffeeMachine，并将CoffeeMachine放入ConcreteMediator的集合中，完成注册
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");
		//创建一个Curtains，并将CCurtains放入ConcreteMediator的集合中，完成注册
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tV = new TV(mediator, "TV");
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}

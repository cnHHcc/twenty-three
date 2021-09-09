package com.cc.twentythree.start.command;

import com.baomidou.mybatisplus.extension.api.R;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 19:09
 */
public class Client {
    public static void main(String[] args) {
        //第一步：创建电灯命令执行者
        LightReceiver lightReceiver = new LightReceiver();
        //第二部：创建电灯开命令接收者
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        //第三步：创建电灯关命令接收者
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //第四步：创建遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器加入操作命令，假定0行代表控制电灯的开、关两个按钮
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println("-----开灯命令来了----");
        remoteController.pushOpen(0);
        System.out.println("-----关灯命令来了----");
        remoteController.pushClose(0);
        System.out.println("-----撤销命令来了----");
        remoteController.pushUndo();



    }
}

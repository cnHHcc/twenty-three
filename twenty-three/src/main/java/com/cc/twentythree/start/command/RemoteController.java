package com.cc.twentythree.start.command;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 18:52
 */
public class RemoteController {
    /**
     * 存放开操作命令的数组
     */
    private Command[] onCommands;
    /**
     * 存放关操作命令的数组
     */
    private Command[] offCommands;
    /**
     * 存放撤回命令
     */
    private Command undoCommand;
    /**
     * 命令数组
     */
    private Command[] tvCommands;

    /**
     * 空构造器初始化参数
     */
    public RemoteController() {
        //根据笔记里的图，遥控器一共可以控制5个家电，每个家电有开、关两个按钮，也就是开、关数组各有5个
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            //将开关数组分别初始化为没有命令的实体
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        this.undoCommand = new NoCommand();
        
        //电视尝试将OnCommand和offCommand写一起
        this.tvCommands = new Command[10];
        for (int i = 0; i < 10; i++) {
            tvCommands[i] = new NoCommand();
        }
    }

    /**
     * 给按钮设置需要的命令
     */
    public void setCommand (int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }
    /**
     * 根据笔记中的图，no==0时，说明时对电灯的开关 no==1时，说明是对电视的开关
     */
    public void pushOpen (int no){
        //让对应的家电执行开命令
        onCommands[no].execute();
        //由于考虑到撤销，而撤销应该是撤销的上一次操作的命令，所以，将这次命令赋值给撤销命令
        undoCommand = onCommands[no];
    }
    public void pushClose (int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }
    public void pushUndo (){
        //上面每一个操作，都会将操作赋值于undoCommand，这里就可以直接用undoCommand去调用撤销方法即可
        undoCommand.undo();
    }
}

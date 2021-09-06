package com.cc.twentythree.principle.inversion.improve;

/**
 * 依赖倒转的三种方式
 * 通过接口
 * 通过构造器
 * 通过setter
 */
public class DependencyPass {

    public static void main(String[] args) {
        //方式一使用
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);
        //方式二使用
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();
        //方式三使用
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }

}

// 1.通过接口传递实现依赖
// 开关的接口
//interface IOpenAndClose {
//    public void open(ITV tv); //抽象方法，接受接口
//}
////ITV接口
//interface ITV { //ITV�ӿ�
//    public void play();
//}
// 2.通过构造方法依赖传递
//interface IOpenAndClose {
//    public void open(); //抽象方法
//}
//
//interface ITV { //ITV接口
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) {//构造器
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}
//class ChangHong implements ITV{
//    @Override
//    public void play() {
//        System.out.println("长虹电视打开");
//    }
//}
// 3.通过setter方法传递
interface IOpenAndClose {
    public void open(); // ���󷽷�

    public void setTv(ITV tv);
}

interface ITV { // ITV�ӿ�
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视打开");
    }
}
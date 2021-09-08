package com.cc.twentythree.start.bridge;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 15:26
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
        Phone phone2 = new FoldedPhone((new Vivo()));
        phone2.open();
        phone2.call();
        phone2.close();
        Phone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();
    }
}

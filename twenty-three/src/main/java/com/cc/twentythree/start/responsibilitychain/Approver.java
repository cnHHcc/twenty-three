package com.cc.twentythree.start.responsibilitychain;

import lombok.Data;

/**
 * @author cc
 * @date 2021/9/13 22:08
 * 执行者抽象类
 */
@Data
public abstract class Approver {
    public Approver approver;
    public String name;

    public Approver(String name) {
        this.name = name;
    }
    //set方法，用于传递下一个执行者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }
    //处理请求的抽象方法，供子类具体实现，参数位一个具体的请求
    public abstract void processRequest (PurchaseRequest purchaseRequest);
}

package com.cc.twentythree.start.responsibilitychain;

import lombok.Data;

/**
 * @author cc
 * @date 2021/9/13 22:10
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=5000){
            System.out.println(purchaseRequest.getId()+"被"+this.getName()+"处理了");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}

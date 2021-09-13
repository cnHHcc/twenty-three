package com.cc.twentythree.start.responsibilitychain;

/**
 * @author cc
 * @date 2021/9/13 22:19
 */
public class SchoolMasterApprover extends Approver{

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000){
            System.out.println(purchaseRequest.getId()+"被"+this.getName()+"处理了");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}

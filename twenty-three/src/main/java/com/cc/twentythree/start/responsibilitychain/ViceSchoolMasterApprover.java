package com.cc.twentythree.start.responsibilitychain;

/**
 * @author cc
 * @date 2021/9/13 22:17
 */
public class ViceSchoolMasterApprover extends Approver{

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()>10000 && purchaseRequest.getPrice()<=30000){
            System.out.println(purchaseRequest.getId()+"被"+this.getName()+"处理了");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}

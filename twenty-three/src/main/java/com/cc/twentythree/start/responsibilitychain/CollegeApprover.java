package com.cc.twentythree.start.responsibilitychain;

/**
 * @author cc
 * @date 2021/9/13 22:14
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()>5000 && purchaseRequest.getPrice()<=10000){
            System.out.println(purchaseRequest.getId()+"被"+this.getName()+"处理了");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}

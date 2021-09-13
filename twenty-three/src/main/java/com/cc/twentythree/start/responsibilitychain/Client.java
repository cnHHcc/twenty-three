package com.cc.twentythree.start.responsibilitychain;

/**
 * @author cc
 * @date 2021/9/13 22:20
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 3, 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("吴院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("吕副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("陈校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}

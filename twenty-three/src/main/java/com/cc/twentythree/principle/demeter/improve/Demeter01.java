package com.cc.twentythree.principle.demeter.improve;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cc
 * @date 2021/9/6 21:25
 * 迪米特原则
 */
public class Demeter01 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 学校总部员工
 */
@Data
class Employee {
    private String id;
}

/**
 * 学院员工
 */
@Data
class CollegeEmployee {
    private String id;
}

/**
 * 管理学院员工的类
 */
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee (){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id="+i);
            list.add(emp);
        }
        return list;
    }
    /**
     * 把原来在SchoolManager类中的printAllEmployee方法下的非直接朋友代码放到这里来，单独弄一个方法
     * 因为CollegeManager是SchoolManager类的直接朋友
     */
    public void printAllEmployee (){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("_______分公司员工——————————");
        list1.forEach(l ->{
            System.out.println(l.getId());
        });
    }

}

/**
 * 学校员工管理类
 */
class SchoolManager {
    public List<Employee> getAllEmployee (){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id="+i);
            list.add(emp);
        }
        return list;
    }
    void printAllEmployee (CollegeManager sub){
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----------总部员工------------");
        list2.forEach(l ->{
            System.out.println(l.getId());
        });
        //这里直接调用CollegeManager中的方法即可
        sub.printAllEmployee();
    }
}
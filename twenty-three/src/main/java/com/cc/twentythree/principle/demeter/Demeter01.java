package com.cc.twentythree.principle.demeter;

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
            System.out.println(1);
        }
        return list;
    }
}

/**
 * 学校员工管理类
 * 直接朋友：B类是A类的成员变量、方法参数、返回值的任意一种，就说明B是A的直接朋友
 * 直接朋友类有：Employee,CollegeManager
 * CollegeEmployee以局部变量的形式出现的，不是直接朋友，违反了迪米特原则，此处需要改进
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
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("_______分公司员工——————————");
        list1.forEach(l ->{
            System.out.println(l.getId());
        });
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----------总部员工------------");
        list2.forEach(l ->{
            System.out.println(l.getId());
        });
    }
}
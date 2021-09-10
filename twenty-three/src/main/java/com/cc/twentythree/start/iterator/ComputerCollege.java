package com.cc.twentythree.start.iterator;

import lombok.Data;
import org.springframework.util.CompositeIterator;

import java.util.Iterator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 14:24
 * 计算机学院
 */
@Data
public class ComputerCollege implements College{

    private Department[] departments;

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("java","java专业");
        addDepartment("PHP","PHP专业");
        addDepartment("大数据","大数据专业");
    }

    /**
     * 当前数组的长度
     */
    private Integer lengthOfDepartments = 0;

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        departments[lengthOfDepartments] = new Department(name,des);
        lengthOfDepartments += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}

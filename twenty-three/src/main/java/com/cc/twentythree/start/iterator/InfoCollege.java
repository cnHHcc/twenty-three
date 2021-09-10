package com.cc.twentythree.start.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 14:41
 * 信息学院
 */
public class InfoCollege implements College {
    private List<Department> departments;

    public InfoCollege() {
        this.departments = new ArrayList<Department>(5);
        addDepartment("软件信息", "软件信息系");
        addDepartment("硬件信息", "硬件信息系");
        addDepartment("高达信息", "高达信息系");
    }

    @Override
    public String getName() {
        return "信息技术学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        departments.add(new Department(name, des));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}

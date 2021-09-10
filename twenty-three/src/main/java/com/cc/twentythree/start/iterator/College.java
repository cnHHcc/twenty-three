package com.cc.twentythree.start.iterator;

import java.util.Iterator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 14:22
 * 学院的接口
 */
public interface College {
    String getName();
    void addDepartment (String name,String des);
    Iterator<Department> createIterator ();
}

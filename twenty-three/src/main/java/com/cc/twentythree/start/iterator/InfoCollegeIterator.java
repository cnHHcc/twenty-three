package com.cc.twentythree.start.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 14:13
 * 信息工程学院迭代器 假设其下属的系都是以集合的形式存在的
 */
public class InfoCollegeIterator implements Iterator<Department> {
    private final List<Department> departments;
    private Integer startPosition = 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (startPosition >= departments.size() || departments.get(startPosition) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Department next() {
        Department department = departments.get(startPosition);
        startPosition += 1;
        return department;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}

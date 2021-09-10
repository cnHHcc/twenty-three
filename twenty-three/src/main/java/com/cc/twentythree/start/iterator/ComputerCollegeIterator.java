package com.cc.twentythree.start.iterator;

import java.util.Iterator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 14:04
 * 计算机学院迭代器，假设计算机学院下的系是以数组的形式存在的
 */
public class ComputerCollegeIterator implements Iterator<Department> {
    private final Department[] departments;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 遍历的起始位置
     */
    private int startPosition = 0;

    /**
     * 判断是否还有下一个元素
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (departments.length <= startPosition || departments[startPosition] == null) {
            return false;
        }
        return true;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public Department next() {
        Department department = departments[startPosition];
        startPosition += 1;
        return department;
    }
}

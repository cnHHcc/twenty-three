package com.cc.twentythree.start.composite;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 9:26
 */
public class Department extends OrgComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    //add和remove方法就不用重写了。也不需要聚合一个集合进来，因为这已经时最下级节点了（叶子节点）
    @Override
    public void print() {
        System.out.println(getName());
    }
}

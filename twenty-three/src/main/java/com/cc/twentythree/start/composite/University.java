package com.cc.twentythree.start.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 9:21
 */
public class University extends OrgComponent{
    //这个orgComponents存放的应该时College
    List<OrgComponent> orgComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println("---------"+getName()+"--------------");
        orgComponents.forEach(OrgComponent::print);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void add(OrgComponent o) {
        orgComponents.add(o);
    }

    @Override
    protected void remove(OrgComponent o) {
        orgComponents.remove(o);
    }

}

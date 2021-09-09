package com.cc.twentythree.start.composite;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 9:14
 * 机构抽象类：学校、学院、各系都是一个机构，继承机构抽象类
 */
@Data
public abstract class OrgComponent {

    private String name;
    private String des;

    protected void add (OrgComponent o){

    }
    protected void remove (OrgComponent o){

    }
    //这里将print设为抽象方法，就是让所有继承的类都必须重写
    public abstract void print ();

    public OrgComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }
}

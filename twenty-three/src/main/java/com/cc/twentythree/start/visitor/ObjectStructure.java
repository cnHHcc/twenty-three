package com.cc.twentythree.start.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 11:06
 * 数据结构，管理了很多的人
 */
public class ObjectStructure {
    private final List<Person> personList = new ArrayList<>();
    //添加
    public void attach (Person p){
        personList.add(p);
    }
    //删除
    public void detach (Person p){
        personList.remove(p);
    }
    //展示
    public void display (Action action){
        personList.forEach(person -> {
            person.accept(action);
        });
    }
}

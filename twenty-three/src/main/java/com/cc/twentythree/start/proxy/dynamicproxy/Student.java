package com.cc.twentythree.start.proxy.dynamicproxy;


/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 15:15
 */
public class Student implements TeacherInterface {
    @Override
    public void teach() {
        System.out.println("学生教书");
    }
}

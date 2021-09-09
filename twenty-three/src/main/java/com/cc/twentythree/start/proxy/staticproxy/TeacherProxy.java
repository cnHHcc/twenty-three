package com.cc.twentythree.start.proxy.staticproxy;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 15:01
 */
public class TeacherProxy implements TeacherInterface{
    private TeacherInterface teacherInterface;

    public TeacherProxy(TeacherInterface teacherInterface) {
        this.teacherInterface = teacherInterface;
    }

    @Override
    public void teach() {
        System.out.println("执行需要代理的逻辑");
        if (teacherInterface instanceof Teacher){
            boolean health = ((Teacher) teacherInterface).isHealth();
            if (health){
                teacherInterface.teach();
            } else {
                System.out.println("老师身体安康，不需要代理");
            }
        } else {
            System.out.println("不满足代理条件，不可以代理");
        }
        System.out.println("代理结束需要走的逻辑");
    }
}

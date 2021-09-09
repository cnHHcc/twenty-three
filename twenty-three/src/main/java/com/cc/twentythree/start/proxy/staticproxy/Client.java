package com.cc.twentythree.start.proxy.staticproxy;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 15:02
 */
public class Client {
    public static void main(String[] args) {
        TeacherProxy teacherProxy = new TeacherProxy(new Teacher(true));
        teacherProxy.teach();
        System.out.println("-------------------");
        TeacherProxy teacherProxy2 = new TeacherProxy(new Teacher(false));
        teacherProxy2.teach();
        System.out.println("-------------------");
        TeacherProxy teacherProxy1 = new TeacherProxy(new Student());
        teacherProxy1.teach();
    }
}

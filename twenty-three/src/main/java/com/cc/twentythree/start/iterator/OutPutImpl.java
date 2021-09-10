package com.cc.twentythree.start.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 14:47
 * 统一输出类
 */
public class OutPutImpl {
    private List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege (){
        colleges.forEach(c ->{
            System.out.println("========="+c.getName()+"=============");
            Iterator<Department> iterator = c.createIterator();
            this.printDepartment(iterator);
        });
    }
    public void printDepartment (Iterator<Department> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}

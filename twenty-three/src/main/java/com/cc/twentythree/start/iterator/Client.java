package com.cc.twentythree.start.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 14:54
 */
public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        colleges.add(new ComputerCollege());
        colleges.add(new InfoCollege());
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();

    }

}

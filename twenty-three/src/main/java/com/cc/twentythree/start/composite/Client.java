package com.cc.twentythree.start.composite;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 9:31
 */
public class Client {
    public static void main(String[] args) {
        //父类指向子类
        OrgComponent university = new University("清华","萝卜上的大学");

        OrgComponent college = new College("计算机学院", "强呀");
        College college1 = new College("经贸系", "厉害的呀");

        college.add(new Department("软件工程系","有点东西的呀"));
        college.add(new Department("大数据分析","猛呀"));
        college.add(new Department("人工智能","玄幻的呀"));
        college1.add(new Department("市场营销","凶呀"));
        college1.add(new Department("商务英语","秀呀"));
        college1.add(new Department("连锁贸易","牛呀"));

        university.add(college);
        university.add(college1);

        university.print();
        System.out.println("+++++++++++++++++++++++++");
        college.print();

    }
}

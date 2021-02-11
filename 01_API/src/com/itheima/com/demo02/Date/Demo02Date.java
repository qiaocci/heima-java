package com.itheima.com.demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
    带参数构造方法
     */
    private static void demo02() {
        long l = 1612857443751L;
        Date date = new Date(l);
        System.out.println(date);
        System.out.println(date.getTime()); // 日期转毫秒
    }

    /*
    Date类空参数构造方法
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }

}

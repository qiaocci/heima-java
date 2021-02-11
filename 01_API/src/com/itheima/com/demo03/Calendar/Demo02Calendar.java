package com.itheima.com.demo03.Calendar;

import java.util.Calendar;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
    set 方法
     */
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.MONTH));
        c.set(Calendar.MONTH, 2);
        System.out.println(c.get(Calendar.MONTH));
        c.set(9999, 1, 1);
        System.out.println(c.get(Calendar.YEAR));

    }

    /*
    get方法
     */
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)); // 月份从0开始
        System.out.println(c.get(Calendar.DATE));
    }

}

package com.itheima.com.demo02.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03DateFormat {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        String s = "2021-02-10 11:22:32";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(sdf.parse(s));
        } catch (ParseException e) {
            System.out.println("解析异常");
        }
    }

    /*
    DateFormat： 日期 --> 文本
     */
    private static void demo01() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

    }

}

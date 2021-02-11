package com.itheima.com.demo01.object;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * java.lang.Object: Object类是所有类的父类
 * */
public class Demo01ToString {
    public static void main(String[] args) {
        Person qiaocc = new Person("qiaocc", 29);
        String s = qiaocc.toString();
        System.out.println(s);

        // 直接打印对象名字，打印的就是地址值
//        System.out.println(s);

        // 一个类，是否重写了toString.只要看打印值是否是地址值
        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }

}

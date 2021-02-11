package com.itheima.com.demo01.object;

import java.sql.SQLOutput;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
        equals方法源码
        public boolean equals(Object obj) {
            return (this == obj);
        }
        对于基本数据类型:比较值
        对于引用数据类型：比较地址值
         */

        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("古力娜扎", 19);
        Person p3 = new Person("迪丽热巴", 18);

        System.out.println(p1.equals(p2));
//        p1 = p2;
//        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));

    }


}

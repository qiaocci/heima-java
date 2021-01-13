package cn.itcast.day07.demo04;


import java.util.Arrays;

/*
题目：
定义一个数组，用来存储3个Person对象。

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
public class Demo01Array {
    public static void main(String[] args) {
        String[] colors = {"red", "black", "orange"};
        int[] arr = new int[3];
        boolean[] boolArr = new boolean[]{true, false, true};

        arr[0] = 1;
        System.out.println(Arrays.toString(arr));
        System.out.println(colors);
        System.out.println(colors[0]);

        // 自定义对象的数组
        Person[] p = new Person[3];
        Person tom = new Person("tom", 22, true);
        Person jerry = new Person("jerry", 28, true);
        Person mary = new Person("mary", 21, false);

        p[0] = tom;
        p[1] = jerry;
        p[2] = mary;
        System.out.println(Arrays.toString(p));
        System.out.println(p[0]); // 地址值
        System.out.println(tom); // 相同的地址值
        System.out.println(p[0].getName());
    }

}

package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(10)); // 0-9
    }

}

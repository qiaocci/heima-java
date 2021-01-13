package cn.itcast.day07.demo04;

/*
生成6个1~33之间的随机整数,添加到集合,并遍历
 */

import java.util.ArrayList;
import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> rands = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            rands.add(r.nextInt(34) + 1);
        }
        System.out.println(rands);

        for (int rand : rands) {
            System.out.println(rand);
        }
    }

}

package cn.itcast.day07.demo04;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            bigList.add(r.nextInt(100));
        }

        System.out.println(bigList);
        System.out.println(getSmallList(bigList));
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> arr) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i : arr) {
            if (i % 2 == 0) {
                smallList.add(i);
            }
        }
        return smallList;
    }

}

package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for (int num : nums) {
            System.out.println(num);
        }
    }

}

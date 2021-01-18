package cn.itcase.day09.demo14;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int total, int count) {
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney();

        if (total > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        super.setMoney(leftMoney - total);

        int avg = total / count;
        int mod = total % count; // 余数, 剩下的零头,包在最后一个红包中

        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                redList.add(avg + mod);
            } else {
                redList.add(avg);
            }
        }
        return redList;
    }


}

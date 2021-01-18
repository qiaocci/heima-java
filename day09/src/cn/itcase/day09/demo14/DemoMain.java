package cn.itcase.day09.demo14;

import java.util.ArrayList;

public class DemoMain {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        ArrayList<Integer> arr = manager.send(10, 3);

        Member one = new Member("qiaocc", 0);
        Member two = new Member("tom", 0);
        Member three = new Member("jerry", 0);
        one.receive(arr);
        two.receive(arr);
        three.receive(arr);

        manager.show();
        one.show();
        two.show();
        three.show();
    }

}

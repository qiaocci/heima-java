package cn.itcast.day06.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        Student std = new Student();

        System.out.println(std.name); // null
        System.out.println(std.age); // 0

        std.name = "qiaocc";
        std.age = 18;
        System.out.println(std.name); // null
        System.out.println(std.age); // 0

        std.sleep();
    }

}

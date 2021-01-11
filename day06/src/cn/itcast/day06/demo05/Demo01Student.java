package cn.itcast.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("qiaocc");
        std.setAge(18);
        System.out.println("姓名:" +std.getName() + " 年龄：" + std.getAge());

        Student std2 = new Student("tom", 29);
        System.out.println("姓名:" +std2.getName() + " 年龄：" + std2.getAge());

    }


}

package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "qiaocc";
        p.setAge(18);
        System.out.println(p.getAge());
        p.show();
    }

}

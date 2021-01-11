package cn.itcast.day06.ex01;

public class Demo01Me {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "qiaocc";
        p.age = 29;
        p.salary = 3000;

        System.out.printf("%s, %s\n", p.name, p.age);
        System.out.println("hello");
        p.helloWho("tom");
    }


}

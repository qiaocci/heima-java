package cn.itcast.day08.demo04;
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
        Student two = new Student("黄蓉", 16);
        one.room = "301";
        System.out.println(one.getName() + one.getAge() + one.room + one.getId());
        System.out.println(two.getName() + two.getAge() + two.room +two.getId());

    }

}

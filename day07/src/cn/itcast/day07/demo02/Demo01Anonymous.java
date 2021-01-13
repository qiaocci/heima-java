package cn.itcast.day07.demo02;

/*
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称();
* */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person p = new Person("qiaocc", 21, true);
        System.out.println(p.name + p.age + p.isMale);

        new Person().name = "tom";
        System.out.println(new Person().getName()); // null
    }

}

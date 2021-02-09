package cn.itcast.day11.demo04;

/*
局部内部类: 一个类在方法内部使用
只有当前方法可以使用这个类, 出了这个方法就不能使用了.
 */
public class Demo01Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.methodOuter();
    }

}

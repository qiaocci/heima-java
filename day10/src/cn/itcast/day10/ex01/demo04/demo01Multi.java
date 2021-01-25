package cn.itcast.day10.ex01.demo04;

/*
多态： 父类引用指向子类对象

1. 父类名称 对象名 = new 子类名称();
2. 接口名称 对象名 = new 实现类名称();

 */


public class demo01Multi {

    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}

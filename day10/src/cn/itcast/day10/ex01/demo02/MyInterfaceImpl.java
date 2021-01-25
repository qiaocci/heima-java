package cn.itcast.day10.ex01.demo02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆盖重写的A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写的B方法");

    }

    @Override
    public void method() {
        System.out.println("覆盖重写AB共有的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写AB冲突的默认方法");

    }

}

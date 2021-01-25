package cn.itcast.day10.ex01.demo02;

public interface MyInterfaceB {

    public abstract void methodB();
    public abstract void method();
    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }

}

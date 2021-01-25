package cn.itcast.day10.ex01.demo02;

public interface MyInterfaceA {
//    static { // 接口不能有静态代码块
//
//    }

//    public MyInterfaceA(){} // 接口不能有构造方法

    public abstract void methodA();

    public abstract void method();

    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}

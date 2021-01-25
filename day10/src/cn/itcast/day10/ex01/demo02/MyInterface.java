package cn.itcast.day10.ex01.demo02;

public interface MyInterface {
    public default void method(){
        System.out.println("接口方法");
    }

}

package cn.itcast.day10.ex01.demo07;

public class Mouse implements UsbInterface{


    @Override
    public void open() {
        System.out.println("鼠标打开usb");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭usb");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}

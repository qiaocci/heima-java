package cn.itcast.day10.ex01.demo07;

public class Keyboard implements UsbInterface {


    @Override
    public void open() {
        System.out.println("键盘打开usb");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭usb");
    }

    public void type() {
        System.out.println("键盘敲击");
    }
}

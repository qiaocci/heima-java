package cn.itcast.day10.ex01.demo07;

public class Laptop implements UsbInterface {


    @Override
    public void open() {
        System.out.println("笔记本打开usb");
    }

    @Override
    public void close() {
        System.out.println("笔记本关闭usb");
    }

    public void powerOn() {
        System.out.println("笔记本开机");
    }

    public void powerOff() {
        System.out.println("笔记本关机");
    }

    public void useDevice(UsbInterface usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}

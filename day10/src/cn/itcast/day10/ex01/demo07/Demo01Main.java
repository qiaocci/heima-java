package cn.itcast.day10.ex01.demo07;

import java.awt.*;

public class Demo01Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

//        Mouse mouse = new Mouse();
        UsbInterface usb = new Mouse();
        laptop.useDevice(usb);

        Keyboard keybord = new Keyboard();
        laptop.useDevice(keybord); //发生了向上转型
        laptop.powerOff();
    }

}

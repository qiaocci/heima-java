package cn.itcast.day06.demo02;

public class Phone {
    String brand;
    double price;
    boolean isSale;


    public void call(String name) {
        System.out.printf("给%s发消息", name);
    }

    public void sendMsg() {
        System.out.println("发消息");
    }

}

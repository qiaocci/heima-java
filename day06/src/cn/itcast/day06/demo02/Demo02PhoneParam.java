package cn.itcast.day06.demo02;

public class Demo02PhoneParam {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "Apple";
        p.price = 6999.0;
        p.isSale = true;

        method(p);
    }

    public static void method(Phone param) {
        System.out.println(param.brand);
    }

}

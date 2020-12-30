package cn.itcast.day06.demo02;

public class Demo01PhoneOne {

    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.isSale);

        p.brand = "apple";
        p.price = 6999.0;
        p.isSale = true;

        p.call("乔布斯");

    }
}

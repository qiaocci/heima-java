package cn.itcast.day06.demo02;

public class Demo03PhoneReturn {
    public static void main(String[] args) {
        Phone myNewPhone = getPhone();
        System.out.println(myNewPhone.brand);
    }

    public static Phone getPhone() {
        Phone p = new Phone();
        p.brand = "Apple";
        p.price = 8909.0;
        p.isSale = false;
        return p;
    }

}

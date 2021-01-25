package cn.itcast.day10.ex01.demo06;

/*
对象向上转型,就是多态
 */
public class Demo01Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        Cat cat = (Cat) animal;
        cat.eat();
        cat.catchMouse();

        // 错误写法 ClassCastException 类转换异常
//        Dog dog = (Dog) animal;
//        dog.eat();

    }

}

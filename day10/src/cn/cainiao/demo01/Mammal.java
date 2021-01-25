package cn.cainiao.demo01;

public class Mammal implements Animal {

    @Override
    public void eat() {
        System.out.println("mammal eat");
    }

    @Override
    public void travel() {
        System.out.println("mammal travel");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.eat();
        m.travel();
    }
}

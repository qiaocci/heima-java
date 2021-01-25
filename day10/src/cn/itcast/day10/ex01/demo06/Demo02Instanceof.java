package cn.itcast.day10.ex01.demo06;


public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();

        }

        giveMePet(new Dog());
        giveMePet(new Cat());
    }
    public static void giveMePet(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

}

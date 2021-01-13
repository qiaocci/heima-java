package cn.itcast.day07.demo04;

public class Person {
    String name;
    int age;
    boolean isMale;

    public Person() {
    }

    ;

    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean isMale() {
        return isMale;
    }
}

package cn.itcast.day06.demo03;

public class Student {
    private String name;
    private int age;
    private boolean male;


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

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() { // boolean 要用isXXX
        return male;
    }
}

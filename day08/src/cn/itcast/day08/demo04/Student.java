package cn.itcast.day08.demo04;

public class Student {
    private int id; // 学号
    private String name;
    private int age;
    static String room; // 所在教室
    private static int idCounter = 0;

    public Student() {
        this.id = ++idCounter;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}

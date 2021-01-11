package cn.itcast.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("qiaocc");
        s.setAge(18);
        s.setMale(true);

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.isMale());
    }

}

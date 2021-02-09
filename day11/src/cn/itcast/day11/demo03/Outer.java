package cn.itcast.day11.demo03;

public class Outer {
    int num = 10;

    public class Inner {
        int num = 20;

        public void method() {
            int num = 30;
            System.out.println(num); // 30
            System.out.println(this.num); // 20
            System.out.println(Outer.this.num); // 10
        }
    }

}

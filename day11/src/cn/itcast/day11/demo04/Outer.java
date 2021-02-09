package cn.itcast.day11.demo04;

public class Outer {
    public void methodOuter(){
        class Inner{
            int num = 10;
            public void method(){
                System.out.println(num);
            }
        }

        new Inner().method();
    }

}

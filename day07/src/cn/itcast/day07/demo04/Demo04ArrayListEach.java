package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("black");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        for (String color : colors) {
            System.out.println(color);
        }

    }

}

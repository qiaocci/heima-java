package cn.itcast.generic;

public class Demo03GenericClass {
    public static void main(String[] args) {
        GenericClass<Integer> gc = new GenericClass<>();
        gc.setName(1);
        Object name = gc.getName();
        System.out.println(name);

        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setName("tom");
        String name2 = gc2.getName();
        System.out.println(name2.length());


    }

}

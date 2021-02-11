package cn.itcast.generic;

public class Demo05GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gm = new GenericInterfaceImpl();
        gm.method("字符串");

        GenericInterfaceImpl2<String> gm2 = new GenericInterfaceImpl2<>();
        gm2.method("字符串类型");

        GenericInterfaceImpl2<Integer> gm3 = new GenericInterfaceImpl2<>();
        gm3.method(1);
    }

}

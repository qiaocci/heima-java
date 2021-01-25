package cn.itcase.day10.demo01;

import java.util.zip.Deflater;

public class MyInterfaceDefaultImpl implements MyInterfaceDefault {


    @Override
    public void methodAbs() {
        System.out.println("接口抽象方法");
    }

    @Override
    public void methodDefault(){
        System.out.println("实现类中的默认方法！！");
    }
}

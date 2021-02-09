package com.imooc.test.demo01exception;

public class Demo01Try {
    public static void main(String[] args) {
        int one = 12;
        int two = 0;
        try {
            System.out.println(one / two);
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("出错啦");
            e.printStackTrace();
        } finally {
            System.out.println("运算结束");
        }
    }

}

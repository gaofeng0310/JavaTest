package com;

public class Parent  extends People{

    public void test11(){
        int a=222222;
        System.out.println("子类的test11："+a);
    }

    public static void main(String[] args) {
        People people=new Parent();
        people.test11();
        People people1=new People();
        people1.test11();
    }

}

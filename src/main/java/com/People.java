package com;

public class People {

    static String userName = "小明";
    static int num1;
    int num2;
    int num3;

    {//再执行普通代码块
        num2 = 99;
        System.out.println("通过初始块给变量 num2 赋值" + num2);
    }

    public People() {//最后执行构造方法
        num3 = 88;
        System.out.println("通过构造方法给 num3 赋值" + num3);

    }

    static {//最先被执行
        num1 = 100;
        System.out.println("通过静态初始块给静态成员变量 num1 赋值" + num1);
    }

    public void test11(){
        int a=22;
        System.out.println("父类的test11："+a);
    }


    public static void main(String[] args) {

//        People people = new People();
//        System.out.println(People.userName);//静态成员变量可以通过类直接访问

    }

}

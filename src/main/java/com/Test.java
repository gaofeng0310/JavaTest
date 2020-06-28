package com;

import java.util.Arrays;
import java.util.Iterator;

public class Test {


    public void test1(){
        int n=8;
        int sum = 1;
        for (int i = 1; i <=n; i++) {
            sum=sum*i;
        }
        System.out.println(sum);
    }






    public static void main(String[] args) {
        Test test=new Test();
        test.test1();
    }

}

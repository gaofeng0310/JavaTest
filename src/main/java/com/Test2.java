package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Test2 {

    ArrayList<String> strList = new ArrayList<String>();

    public void aaa() {
        strList.add("aaaa");
        strList.add("qqq");
        strList.add("sdf");
        for (int i = 0; i < strList.size(); i++) {
            String string = strList.get(i);
            System.out.println(string);
        }
    }


    public void bbb() {
        strList.add("aaaa");
        strList.add("qqq");
        strList.add("sdf");
        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }

    }


    public void ccc() {
        strList.add("aaaa");
        strList.add("qqq");
        strList.add("sdf");
        for (Object str : strList) {
            System.out.println(str);
        }

    }


    public void maopao() {
        int[] arr={5,4,3,2,1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
              System.out.println(Arrays.toString(arr));
        }
    }

    public void jiecheng() {
        int n=8;
        int num = 1;
        for (int i=1;i<=n;i++){
            num =num * i;
            System.out.println(num);
        }
      
    }


    public static void main(String[] args) {

        Test2 test2 = new Test2();
//        test2.aaa();
        test2.bbb();
//        test2.ccc();

//        test2.maopao();
//
//        test2.jiecheng();
    }
}

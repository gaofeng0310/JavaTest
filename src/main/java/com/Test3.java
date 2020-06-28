package com;

import java.security.Key;
import java.util.*;

public class Test3 {


    public void test1() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");

        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        for (String str:arrayList){
            System.out.println(str);
        }
        Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            String str= iterator.next();
            System.out.println(str);
        }
    }

    public void test2() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        //通过keySet 取值
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        //通过 values取值
        for (String val : map.values()) {
            System.out.println(val);
        }
        //通过 enterSet 取值
        for (Map.Entry<String, String> maps : map.entrySet()) {
            System.out.println(maps.getKey() + ":" + maps.getValue());
        }
        //通过 Iterator 取值
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> maps = iterator.next();
            System.out.println(maps.getKey() + ":" + maps.getValue());
        }
    }

    public void test3() {
        int num = 1;
        String str = "111";
        //int 转 string
        int num1 = Integer.valueOf(str);
        int num2 = Integer.parseInt(str);
        //string 转 int
        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);
        String str3 = num + "";
    }

    public void test4() {
        int[] arr = {5, 4, 43, 2, 21, 134};
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


    public void digui() {
        int n = 8;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = num * i;//5*4*3*2*1
            System.out.println(num);
        }
    }



    public void test5(){
        int[] intArr={1,2,3,4,5};
        String[] strArr={"aaa","sss","ddd","fff"};
        for (int num:intArr){
            System.out.println(num);
        }
        for (String str:strArr){
            System.out.println(str);
        }
        //-----数组值总和
        int sum=0;
        for (int i=0;i<intArr.length;i++){
            sum=sum+intArr[i];
        }
        System.out.println(sum);
        //-----查找数据中最大值
        int max=intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]>max){
                max=intArr[i];
            }

        }
        System.out.println(max);
    }




    public static void main(String[] args) {
        Test3 test3 = new Test3();
//        test3.test1();
//        test3.test2();
//        test3.test3();
//        test3.test4();
//        test3.digui();
        test3.test5();

    }


}
